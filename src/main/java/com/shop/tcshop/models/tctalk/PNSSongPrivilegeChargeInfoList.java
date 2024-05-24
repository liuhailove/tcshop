package com.shop.tcshop.models.tctalk;

public class PNSSongPrivilegeChargeInfoList {
    private int rate;
    private int chargeType;

    public PNSSongPrivilegeChargeInfoList() {
    }

    public PNSSongPrivilegeChargeInfoList(int rate, int chargeType) {
        this.rate = rate;
        this.chargeType = chargeType;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getChargeType() {
        return chargeType;
    }

    public void setChargeType(int chargeType) {
        this.chargeType = chargeType;
    }
}
