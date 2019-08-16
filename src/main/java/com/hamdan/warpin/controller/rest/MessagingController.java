package com.hamdan.warpin.controller.rest;

import com.hamdan.warpin.dto.request.MessageReqDto;
import com.hamdan.warpin.dto.response.MessageRespDto;
import com.hamdan.warpin.enums.ErrorTypes;
import com.hamdan.warpin.repository.MessagesRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class MessagingController {

    private final MessagesRepo messagesRepo;

    public MessagingController(MessagesRepo messagesRepo) {
        this.messagesRepo = messagesRepo;
    }

    @PostMapping("/message")
    public ResponseEntity<MessageRespDto> sendMsg(@RequestBody @Valid MessageReqDto messageReqDto) {
        messagesRepo.addMessage(messageReqDto);
        return new ResponseEntity<>(new MessageRespDto(ErrorTypes.SUCCESS.getCode(), ErrorTypes.SUCCESS.getDescription(), null), HttpStatus.CREATED);
    }

    @GetMapping("/message")
    public ResponseEntity<MessageRespDto> retrieveAllMsg() {
        return new ResponseEntity<>(new MessageRespDto(ErrorTypes.SUCCESS.getCode(), ErrorTypes.SUCCESS.getDescription(), messagesRepo.getAllMessages()), HttpStatus.OK);
    }
}
