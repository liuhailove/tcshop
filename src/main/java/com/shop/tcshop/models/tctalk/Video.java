package com.shop.tcshop.models.tctalk;

public class Video {
    private int id;
    private int type;
    private boolean displayed;
    private String alg;
    private String extAlg;
    private VideoData data;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public boolean isDisplayed() {
        return displayed;
    }

    public void setDisplayed(boolean displayed) {
        this.displayed = displayed;
    }

    public String getAlg() {
        return alg;
    }

    public void setAlg(String alg) {
        this.alg = alg;
    }

    public String getExtAlg() {
        return extAlg;
    }

    public void setExtAlg(String extAlg) {
        this.extAlg = extAlg;
    }

    public VideoData getData() {
        return data;
    }

    public void setData(VideoData data) {
        this.data = data;
    }

}
