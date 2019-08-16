package com.hamdan.warpin.repository;

import com.hamdan.warpin.dto.request.MessageReqDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessagesRepoImpl implements MessagesRepo {

    @Override
    public void addMessage(MessageReqDto messageReqDto) {
        MESSAGES.add(messageReqDto);
    }

    @Override
    public List<MessageReqDto> getAllMessages() {
        return MESSAGES;
    }
}
