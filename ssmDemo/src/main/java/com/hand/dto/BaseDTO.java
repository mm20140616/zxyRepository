package com.hand.dto;


public class BaseDTO {
    private String __status;//加下划线之后前台直接识别
    private String message;

    public String get__status() {
        return __status;
    }

    public void set__status(String __status) {
        this.__status = __status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
