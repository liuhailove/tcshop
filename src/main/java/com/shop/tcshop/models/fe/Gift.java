package com.shop.tcshop.models.fe;

public class Gift {
    private Integer id;
    private String msg;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Gift(Integer id, String msg) {
        this.id = id;
        this.msg = msg;
    }
}
