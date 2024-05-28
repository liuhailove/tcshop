package com.shop.tcshop.models.tctalk;

import java.util.List;

public class PlayListDetailTracksAl {
    private  int id;
    private String name;
    private  String picUrl;
    private List<String> tns;
    private String pic_str;
    private  int pic;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public List<String> getTns() {
        return tns;
    }

    public void setTns(List<String> tns) {
        this.tns = tns;
    }

    public String getPic_str() {
        return pic_str;
    }

    public void setPic_str(String pic_str) {
        this.pic_str = pic_str;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }
}
