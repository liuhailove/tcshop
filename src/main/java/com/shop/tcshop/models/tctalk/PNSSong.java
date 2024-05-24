package com.shop.tcshop.models.tctalk;

import java.util.List;

public class PNSSong {
    private String name;
    private int id;
    private int position;
    private List<String> alias;
    private int status;
    private int fee;
    private int copyrightId;
    private String disc;
    private int no;
    private List<PNSSongArtists> artists;
    private PNSSongAlbum album;
    private boolean starred;
    private int popularity;
    private int score;
    private int starredNum;
    private int duration;
    private int playedNum;
    private int dayPlays;
    private int hearTime;
    private String ringtone;
    private String copyFrom;
    private String commentThreadId;
    private int ftype;
    private List<String> rtUrls;
    private int copyright;
    private int mark;
    private int originCoverType;
    private int single;
    private int mvid;
    private PNSSongBMusic bMusic;
    private int rtype;
    private PNSSongHMusic hMusic;
    private PNSSongMMusic mMusic;
    private PNSSongLMusic lMusic;
    private boolean exclusive;
    private PNSSongPrivilege privilege;

    public PNSSong() {
    }

    public PNSSong(String name, int id, int position, List<String> alias, int status, int fee, int copyrightId, String disc, int no, List<PNSSongArtists> artists, PNSSongAlbum album, boolean starred, int popularity, int score, int starredNum, int duration, int playedNum, int dayPlays, int hearTime, String ringtone, String copyFrom, String commentThreadId, int ftype, List<String> rtUrls, int copyright, int mark, int originCoverType, int single, int mvid, PNSSongBMusic bMusic, int rtype, PNSSongHMusic hMusic, PNSSongMMusic mMusic, PNSSongLMusic lMusic, boolean exclusive, PNSSongPrivilege privilege) {
        this.name = name;
        this.id = id;
        this.position = position;
        this.alias = alias;
        this.status = status;
        this.fee = fee;
        this.copyrightId = copyrightId;
        this.disc = disc;
        this.no = no;
        this.artists = artists;
        this.album = album;
        this.starred = starred;
        this.popularity = popularity;
        this.score = score;
        this.starredNum = starredNum;
        this.duration = duration;
        this.playedNum = playedNum;
        this.dayPlays = dayPlays;
        this.hearTime = hearTime;
        this.ringtone = ringtone;
        this.copyFrom = copyFrom;
        this.commentThreadId = commentThreadId;
        this.ftype = ftype;
        this.rtUrls = rtUrls;
        this.copyright = copyright;
        this.mark = mark;
        this.originCoverType = originCoverType;
        this.single = single;
        this.mvid = mvid;
        this.bMusic = bMusic;
        this.rtype = rtype;
        this.hMusic = hMusic;
        this.mMusic = mMusic;
        this.lMusic = lMusic;
        this.exclusive = exclusive;
        this.privilege = privilege;
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

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
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

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public int getCopyrightId() {
        return copyrightId;
    }

    public void setCopyrightId(int copyrightId) {
        this.copyrightId = copyrightId;
    }

    public String getDisc() {
        return disc;
    }

    public void setDisc(String disc) {
        this.disc = disc;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public List<PNSSongArtists> getArtists() {
        return artists;
    }

    public void setArtists(List<PNSSongArtists> artists) {
        this.artists = artists;
    }

    public PNSSongAlbum getAlbum() {
        return album;
    }

    public void setAlbum(PNSSongAlbum album) {
        this.album = album;
    }

    public boolean isStarred() {
        return starred;
    }

    public void setStarred(boolean starred) {
        this.starred = starred;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getStarredNum() {
        return starredNum;
    }

    public void setStarredNum(int starredNum) {
        this.starredNum = starredNum;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getPlayedNum() {
        return playedNum;
    }

    public void setPlayedNum(int playedNum) {
        this.playedNum = playedNum;
    }

    public int getDayPlays() {
        return dayPlays;
    }

    public void setDayPlays(int dayPlays) {
        this.dayPlays = dayPlays;
    }

    public int getHearTime() {
        return hearTime;
    }

    public void setHearTime(int hearTime) {
        this.hearTime = hearTime;
    }

    public String getRingtone() {
        return ringtone;
    }

    public void setRingtone(String ringtone) {
        this.ringtone = ringtone;
    }

    public String getCopyFrom() {
        return copyFrom;
    }

    public void setCopyFrom(String copyFrom) {
        this.copyFrom = copyFrom;
    }

    public String getCommentThreadId() {
        return commentThreadId;
    }

    public void setCommentThreadId(String commentThreadId) {
        this.commentThreadId = commentThreadId;
    }

    public int getFtype() {
        return ftype;
    }

    public void setFtype(int ftype) {
        this.ftype = ftype;
    }

    public List<String> getRtUrls() {
        return rtUrls;
    }

    public void setRtUrls(List<String> rtUrls) {
        this.rtUrls = rtUrls;
    }

    public int getCopyright() {
        return copyright;
    }

    public void setCopyright(int copyright) {
        this.copyright = copyright;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public int getOriginCoverType() {
        return originCoverType;
    }

    public void setOriginCoverType(int originCoverType) {
        this.originCoverType = originCoverType;
    }

    public int getSingle() {
        return single;
    }

    public void setSingle(int single) {
        this.single = single;
    }

    public int getMvid() {
        return mvid;
    }

    public void setMvid(int mvid) {
        this.mvid = mvid;
    }

    public PNSSongBMusic getbMusic() {
        return bMusic;
    }

    public void setbMusic(PNSSongBMusic bMusic) {
        this.bMusic = bMusic;
    }

    public int getRtype() {
        return rtype;
    }

    public void setRtype(int rtype) {
        this.rtype = rtype;
    }

    public PNSSongHMusic gethMusic() {
        return hMusic;
    }

    public void sethMusic(PNSSongHMusic hMusic) {
        this.hMusic = hMusic;
    }

    public PNSSongMMusic getmMusic() {
        return mMusic;
    }

    public void setmMusic(PNSSongMMusic mMusic) {
        this.mMusic = mMusic;
    }

    public PNSSongLMusic getlMusic() {
        return lMusic;
    }

    public void setlMusic(PNSSongLMusic lMusic) {
        this.lMusic = lMusic;
    }

    public boolean isExclusive() {
        return exclusive;
    }

    public void setExclusive(boolean exclusive) {
        this.exclusive = exclusive;
    }

    public PNSSongPrivilege getPrivilege() {
        return privilege;
    }

    public void setPrivilege(PNSSongPrivilege privilege) {
        this.privilege = privilege;
    }
}
