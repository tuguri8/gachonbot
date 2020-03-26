package com.bot.gachon.service;

import com.bot.gachon.dto.req.BotRequest;
import com.bot.gachon.dto.res.TextReplyResponse;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class BotService {
    public TextReplyResponse echo(BotRequest botRequest) {
        String utternace = botRequest.getUserRequest().getUtterance();
        TextReplyResponse.Content content = TextReplyResponse.Content.builder()
                                                                     .type("text")
                                                                     .text(utternace)
                                                                     .build();
        return TextReplyResponse.builder()
                                .contents(Collections.singletonList(content))
                                .build();
    }
}