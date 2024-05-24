package com.shop.tcshop.models.tctalk;

import java.util.List;

public class PNSSongArtists {
    private String name;
    private  int id;
    private int picId;
   private int  img1v1Id;
    private String briefDesc;
   private String  picUrl;
    private String img1v1Url;
    private int albumSize;
    private List<String> alias;
    private String trans;
   private int  musicSize;
   private int  topicPerson;

    public PNSSongArtists() {
    }

    public PNSSongArtists(String name, int id, int picId, int img1v1Id, String briefDesc, String picUrl, String img1v1Url, int albumSize, List<String> alias, String trans, int musicSize, int topicPerson) {
        this.name = name;
        this.id = id;
        this.picId = picId;
        this.img1v1Id = img1v1Id;
        this.briefDesc = briefDesc;
        this.picUrl = picUrl;
        this.img1v1Url = img1v1Url;
        this.albumSize = albumSize;
        this.alias = alias;
        this.trans = trans;
        this.musicSize = musicSize;
        this.topicPerson = topicPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPicId() {
        return picId;
    }

    public void setPicId(int picId) {
        this.picId = picId;
    }

    public int getImg1v1Id() {
        return img1v1Id;
    }

    public void setImg1v1Id(int img1v1Id) {
        this.img1v1Id = img1v1Id;
    }

    public String getBriefDesc() {
        return briefDesc;
    }

    public void setBriefDesc(String briefDesc) {
        this.briefDesc = briefDesc;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getImg1v1Url() {
        return img1v1Url;
    }

    public void setImg1v1Url(String img1v1Url) {
        this.img1v1Url = img1v1Url;
    }

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

    public String getTrans() {
        return trans;
    }

    public void setTrans(String trans) {
        this.trans = trans;
    }

    public int getMusicSize() {
        return musicSize;
    }

    public void setMusicSize(int musicSize) {
        this.musicSize = musicSize;
    }

    public int getTopicPerson() {
        return topicPerson;
    }

    public void setTopicPerson(int topicPerson) {
        this.topicPerson = topicPerson;
    }
}
