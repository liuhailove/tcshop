package com.shop.tcshop.models.tctalk;

public class PersonalizedPrivateContent {
    private int id;
    private String url;
    private String picUrl;
    private String sPicUrl;
    private int type;
    private String copywriter;
    private String name;
    private long time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getsPicUrl() {
        return sPicUrl;
    }

    public void setsPicUrl(String sPicUrl) {
        this.sPicUrl = sPicUrl;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getCopywriter() {
        return copywriter;
    }

    public void setCopywriter(String copywriter) {
        this.copywriter = copywriter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
