package com.shop.tcshop.models.tctalk;

public class SearchHotDetail {

    private String searchWord;
    private int score;
    private String content;
    private int source;
    private int iconType;
    private String iconUrl;
    private String url;
    private String alg;

    public SearchHotDetail(String searchWord, int score, String content, int source, int iconType, String iconUrl, String url, String alg) {
        this.searchWord = searchWord;
        this.score = score;
        this.content = content;
        this.source = source;
        this.iconType = iconType;
        this.iconUrl = iconUrl;
        this.url = url;
        this.alg = alg;
    }

    public String getSearchWord() {
        return searchWord;
    }

    public void setSearchWord(String searchWord) {
        this.searchWord = searchWord;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public int getIconType() {
        return iconType;
    }

    public void setIconType(int iconType) {
        this.iconType = iconType;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAlg() {
        return alg;
    }

    public void setAlg(String alg) {
        this.alg = alg;
    }
}
