package com.shop.tcshop.models.tctalk;

public class PersonalizedResp {
    private int id;
    private int type;
    private String name;
   private String  copywriter;
    private String picUrl;
    private boolean canDislike;
    private long trackNumberUpdateTime;
    private int playCount;
    private int trackCount;
   private boolean highQuality;
    private String alg;

    public PersonalizedResp(int id, int type, String name, String copywriter, String picUrl, boolean canDislike, long trackNumberUpdateTime, int playCount, int trackCount, boolean highQuality, String alg) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.copywriter = copywriter;
        this.picUrl = picUrl;
        this.canDislike = canDislike;
        this.trackNumberUpdateTime = trackNumberUpdateTime;
        this.playCount = playCount;
        this.trackCount = trackCount;
        this.highQuality = highQuality;
        this.alg = alg;
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

    public String getCopywriter() {
        return copywriter;
    }

    public void setCopywriter(String copywriter) {
        this.copywriter = copywriter;
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

    public long getTrackNumberUpdateTime() {
        return trackNumberUpdateTime;
    }

    public void setTrackNumberUpdateTime(long trackNumberUpdateTime) {
        this.trackNumberUpdateTime = trackNumberUpdateTime;
    }

    public int getPlayCount() {
        return playCount;
    }

    public void setPlayCount(int playCount) {
        this.playCount = playCount;
    }

    public int getTrackCount() {
        return trackCount;
    }

    public void setTrackCount(int trackCount) {
        this.trackCount = trackCount;
    }

    public boolean isHighQuality() {
        return highQuality;
    }

    public void setHighQuality(boolean highQuality) {
        this.highQuality = highQuality;
    }

    public String getAlg() {
        return alg;
    }

    public void setAlg(String alg) {
        this.alg = alg;
    }
}
