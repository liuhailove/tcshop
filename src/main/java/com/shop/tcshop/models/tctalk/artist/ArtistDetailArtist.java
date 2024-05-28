package com.shop.tcshop.models.tctalk.artist;

import java.util.List;

public class ArtistDetailArtist {
    private int id;
    private String cover;
    private String name;
    private List<String> transNames;
    private List<String> identities;
    private String identifyTag;
    private String briefDesc;
    private ArtistDetailArtistRank rank;
    private int albumSize;
    private int musicSize;
    private int mvSize;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTransNames() {
        return transNames;
    }

    public void setTransNames(List<String> transNames) {
        this.transNames = transNames;
    }

    public List<String> getIdentities() {
        return identities;
    }

    public void setIdentities(List<String> identities) {
        this.identities = identities;
    }

    public String getIdentifyTag() {
        return identifyTag;
    }

    public void setIdentifyTag(String identifyTag) {
        this.identifyTag = identifyTag;
    }

    public String getBriefDesc() {
        return briefDesc;
    }

    public void setBriefDesc(String briefDesc) {
        this.briefDesc = briefDesc;
    }

    public ArtistDetailArtistRank getRank() {
        return rank;
    }

    public void setRank(ArtistDetailArtistRank rank) {
        this.rank = rank;
    }

    public int getAlbumSize() {
        return albumSize;
    }

    public void setAlbumSize(int albumSize) {
        this.albumSize = albumSize;
    }

    public int getMusicSize() {
        return musicSize;
    }

    public void setMusicSize(int musicSize) {
        this.musicSize = musicSize;
    }

    public int getMvSize() {
        return mvSize;
    }

    public void setMvSize(int mvSize) {
        this.mvSize = mvSize;
    }
}
