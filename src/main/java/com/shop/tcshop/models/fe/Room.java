package com.shop.tcshop.models.fe;

import java.util.Date;

public class Room {
    private int parentAreaId;
    private String parentAreaName;
    private int areaId;
    private String areaName;
    private int uId;
    private String uname;
    private String face;
    private String description;
    private Date liveTime;
    private String title;
    private int roomid;
    private int room_id;
    private boolean online;
    private String user_cover;

    public Room(int parentAreaId, String parentAreaName, int areaId, String areaName, int uId, String uname, String face, String description, Date liveTime, String title, int roomid, boolean online, String user_cover) {
        this.parentAreaId = parentAreaId;
        this.parentAreaName = parentAreaName;
        this.areaId = areaId;
        this.areaName = areaName;
        this.uId = uId;
        this.uname = uname;
        this.face = face;
        this.description = description;
        this.liveTime = liveTime;
        this.title = title;
        this.roomid = roomid;
        this.room_id = roomid;
        this.online = online;
        this.user_cover = user_cover;
    }

    public int getParentAreaId() {
        return parentAreaId;
    }

    public void setParentAreaId(int parentAreaId) {
        this.parentAreaId = parentAreaId;
    }

    public String getParentAreaName() {
        return parentAreaName;
    }

    public void setParentAreaName(String parentAreaName) {
        this.parentAreaName = parentAreaName;
    }

    public int getAreaId() {
        return areaId;
    }

    public void setAreaId(int areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getLiveTime() {
        return liveTime;
    }

    public void setLiveTime(Date liveTime) {
        this.liveTime = liveTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRoomid() {
        return roomid;
    }

    public void setRoomid(int roomid) {
        this.roomid = roomid;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public String getUser_cover() {
        return user_cover;
    }

    public void setUser_cover(String user_cover) {
        this.user_cover = user_cover;
    }

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }
}
