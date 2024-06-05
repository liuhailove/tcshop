package com.shop.tcshop.models.tctalk.category;

import com.shop.tcshop.models.tctalk.PersonalizedNewSong;

import java.util.List;

public class TopCategory {
    private Integer id;
    private String name;
    private Long createTime;
    private Long updateTime;
    private List<PersonalizedNewSong> topNewSongList;

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

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public List<PersonalizedNewSong> getTopNewSongList() {
        return topNewSongList;
    }

    public void setTopNewSongList(List<PersonalizedNewSong> topNewSongList) {
        this.topNewSongList = topNewSongList;
    }
}
