package com.shop.tcshop.models.tctalk.artist;

import java.util.List;

public class Artist {
    private int albumSize;
    private List<String> alias;
    private String briefDesc;
    private int fansCount;
    private boolean followed;
    private int id;
    private int img1v1Id;
    private String img1v1Id_str;
    private String img1v1Url;
    private int musicSize;
    private String name;
    private String picId;
    private String picId_str;
    private String picUrl;
    private int topicPerson;
    private String trans;

    public int getAlbumSize() {
        return albumSize;
    }

    public void setAlbumSize(int albumSize) {
        this.albumSize = albumSize;
    }

    public List<String> getAlias() {
        return alias;
    }

    public void setAlias(List<String> alias) {
        this.alias = alias;
    }

    public String getBriefDesc() {
        return briefDesc;
    }

    public void setBriefDesc(String briefDesc) {
        this.briefDesc = briefDesc;
    }

    public int getFansCount() {
        return fansCount;
    }

    public void setFansCount(int fansCount) {
        this.fansCount = fansCount;
    }

    public boolean isFollowed() {
        return followed;
    }

    public void setFollowed(boolean followed) {
        this.followed = followed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImg1v1Id() {
        return img1v1Id;
    }

    public void setImg1v1Id(int img1v1Id) {
        this.img1v1Id = img1v1Id;
    }

    public String getImg1v1Id_str() {
        return img1v1Id_str;
    }

    public void setImg1v1Id_str(String img1v1Id_str) {
        this.img1v1Id_str = img1v1Id_str;
    }

    public String getImg1v1Url() {
        return img1v1Url;
    }

    public void setImg1v1Url(String img1v1Url) {
        this.img1v1Url = img1v1Url;
    }

    public int getMusicSize() {
        return musicSize;
    }

    public void setMusicSize(int musicSize) {
        this.musicSize = musicSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicId() {
        return picId;
    }

    public void setPicId(String picId) {
        this.picId = picId;
    }

    public String getPicId_str() {
        return picId_str;
    }

    public void setPicId_str(String picId_str) {
        this.picId_str = picId_str;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public int getTopicPerson() {
        return topicPerson;
    }

    public void setTopicPerson(int topicPerson) {
        this.topicPerson = topicPerson;
    }

    public String getTrans() {
        return trans;
    }

    public void setTrans(String trans) {
        this.trans = trans;
    }
}
