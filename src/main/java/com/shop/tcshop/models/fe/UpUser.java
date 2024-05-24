package com.shop.tcshop.models.fe;

public class UpUser {

    private int mId;
    public String name;
    public String face;
    public int level;
    public String sex= "保密";
    public String sign= "";
    public int following = 0;
    public int follower = 0;

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public int getFollowing() {
        return following;
    }

    public void setFollowing(int following) {
        this.following = following;
    }

    public int getFollower() {
        return follower;
    }

    public void setFollower(int follower) {
        this.follower = follower;
    }

    public UpUser(int mId, String name, String face, int level, String sex, String sign, int following, int follower) {
        this.mId = mId;
        this.name = name;
        this.face = face;
        this.level = level;
        this.sex = sex;
        this.sign = sign;
        this.following = following;
        this.follower = follower;
    }
}
