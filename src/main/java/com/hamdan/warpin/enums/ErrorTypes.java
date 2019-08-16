package com.hamdan.warpin.enums;

public enum ErrorTypes {
    SUCCESS(0, "Success");

    private long code;
    private String description;

    ErrorTypes(long code, String description) {
        this.code = code;
        this.description = description;
    }

    public long getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
