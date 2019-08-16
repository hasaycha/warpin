package com.hamdan.warpin.dto.request;

import com.hamdan.warpin.dto.base.BaseDto;

import javax.validation.constraints.NotBlank;

public class MessageReqDto extends BaseDto {
    private static final long serialVersionUID = -6881507414742908535L;

    @NotBlank(message = "message tidak boleh kosong atau hanya spasi")
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
