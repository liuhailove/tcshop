package com.shop.tcshop.models.tctalk;

public class PlayListDetailCreatorAvatarDetail {
  private  int   userType;
   private int  identityLevel;
   private String  identityIconUrl;

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public int getIdentityLevel() {
        return identityLevel;
    }

    public void setIdentityLevel(int identityLevel) {
        this.identityLevel = identityLevel;
    }

    public String getIdentityIconUrl() {
        return identityIconUrl;
    }

    public void setIdentityIconUrl(String identityIconUrl) {
        this.identityIconUrl = identityIconUrl;
    }
}
