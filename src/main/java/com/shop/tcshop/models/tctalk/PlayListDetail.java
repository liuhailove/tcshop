package com.shop.tcshop.models.tctalk;

import java.util.List;

public class PlayListDetail {
    private int id;
    private String name;
    private int coverImgId;
    private String coverImgUrl;
    private String coverImgId_str;
    private int adType;
    private int userId;
    private long createTime;
    private int status;
    private boolean opRecommend;
    private boolean highQuality;
    private boolean newImported;
    private long updateTime;
    private int trackCount;
    private int specialType;
    private int privacy;
    private long trackUpdateTime;
    private String commentThreadId;
    private int playCount;
    private int trackNumberUpdateTime;
    private int subscribedCount;
    private int cloudTrackCount;
    private boolean ordered;
    private String description;
    private List<String> tags;
    private String updateFrequency;
    private int backgroundCoverId;
    private String backgroundCoverUrl;
    private int titleImage;
    private String titleImageUrl;
    private String englishTitle;
    private int officialPlaylistType;
    private List<PlayListDetailSubscribers> subscribers;
    private boolean subscribed;
    private PlayListDetailCreator creator;
    private PlayListDetailTracks tracks;
    private String videoIds;
    private String videos;
    private List<PlayListDetailTrackIds> trackIds;
    private int shareCount;
    private int commentCount;
    private String remixVideo;
    private int sharedUsers;
    private int historySharedUsers;

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

    public int getCoverImgId() {
        return coverImgId;
    }

    public void setCoverImgId(int coverImgId) {
        this.coverImgId = coverImgId;
    }

    public String getCoverImgUrl() {
        return coverImgUrl;
    }

    public void setCoverImgUrl(String coverImgUrl) {
        this.coverImgUrl = coverImgUrl;
    }

    public String getCoverImgId_str() {
        return coverImgId_str;
    }

    public void setCoverImgId_str(String coverImgId_str) {
        this.coverImgId_str = coverImgId_str;
    }

    public int getAdType() {
        return adType;
    }

    public void setAdType(int adType) {
        this.adType = adType;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public boolean isOpRecommend() {
        return opRecommend;
    }

    public void setOpRecommend(boolean opRecommend) {
        this.opRecommend = opRecommend;
    }

    public boolean isHighQuality() {
        return highQuality;
    }

    public void setHighQuality(boolean highQuality) {
        this.highQuality = highQuality;
    }

    public boolean isNewImported() {
        return newImported;
    }

    public void setNewImported(boolean newImported) {
        this.newImported = newImported;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }

    public int getTrackCount() {
        return trackCount;
    }

    public void setTrackCount(int trackCount) {
        this.trackCount = trackCount;
    }

    public int getSpecialType() {
        return specialType;
    }

    public void setSpecialType(int specialType) {
        this.specialType = specialType;
    }

    public int getPrivacy() {
        return privacy;
    }

    public void setPrivacy(int privacy) {
        this.privacy = privacy;
    }

    public long getTrackUpdateTime() {
        return trackUpdateTime;
    }

    public void setTrackUpdateTime(long trackUpdateTime) {
        this.trackUpdateTime = trackUpdateTime;
    }

    public String getCommentThreadId() {
        return commentThreadId;
    }

    public void setCommentThreadId(String commentThreadId) {
        this.commentThreadId = commentThreadId;
    }

    public int getPlayCount() {
        return playCount;
    }

    public void setPlayCount(int playCount) {
        this.playCount = playCount;
    }

    public int getTrackNumberUpdateTime() {
        return trackNumberUpdateTime;
    }

    public void setTrackNumberUpdateTime(int trackNumberUpdateTime) {
        this.trackNumberUpdateTime = trackNumberUpdateTime;
    }

    public int getSubscribedCount() {
        return subscribedCount;
    }

    public void setSubscribedCount(int subscribedCount) {
        this.subscribedCount = subscribedCount;
    }

    public int getCloudTrackCount() {
        return cloudTrackCount;
    }

    public void setCloudTrackCount(int cloudTrackCount) {
        this.cloudTrackCount = cloudTrackCount;
    }

    public boolean isOrdered() {
        return ordered;
    }

    public void setOrdered(boolean ordered) {
        this.ordered = ordered;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getUpdateFrequency() {
        return updateFrequency;
    }

    public void setUpdateFrequency(String updateFrequency) {
        this.updateFrequency = updateFrequency;
    }

    public int getBackgroundCoverId() {
        return backgroundCoverId;
    }

    public void setBackgroundCoverId(int backgroundCoverId) {
        this.backgroundCoverId = backgroundCoverId;
    }

    public String getBackgroundCoverUrl() {
        return backgroundCoverUrl;
    }

    public void setBackgroundCoverUrl(String backgroundCoverUrl) {
        this.backgroundCoverUrl = backgroundCoverUrl;
    }

    public int getTitleImage() {
        return titleImage;
    }

    public void setTitleImage(int titleImage) {
        this.titleImage = titleImage;
    }

    public String getTitleImageUrl() {
        return titleImageUrl;
    }

    public void setTitleImageUrl(String titleImageUrl) {
        this.titleImageUrl = titleImageUrl;
    }

    public String getEnglishTitle() {
        return englishTitle;
    }

    public void setEnglishTitle(String englishTitle) {
        this.englishTitle = englishTitle;
    }

    public int getOfficialPlaylistType() {
        return officialPlaylistType;
    }

    public void setOfficialPlaylistType(int officialPlaylistType) {
        this.officialPlaylistType = officialPlaylistType;
    }

    public List<PlayListDetailSubscribers> getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(List<PlayListDetailSubscribers> subscribers) {
        this.subscribers = subscribers;
    }

    public boolean isSubscribed() {
        return subscribed;
    }

    public void setSubscribed(boolean subscribed) {
        this.subscribed = subscribed;
    }

    public PlayListDetailCreator getCreator() {
        return creator;
    }

    public void setCreator(PlayListDetailCreator creator) {
        this.creator = creator;
    }

    public PlayListDetailTracks getTracks() {
        return tracks;
    }

    public void setTracks(PlayListDetailTracks tracks) {
        this.tracks = tracks;
    }

    public String getVideoIds() {
        return videoIds;
    }

    public void setVideoIds(String videoIds) {
        this.videoIds = videoIds;
    }

    public String getVideos() {
        return videos;
    }

    public void setVideos(String videos) {
        this.videos = videos;
    }

    public List<PlayListDetailTrackIds> getTrackIds() {
        return trackIds;
    }

    public void setTrackIds(List<PlayListDetailTrackIds> trackIds) {
        this.trackIds = trackIds;
    }

    public int getShareCount() {
        return shareCount;
    }

    public void setShareCount(int shareCount) {
        this.shareCount = shareCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public String getRemixVideo() {
        return remixVideo;
    }

    public void setRemixVideo(String remixVideo) {
        this.remixVideo = remixVideo;
    }

    public int getSharedUsers() {
        return sharedUsers;
    }

    public void setSharedUsers(int sharedUsers) {
        this.sharedUsers = sharedUsers;
    }

    public int getHistorySharedUsers() {
        return historySharedUsers;
    }

    public void setHistorySharedUsers(int historySharedUsers) {
        this.historySharedUsers = historySharedUsers;
    }
}
