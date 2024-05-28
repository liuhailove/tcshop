package com.shop.tcshop.models.tctalk.artist;

import java.util.List;

public class ArtistDetail {
    private  int videoCount;
   private ArtistDetailIdentify identify;
   private ArtistDetailArtist artist;
    private boolean blacklist;
   private int  preferShow;
   private boolean showPriMsg;
  private List<ArtistDetailSecondaryExpertIdentiy> secondaryExpertIdentiy;

    public int getVideoCount() {
        return videoCount;
    }

    public void setVideoCount(int videoCount) {
        this.videoCount = videoCount;
    }

    public ArtistDetailIdentify getIdentify() {
        return identify;
    }

    public void setIdentify(ArtistDetailIdentify identify) {
        this.identify = identify;
    }

    public ArtistDetailArtist getArtist() {
        return artist;
    }

    public void setArtist(ArtistDetailArtist artist) {
        this.artist = artist;
    }

    public boolean isBlacklist() {
        return blacklist;
    }

    public void setBlacklist(boolean blacklist) {
        this.blacklist = blacklist;
    }

    public int getPreferShow() {
        return preferShow;
    }

    public void setPreferShow(int preferShow) {
        this.preferShow = preferShow;
    }

    public boolean isShowPriMsg() {
        return showPriMsg;
    }

    public void setShowPriMsg(boolean showPriMsg) {
        this.showPriMsg = showPriMsg;
    }

    public List<ArtistDetailSecondaryExpertIdentiy> getSecondaryExpertIdentiy() {
        return secondaryExpertIdentiy;
    }

    public void setSecondaryExpertIdentiy(List<ArtistDetailSecondaryExpertIdentiy> secondaryExpertIdentiy) {
        this.secondaryExpertIdentiy = secondaryExpertIdentiy;
    }
}
