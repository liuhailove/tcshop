package com.shop.tcshop.models.fe;

import java.util.List;

public class PlayUrl {

//    @JsonProperty("current_quality")
    private int currentQuality;

    private List<Url> durl;

    public PlayUrl(int currentQuality, List<Url> durl) {
        this.currentQuality = currentQuality;
        this.durl = durl;
    }

    public int getCurrentQuality() {
        return currentQuality;
    }

    public void setCurrentQuality(int currentQuality) {
        this.currentQuality = currentQuality;
    }

    public List<Url> getDurl() {
        return durl;
    }

    public void setDurl(List<Url> durl) {
        this.durl = durl;
    }
}
