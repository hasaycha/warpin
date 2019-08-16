package com.hamdan.warpin.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.hamdan.warpin.dto.base.BaseDto;
import com.hamdan.warpin.dto.request.MessageReqDto;

import java.util.List;

public class MessageRespDto extends BaseDto {
    private static final long serialVersionUID = -4171656084585024740L;

    private long code;
    private String description;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<MessageReqDto> items;

    public MessageRespDto(long code, String description, List<MessageReqDto> items) {
        this.code = code;
        this.description = description;
        this.items = items;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<MessageReqDto> getItems() {
        return items;
    }

    public void setItems(List<MessageReqDto> items) {
        this.items = items;
    }
}
