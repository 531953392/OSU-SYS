package com.ruoyi.common.core.domain;

public class Result {

    int StatusCode;

    boolean Status;

    String Message;

    public Result() {

    }
    public Result(int statusCode, boolean status, String message) {
        super();
        StatusCode = statusCode;
        Status = status;
        Message = message;
    }

    public int getStatusCode() {
        return StatusCode;
    }

    public void setStatusCode(int statusCode) {
        StatusCode = statusCode;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }
}
