package com.shop.tcshop.models.tctalk;

public class PNSSongMMusic {
    private int id;
    private int size;
    private String extension;
    private int sr;
    private int dfsId;
    private int bitrate;
    private long playTime;
    private int volumeDelta;

    public PNSSongMMusic(int id, int size, String extension, int sr, int dfsId, int bitrate, long playTime, int volumeDelta) {
        this.id = id;
        this.size = size;
        this.extension = extension;
        this.sr = sr;
        this.dfsId = dfsId;
        this.bitrate = bitrate;
        this.playTime = playTime;
        this.volumeDelta = volumeDelta;
    }

    public PNSSongMMusic() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public int getSr() {
        return sr;
    }

    public void setSr(int sr) {
        this.sr = sr;
    }

    public int getDfsId() {
        return dfsId;
    }

    public void setDfsId(int dfsId) {
        this.dfsId = dfsId;
    }

    public int getBitrate() {
        return bitrate;
    }

    public void setBitrate(int bitrate) {
        this.bitrate = bitrate;
    }

    public long getPlayTime() {
        return playTime;
    }

    public void setPlayTime(long playTime) {
        this.playTime = playTime;
    }

    public int getVolumeDelta() {
        return volumeDelta;
    }

    public void setVolumeDelta(int volumeDelta) {
        this.volumeDelta = volumeDelta;
    }
}
