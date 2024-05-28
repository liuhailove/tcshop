package com.shop.tcshop.models.tctalk;

public class RootObjectFreeTrialPrivilege {
    private boolean resConsumable;
    private boolean userConsumable;

    public boolean isUserConsumable() {
        return userConsumable;
    }

    public void setUserConsumable(boolean userConsumable) {
        this.userConsumable = userConsumable;
    }

    public boolean isResConsumable() {
        return resConsumable;
    }

    public void setResConsumable(boolean resConsumable) {
        this.resConsumable = resConsumable;
    }
}
