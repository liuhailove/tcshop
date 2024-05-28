package com.shop.tcshop.models.tctalk;

public class VideoGroup {
    private int id;
   private String  name;
   private String  url;
    private  int relatedVideoType;
   private boolean selectTab;
    private String abExtInfo;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getRelatedVideoType() {
        return relatedVideoType;
    }

    public void setRelatedVideoType(int relatedVideoType) {
        this.relatedVideoType = relatedVideoType;
    }

    public boolean isSelectTab() {
        return selectTab;
    }

    public void setSelectTab(boolean selectTab) {
        this.selectTab = selectTab;
    }

    public String getAbExtInfo() {
        return abExtInfo;
    }

    public void setAbExtInfo(String abExtInfo) {
        this.abExtInfo = abExtInfo;
    }
}
