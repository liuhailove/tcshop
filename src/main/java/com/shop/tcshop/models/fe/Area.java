package com.shop.tcshop.models.fe;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Area {
    private Integer id;
    private String name;
    @JsonProperty("entrace_icon")
    private EntranceIcon entranceIcon;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EntranceIcon getEntranceIcon() {
        return entranceIcon;
    }

    public void setEntranceIcon(EntranceIcon entranceIcon) {
        this.entranceIcon = entranceIcon;
    }

    public Area(Integer id, String name, EntranceIcon entranceIcon) {
        this.id = id;
        this.name = name;
        this.entranceIcon = entranceIcon;
    }
}
