package com.hamdan.warpin.repository;

import com.hamdan.warpin.dto.request.MessageReqDto;

import java.util.ArrayList;
import java.util.List;

public interface MessagesRepo {
    List<MessageReqDto> MESSAGES = new ArrayList<>();

    void addMessage(MessageReqDto messageReqDto);

    List<MessageReqDto> getAllMessages();
}
