package com.hamdan.warpin.dto;

public class ChatDto {
    private String message;

    public ChatDto() {
    }

    public ChatDto(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
