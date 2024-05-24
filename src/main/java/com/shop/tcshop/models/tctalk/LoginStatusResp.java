package com.shop.tcshop.models.tctalk;

public class LoginStatusResp {
    private int code;
    private UserProfile userProfile;

    public LoginStatusResp(int code, UserProfile userProfile) {
        this.code = code;
        this.userProfile = userProfile;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public UserProfile getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }
}
