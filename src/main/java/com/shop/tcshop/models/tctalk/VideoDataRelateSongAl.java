package com.shop.tcshop.models.tctalk;

import java.util.List;

public class VideoDataRelateSongAl {
   private int  id;
   private String  name;
   private String  picUrl;
   private List<String> tns;
   private int  pic;

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

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }
}
