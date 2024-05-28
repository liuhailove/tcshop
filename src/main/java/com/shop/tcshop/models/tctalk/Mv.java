package com.shop.tcshop.models.tctalk;

public class Mv {
   private int  id;
   private String  name;
   private int  status;
   private String  artistName;
    private Artist artist ;
   private String  imgurl16v9;
   private String  imgurl;
    private int duration;
    private int playCount;
    private  String publishTime;
   private boolean subed;

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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public String getImgurl16v9() {
        return imgurl16v9;
    }

    public void setImgurl16v9(String imgurl16v9) {
        this.imgurl16v9 = imgurl16v9;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getPlayCount() {
        return playCount;
    }

    public void setPlayCount(int playCount) {
        this.playCount = playCount;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public boolean isSubed() {
        return subed;
    }

    public void setSubed(boolean subed) {
        this.subed = subed;
    }
}
