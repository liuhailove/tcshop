package com.shop.tcshop.models.tctalk;

public class Banner {
    private String pic;
    private int targetId;
    private int targetType;
    private String typeTitle;
    private int bannerId;

    public Banner(String pic, int targetId, int targetType, String typeTitle, int bannerId) {
        this.pic = pic;
        this.targetId = targetId;
        this.targetType = targetType;
        this.typeTitle = typeTitle;
        this.bannerId = bannerId;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public int getTargetId() {
        return targetId;
    }

    public void setTargetId(int targetId) {
        this.targetId = targetId;
    }

    public int getTargetType() {
        return targetType;
    }

    public void setTargetType(int targetType) {
        this.targetType = targetType;
    }

    public String getTypeTitle() {
        return typeTitle;
    }

    public void setTypeTitle(String typeTitle) {
        this.typeTitle = typeTitle;
    }

    public int getBannerId() {
        return bannerId;
    }

    public void setBannerId(int bannerId) {
        this.bannerId = bannerId;
    }
}
