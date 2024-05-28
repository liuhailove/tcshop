package com.shop.tcshop.models.tctalk;

import java.util.List;

public class SongAr {
    private int id;
    private String name;
    private List<String> tns;
    private List<String> alias;

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

    public List<String> getTns() {
        return tns;
    }

    public void setTns(List<String> tns) {
        this.tns = tns;
    }

    public List<String> getAlias() {
        return alias;
    }

    public void setAlias(List<String> alias) {
        this.alias = alias;
    }
}
