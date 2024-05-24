package com.shop.tcshop.models.fe;

public class Partition {
    private int id;
    private String typename;
    private int tid;

    public Partition(int id, String typename, int tid) {
        this.id = id;
        this.typename = typename;
        this.tid = tid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }
}
