package com.shop.tcshop.models.tctalk;

public class PersonalizedNewSong {
    private int id;
    private int type;
    private String name;
    private String picUrl;
    private boolean canDislike;
    private PNSSong song;
    private String alg;

    public PersonalizedNewSong(int id, int type, String name, String picUrl, boolean canDislike, PNSSong song, String alg) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.picUrl = picUrl;
        this.canDislike = canDislike;
        this.song = song;
        this.alg = alg;
    }

    public PersonalizedNewSong() {
    }

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

    public boolean isCanDislike() {
        return canDislike;
    }

    public void setCanDislike(boolean canDislike) {
        this.canDislike = canDislike;
    }

    public PNSSong getSong() {
        return song;
    }

    public void setSong(PNSSong song) {
        this.song = song;
    }

    public String getAlg() {
        return alg;
    }

    public void setAlg(String alg) {
        this.alg = alg;
    }
}
