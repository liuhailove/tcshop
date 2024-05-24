package com.shop.tcshop.models.tctalk;

import java.util.List;

public class PersonalizedMvResp {
    private int id;
    private int type;
    private String name;
    private String copywriter;
    private String picUrl;
    private boolean canDislike;
    private long trackNumberUpdateTime;
    private long duration;
    private int playCount;
    private boolean subed;
    private List<Artist> artists;
    private String artistName;
    private int artistId;
    private String alg;

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

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public int getPlayCount() {
        return playCount;
    }

    public void setPlayCount(int playCount) {
        this.playCount = playCount;
    }

    public boolean isSubed() {
        return subed;
    }

    public void setSubed(boolean subed) {
        this.subed = subed;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public String getAlg() {
        return alg;
    }

    public void setAlg(String alg) {
        this.alg = alg;
    }

    public PersonalizedMvResp(int id, int type, String name, String copywriter, String picUrl, boolean canDislike, long trackNumberUpdateTime, long duration, int playCount, boolean subed, List<Artist> artists, String artistName, int artistId, String alg) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.copywriter = copywriter;
        this.picUrl = picUrl;
        this.canDislike = canDislike;
        this.trackNumberUpdateTime = trackNumberUpdateTime;
        this.duration = duration;
        this.playCount = playCount;
        this.subed = subed;
        this.artists = artists;
        this.artistName = artistName;
        this.artistId = artistId;
        this.alg = alg;
    }
}
