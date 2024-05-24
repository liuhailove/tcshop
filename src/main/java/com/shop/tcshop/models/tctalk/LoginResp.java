package com.shop.tcshop.models.tctalk;

public class LoginResp {
    private int code;
    private String cookie;
    private String token;

    public LoginResp(int code, String cookie, String token) {
        this.code = code;
        this.cookie = cookie;
        this.token = token;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
