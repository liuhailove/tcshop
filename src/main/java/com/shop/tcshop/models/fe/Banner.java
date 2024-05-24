package com.shop.tcshop.models.fe;

public class Banner {
    private int id;
    private String name;
    private String pic;
    private String url;


    public Banner(int id, String name, String pic, String url) {
        this.id = id;
        this.name = name;
        this.pic = pic;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
