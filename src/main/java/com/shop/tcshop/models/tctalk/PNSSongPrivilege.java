package com.shop.tcshop.models.tctalk;

import java.util.List;

public class PNSSongPrivilege {
    private int id;
    private int fee;
    private int payed;
    private int st;
    private int pl;
    private int dl;
    private int sp;
    private int cp;
    private int subp;
    private boolean cs;
    private int maxbr;
    private int fl;
    private boolean toast;
    private int flag;
    private int preSell;
    private int playMaxbr;
    private int downloadMaxbr;
    private  PNSSongPrivilegeFreeTrialPrivilege freeTrialPrivilege;
    private List<PNSSongPrivilegeChargeInfoList> chargeInfoList;

    public PNSSongPrivilege(int id, int fee, int payed, int st, int pl, int dl, int sp, int cp, int subp, boolean cs, int maxbr, int fl, boolean toast, int flag, int preSell, int playMaxbr, int downloadMaxbr, PNSSongPrivilegeFreeTrialPrivilege freeTrialPrivilege, List<PNSSongPrivilegeChargeInfoList> chargeInfoList) {
        this.id = id;
        this.fee = fee;
        this.payed = payed;
        this.st = st;
        this.pl = pl;
        this.dl = dl;
        this.sp = sp;
        this.cp = cp;
        this.subp = subp;
        this.cs = cs;
        this.maxbr = maxbr;
        this.fl = fl;
        this.toast = toast;
        this.flag = flag;
        this.preSell = preSell;
        this.playMaxbr = playMaxbr;
        this.downloadMaxbr = downloadMaxbr;
        this.freeTrialPrivilege = freeTrialPrivilege;
        this.chargeInfoList = chargeInfoList;
    }

    public PNSSongPrivilege() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getSt() {
        return st;
    }

    public void setSt(int st) {
        this.st = st;
    }

    public int getPl() {
        return pl;
    }

    public void setPl(int pl) {
        this.pl = pl;
    }

    public int getDl() {
        return dl;
    }

    public void setDl(int dl) {
        this.dl = dl;
    }

    public int getSp() {
        return sp;
    }

    public void setSp(int sp) {
        this.sp = sp;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public int getSubp() {
        return subp;
    }

    public void setSubp(int subp) {
        this.subp = subp;
    }

    public boolean isCs() {
        return cs;
    }

    public void setCs(boolean cs) {
        this.cs = cs;
    }

    public int getMaxbr() {
        return maxbr;
    }

    public void setMaxbr(int maxbr) {
        this.maxbr = maxbr;
    }

    public int getFl() {
        return fl;
    }

    public void setFl(int fl) {
        this.fl = fl;
    }

    public boolean isToast() {
        return toast;
    }

    public void setToast(boolean toast) {
        this.toast = toast;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public int getPreSell() {
        return preSell;
    }

    public void setPreSell(int preSell) {
        this.preSell = preSell;
    }

    public int getPlayMaxbr() {
        return playMaxbr;
    }

    public void setPlayMaxbr(int playMaxbr) {
        this.playMaxbr = playMaxbr;
    }

    public int getDownloadMaxbr() {
        return downloadMaxbr;
    }

    public void setDownloadMaxbr(int downloadMaxbr) {
        this.downloadMaxbr = downloadMaxbr;
    }

    public PNSSongPrivilegeFreeTrialPrivilege getFreeTrialPrivilege() {
        return freeTrialPrivilege;
    }

    public void setFreeTrialPrivilege(PNSSongPrivilegeFreeTrialPrivilege freeTrialPrivilege) {
        this.freeTrialPrivilege = freeTrialPrivilege;
    }

    public List<PNSSongPrivilegeChargeInfoList> getChargeInfoList() {
        return chargeInfoList;
    }

    public void setChargeInfoList(List<PNSSongPrivilegeChargeInfoList> chargeInfoList) {
        this.chargeInfoList = chargeInfoList;
    }
}
