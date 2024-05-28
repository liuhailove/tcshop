package com.shop.tcshop.models.tctalk;

public class RootObjectFreeTimeTrialPrivilege {
    private boolean resConsumable;
    private boolean userConsumable;
    private int type;
    private int remainTime;

    public boolean isResConsumable() {
        return resConsumable;
    }

    public void setResConsumable(boolean resConsumable) {
        this.resConsumable = resConsumable;
    }

    public boolean isUserConsumable() {
        return userConsumable;
    }

    public void setUserConsumable(boolean userConsumable) {
        this.userConsumable = userConsumable;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getRemainTime() {
        return remainTime;
    }

    public void setRemainTime(int remainTime) {
        this.remainTime = remainTime;
    }
}
