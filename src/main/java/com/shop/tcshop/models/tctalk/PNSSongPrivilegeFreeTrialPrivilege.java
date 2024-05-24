package com.shop.tcshop.models.tctalk;

public class PNSSongPrivilegeFreeTrialPrivilege {
    private boolean resConsumable;
    private boolean userConsumable;

    public PNSSongPrivilegeFreeTrialPrivilege(boolean resConsumable, boolean userConsumable) {
        this.resConsumable = resConsumable;
        this.userConsumable = userConsumable;
    }

    public PNSSongPrivilegeFreeTrialPrivilege() {
    }

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
}
