package com.shop.tcshop.models.tctalk.artist;

import java.util.List;

public class ArtistDesc {

    private List<ArtistDescIntroduction> introduction;
    private String briefDesc;
    private int count;
    private List<ArtistDescTopicData> topicData;

    public List<ArtistDescIntroduction> getIntroduction() {
        return introduction;
    }

    public void setIntroduction(List<ArtistDescIntroduction> introduction) {
        this.introduction = introduction;
    }

    public String getBriefDesc() {
        return briefDesc;
    }

    public void setBriefDesc(String briefDesc) {
        this.briefDesc = briefDesc;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<ArtistDescTopicData> getTopicData() {
        return topicData;
    }

    public void setTopicData(List<ArtistDescTopicData> topicData) {
        this.topicData = topicData;
    }
}
