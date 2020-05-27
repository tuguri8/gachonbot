package com.bot.gachon.service;

import com.bot.gachon.dto.req.BotRequest;
import com.bot.gachon.dto.res.ScheduleReponse;
import com.bot.gachon.url.Url;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Calendar;

@Slf4j
@Service
public class Schedule {

    public ScheduleReponse getSchedulInfo(BotRequest botRequest) throws IOException {

        Document doc = Jsoup.connect(Url.SCHEDULE).get();
        Elements e = doc.getElementsByTag("toggle-view");
        String image ="https://s3.ap-northeast-2.amazonaws.com/gachonbot/vision.png";
        Calendar cal = Calendar.getInstance();
        int dayofMonth = cal.get(Calendar.MONTH)+1 ;

        String content = "";

        for (Element child : e.get(0).children()) {
            if ((child.getElementsByTag("a").text()).indexOf(dayofMonth) != -1) {
                content += child.getElementById("div").text();
            }
        }
        return ScheduleReponse.builder().image(image).content(content).build();
    }
}
