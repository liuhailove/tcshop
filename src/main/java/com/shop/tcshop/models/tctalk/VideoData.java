package com.shop.tcshop.models.tctalk;

import java.util.List;

public class VideoData {
    private String alg;
    private String scm;
    private String threadId;
    private String coverUrl;
    private int height;
    private int width;
    private String title;
    private String description;
    private int commentCount;
    private int shareCount;
    private List<VideoDataResolutions> resolutions;
    private VideoDataCreator creator;
    private VideoDataUrlInfo urlInfo;
    private List<VideoDataVideoGroup> videoGroup;
    private String previewUrl;
    private int previewDurationms;
    private boolean hasRelatedGameAd;
    private List<Integer> markTypes;
    private List<VideoDataRelateSong> relateSong;
    private String relatedInfo;
    private String videoUserLiveInfo;
    private String vid;
    private int durationms;
    private int playTime;
    private int praisedCount;
    private boolean praised;
    private boolean subscribed;


    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }

    public String getAlg() {
        return alg;
    }

    public void setAlg(String alg) {
        this.alg = alg;
    }

    public String getScm() {
        return scm;
    }

    public void setScm(String scm) {
        this.scm = scm;
    }

    public String getThreadId() {
        return threadId;
    }

    public void setThreadId(String threadId) {
        this.threadId = threadId;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public int getShareCount() {
        return shareCount;
    }

    public void setShareCount(int shareCount) {
        this.shareCount = shareCount;
    }

    public List<VideoDataResolutions> getResolutions() {
        return resolutions;
    }

    public void setResolutions(List<VideoDataResolutions> resolutions) {
        this.resolutions = resolutions;
    }

    public VideoDataCreator getCreator() {
        return creator;
    }

    public void setCreator(VideoDataCreator creator) {
        this.creator = creator;
    }

    public VideoDataUrlInfo getUrlInfo() {
        return urlInfo;
    }

    public void setUrlInfo(VideoDataUrlInfo urlInfo) {
        this.urlInfo = urlInfo;
    }

    public List<VideoDataVideoGroup> getVideoGroup() {
        return videoGroup;
    }

    public void setVideoGroup(List<VideoDataVideoGroup> videoGroup) {
        this.videoGroup = videoGroup;
    }

    public String getPreviewUrl() {
        return previewUrl;
    }

    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

    public int getPreviewDurationms() {
        return previewDurationms;
    }

    public void setPreviewDurationms(int previewDurationms) {
        this.previewDurationms = previewDurationms;
    }

    public boolean isHasRelatedGameAd() {
        return hasRelatedGameAd;
    }

    public void setHasRelatedGameAd(boolean hasRelatedGameAd) {
        this.hasRelatedGameAd = hasRelatedGameAd;
    }

    public List<Integer> getMarkTypes() {
        return markTypes;
    }

    public void setMarkTypes(List<Integer> markTypes) {
        this.markTypes = markTypes;
    }

    public List<VideoDataRelateSong> getRelateSong() {
        return relateSong;
    }

    public void setRelateSong(List<VideoDataRelateSong> relateSong) {
        this.relateSong = relateSong;
    }

    public String getRelatedInfo() {
        return relatedInfo;
    }

    public void setRelatedInfo(String relatedInfo) {
        this.relatedInfo = relatedInfo;
    }

    public String getVideoUserLiveInfo() {
        return videoUserLiveInfo;
    }

    public void setVideoUserLiveInfo(String videoUserLiveInfo) {
        this.videoUserLiveInfo = videoUserLiveInfo;
    }


    public int getDurationms() {
        return durationms;
    }

    public void setDurationms(int durationms) {
        this.durationms = durationms;
    }

    public int getPlayTime() {
        return playTime;
    }

    public void setPlayTime(int playTime) {
        this.playTime = playTime;
    }

    public int getPraisedCount() {
        return praisedCount;
    }

    public void setPraisedCount(int praisedCount) {
        this.praisedCount = praisedCount;
    }

    public boolean isPraised() {
        return praised;
    }

    public void setPraised(boolean praised) {
        this.praised = praised;
    }

    public boolean isSubscribed() {
        return subscribed;
    }

    public void setSubscribed(boolean subscribed) {
        this.subscribed = subscribed;
    }
}
