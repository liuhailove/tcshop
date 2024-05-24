package com.shop.tcshop.models.fe;

public class Live {
    private String title;
    private Integer roomid;
    private Integer online;
    private String cover;
    private String force;

    private int id;

    public Live(int id, String title, Integer roomid, Integer online, String cover, String force) {
        this.title = title;
        this.roomid = roomid;
        this.online = online;
        this.cover = cover;
        this.force = force;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public Integer getOnline() {
        return online;
    }

    public void setOnline(Integer online) {
        this.online = online;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getForce() {
        return force;
    }

    public void setForce(String force) {
        this.force = force;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
