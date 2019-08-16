package com.hamdan.warpin.controller.web;

import com.hamdan.warpin.dto.ChatDto;
import com.hamdan.warpin.dto.ContentDto;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class ChatController {
    @MessageMapping("/chat")
    @SendTo("/topic/messages")
    public ContentDto greeting(ChatDto message) throws Exception {
        Thread.sleep(1000);
        return new ContentDto(HtmlUtils.htmlEscape(message.getMessage()));
    }
}
