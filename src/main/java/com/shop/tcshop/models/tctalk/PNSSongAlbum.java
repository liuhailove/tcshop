package com.shop.tcshop.models.tctalk;

import java.util.List;

public class PNSSongAlbum {
    private String name;
    private int id;
    private String type;
    private int size;
    private int picId;
    private String blurPicUrl;
    private int companyId;
    private int pic;
    private String picUrl;
    private long publishTime;
   private String  description;
   private String  tags;
   private String  company;
   private String  briefDesc;
   private  PNSSongAlbumArtist artist;
   private List<String> songs;
   private List<String> alias;
    private int status;
    private int copyrightId;
   private String  commentThreadId;
   private List<PNSSongAlbumArtists> artists;
   private String  subType;
    private boolean onSale;
   private int  mark;
    private String picId_str;

    public PNSSongAlbum() {
    }

    public PNSSongAlbum(String name, int id, String type, int size, int picId, String blurPicUrl, int companyId, int pic, String picUrl, long publishTime, String description, String tags, String company, String briefDesc, PNSSongAlbumArtist artist, List<String> songs, List<String> alias, int status, int copyrightId, String commentThreadId, List<PNSSongAlbumArtists> artists, String subType, boolean onSale, int mark, String picId_str) {
        this.name = name;
        this.id = id;
        this.type = type;
        this.size = size;
        this.picId = picId;
        this.blurPicUrl = blurPicUrl;
        this.companyId = companyId;
        this.pic = pic;
        this.picUrl = picUrl;
        this.publishTime = publishTime;
        this.description = description;
        this.tags = tags;
        this.company = company;
        this.briefDesc = briefDesc;
        this.artist = artist;
        this.songs = songs;
        this.alias = alias;
        this.status = status;
        this.copyrightId = copyrightId;
        this.commentThreadId = commentThreadId;
        this.artists = artists;
        this.subType = subType;
        this.onSale = onSale;
        this.mark = mark;
        this.picId_str = picId_str;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPicId() {
        return picId;
    }

    public void setPicId(int picId) {
        this.picId = picId;
    }

    public String getBlurPicUrl() {
        return blurPicUrl;
    }

    public void setBlurPicUrl(String blurPicUrl) {
        this.blurPicUrl = blurPicUrl;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public long getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(long publishTime) {
        this.publishTime = publishTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getBriefDesc() {
        return briefDesc;
    }

    public void setBriefDesc(String briefDesc) {
        this.briefDesc = briefDesc;
    }

    public PNSSongAlbumArtist getArtist() {
        return artist;
    }

    public void setArtist(PNSSongAlbumArtist artist) {
        this.artist = artist;
    }

    public List<String> getSongs() {
        return songs;
    }

    public void setSongs(List<String> songs) {
        this.songs = songs;
    }

    public List<String> getAlias() {
        return alias;
    }

    public void setAlias(List<String> alias) {
        this.alias = alias;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getCopyrightId() {
        return copyrightId;
    }

    public void setCopyrightId(int copyrightId) {
        this.copyrightId = copyrightId;
    }

    public String getCommentThreadId() {
        return commentThreadId;
    }

    public void setCommentThreadId(String commentThreadId) {
        this.commentThreadId = commentThreadId;
    }

    public List<PNSSongAlbumArtists> getArtists() {
        return artists;
    }

    public void setArtists(List<PNSSongAlbumArtists> artists) {
        this.artists = artists;
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public boolean isOnSale() {
        return onSale;
    }

    public void setOnSale(boolean onSale) {
        this.onSale = onSale;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getPicId_str() {
        return picId_str;
    }

    public void setPicId_str(String picId_str) {
        this.picId_str = picId_str;
    }
}
