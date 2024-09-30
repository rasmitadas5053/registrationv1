package com.api.payload;

import lombok.Data;

import java.util.Date;

public class ErrorDto
{
    private String meassage;
    private Date date;
    private String uri;

    public ErrorDto(String meassage, Date date, String uri) {
        this.meassage = meassage;
        this.date = date;
        this.uri = uri;
    }

    public String getMeassage() {
        return meassage;
    }

    public Date getDate() {
        return date;
    }

    public String getUri() {
        return uri;
    }
}
