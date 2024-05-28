package com.shop.tcshop.models.tctalk;

public class SongUrl {
    private int id;
    private String url;
    private int br;
    private int size;
    private String md5;
    private int code;
    private int expi;
    private String type;
    private int gain;
    private int fee;
    private int payed;
    private int flag;
    private boolean canExtend;

    private RootObjectFreeTrialPrivilege freeTrialPrivilege;
    private RootObjectFreeTimeTrialPrivilege freeTimeTrialPrivilege;
    private int urlSource;
    private FreeTrialInfo freeTrialInfo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getBr() {
        return br;
    }

    public void setBr(int br) {
        this.br = br;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getExpi() {
        return expi;
    }

    public void setExpi(int expi) {
        this.expi = expi;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getGain() {
        return gain;
    }

    public void setGain(int gain) {
        this.gain = gain;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public int getPayed() {
        return payed;
    }

    public void setPayed(int payed) {
        this.payed = payed;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public boolean isCanExtend() {
        return canExtend;
    }

    public void setCanExtend(boolean canExtend) {
        this.canExtend = canExtend;
    }

    public RootObjectFreeTrialPrivilege getFreeTrialPrivilege() {
        return freeTrialPrivilege;
    }

    public void setFreeTrialPrivilege(RootObjectFreeTrialPrivilege freeTrialPrivilege) {
        this.freeTrialPrivilege = freeTrialPrivilege;
    }

    public RootObjectFreeTimeTrialPrivilege getFreeTimeTrialPrivilege() {
        return freeTimeTrialPrivilege;
    }

    public void setFreeTimeTrialPrivilege(RootObjectFreeTimeTrialPrivilege freeTimeTrialPrivilege) {
        this.freeTimeTrialPrivilege = freeTimeTrialPrivilege;
    }

    public int getUrlSource() {
        return urlSource;
    }

    public void setUrlSource(int urlSource) {
        this.urlSource = urlSource;
    }

    public FreeTrialInfo getFreeTrialInfo() {
        return freeTrialInfo;
    }

    public void setFreeTrialInfo(FreeTrialInfo freeTrialInfo) {
        this.freeTrialInfo = freeTrialInfo;
    }
}
