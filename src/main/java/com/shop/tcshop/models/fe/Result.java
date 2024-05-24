package com.shop.tcshop.models.fe;

public class Result<T> {
    private String code;
    private T data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Result(String code, T data) {
        this.code = code;
        this.data = data;
    }
}
