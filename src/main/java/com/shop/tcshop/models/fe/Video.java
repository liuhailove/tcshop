package com.shop.tcshop.models.fe;

public class Video {
    private int aid;
    private String title;
    private String pic;
    private String desc;
    private String play;
    private int video_review;
    private int publicDate;
    private int duration;
    private int cId;
    private String url;

    private UpUser upUser;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPlay() {
        return play;
    }

    public void setPlay(String play) {
        this.play = play;
    }

    public int getVideo_review() {
        return video_review;
    }

    public void setVideo_review(int video_review) {
        this.video_review = video_review;
    }

    public int getPublicDate() {
        return publicDate;
    }

    public void setPublicDate(int publicDate) {
        this.publicDate = publicDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public UpUser getUpUser() {
        return upUser;
    }

    public void setUpUser(UpUser upUser) {
        this.upUser = upUser;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Video(int aid, String title, String desc, String play, int video_review, int publicDate, int duration, int cId, String url, String pic, UpUser upUser) {
        this.aid = aid;
        this.title = title;
        this.desc = desc;
        this.play = play;
        this.video_review = video_review;
        this.publicDate = publicDate;
        this.duration = duration;
        this.cId = cId;
        this.url = url;
        this.upUser = upUser;
        this.pic = pic;
    }
}
