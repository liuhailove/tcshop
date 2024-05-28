package com.shop.tcshop.controller;

import com.alibaba.fastjson.JSONObject;
import com.shop.tcshop.models.tctalk.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class TcTalkController {
    @RequestMapping(value = "/banner", method = RequestMethod.GET)
    @ResponseBody
    public JSONObject banner() {
        Banner b1 = new Banner("http://localhost:8080/images/lu.jpeg", 1, 1, "lu", 1);
        Banner b2 = new Banner("http://localhost:8080/images/bird.jpeg", 2, 2, "bird", 2);
        Banner b3 = new Banner("http://localhost:8080/images/xishi2.png", 3, 3, "xishi2", 3);
        Banner b4 = new Banner("http://localhost:8080/images/yc.jpg", 4, 4, "yc", 4);

        List<Banner> banners = new ArrayList<>();
        banners.add(b4);
        banners.add(b2);
        banners.add(b3);
        banners.add(b1);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("banners", banners);
        return jsonObject;
    }

    @RequestMapping(value = "/personalized", method = RequestMethod.GET)
    @ResponseBody
    public JSONObject personalized() {
        PersonalizedResp personalizedResp1 = new PersonalizedResp(1, 1, "p1name", "p1copywriter", "http://localhost:8080/images/cat.png", true, System.currentTimeMillis(), 100, 1000, true, "alg1");
        PersonalizedResp personalizedResp2 = new PersonalizedResp(2, 1, "p2name", "p2copywriter", "http://localhost:8080/images/tree.png", true, System.currentTimeMillis(), 110, 1000, true, "alg1");
        PersonalizedResp personalizedResp3 = new PersonalizedResp(3, 2, "p3name", "p3copywriter", "http://localhost:8080/images/sand.png", true, System.currentTimeMillis(), 120, 1000, false, "alg1");
        PersonalizedResp personalizedResp4 = new PersonalizedResp(4, 3, "p4name", "p4copywriter", "http://localhost:8080/images/cat.png", true, System.currentTimeMillis(), 130, 1000, true, "alg1");
        PersonalizedResp personalizedResp5 = new PersonalizedResp(5, 2, "p5name", "p4copywriter", "http://localhost:8080/images/hot_product_banner.png", true, System.currentTimeMillis(), 130, 1000, true, "alg1");
        PersonalizedResp personalizedResp6 = new PersonalizedResp(6, 5, "p6name", "p4copywriter", "http://localhost:8080/images/jyz.jpg", true, System.currentTimeMillis(), 130, 1000, true, "alg1");
        PersonalizedResp personalizedResp7 = new PersonalizedResp(7, 6, "p7name", "p4copywriter", "http://localhost:8080/images/jyz2.jpg", true, System.currentTimeMillis(), 130, 1000, true, "alg1");
        PersonalizedResp personalizedResp8 = new PersonalizedResp(8, 7, "p8name", "p4copywriter", "http://localhost:8080/images/jyz2.jpg", true, System.currentTimeMillis(), 130, 1000, true, "alg1");

        List<PersonalizedResp> personalizedResps = new ArrayList<>();
        personalizedResps.add(personalizedResp1);
        personalizedResps.add(personalizedResp2);
        personalizedResps.add(personalizedResp3);
        personalizedResps.add(personalizedResp4);
        personalizedResps.add(personalizedResp5);
        personalizedResps.add(personalizedResp6);
        personalizedResps.add(personalizedResp7);
        personalizedResps.add(personalizedResp8);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("result", personalizedResps);
        return jsonObject;
    }

    @RequestMapping(value = "/personalized/mv", method = RequestMethod.GET)
    @ResponseBody
    public JSONObject personalizedMv() {
        List<Artist> artists = new ArrayList<>();
        Artist artist1 = new Artist(1, "artist1");
        Artist artist2 = new Artist(2, "artist2");
        artists.add(artist1);
        artists.add(artist2);

        PersonalizedMvResp personalizedMvResp = new PersonalizedMvResp(1, 1, "mv1", "TcTalk", "http://localhost:8080/images/apple-1.jpeg", true, System.currentTimeMillis(), 1000L, 100, true, artists, "artistName1", 1, "alg1");
        PersonalizedMvResp personalizedMvResp2 = new PersonalizedMvResp(2, 2, "mv2", "TcTalk", "http://localhost:8080/images/apple-2.jpeg", true, System.currentTimeMillis(), 800L, 1100, true, artists, "artistName1", 1, "alg1");
        PersonalizedMvResp personalizedMvResp3 = new PersonalizedMvResp(3, 3, "mv3", "TcTalk", "http://localhost:8080/images/apple-3.jpeg", true, System.currentTimeMillis(), 900L, 1200, true, artists, "artistName1", 1, "alg1");
        PersonalizedMvResp personalizedMvResp4 = new PersonalizedMvResp(4, 4, "mv4", "TcTalk", "http://localhost:8080/images/apple-4.jpeg", true, System.currentTimeMillis(), 1100L, 1300, true, artists, "artistName1", 1, "alg1");
        PersonalizedMvResp personalizedMvResp5 = new PersonalizedMvResp(5, 5, "mv5", "TcTalk", "http://localhost:8080/images/apple-5.jpeg", true, System.currentTimeMillis(), 1200L, 1400, true, artists, "artistName1", 1, "alg1");

        List<PersonalizedMvResp> personalizedMvResps = new ArrayList<>();
        personalizedMvResps.add(personalizedMvResp);
        personalizedMvResps.add(personalizedMvResp2);
        personalizedMvResps.add(personalizedMvResp3);
        personalizedMvResps.add(personalizedMvResp4);
        personalizedMvResps.add(personalizedMvResp5);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("result", personalizedMvResps);
        return jsonObject;
    }

    @RequestMapping(value = "/personalized/newsong", method = RequestMethod.GET)
    @ResponseBody
    public JSONObject personalizedNewsong() {
        PersonalizedNewSong newSong1 = new PersonalizedNewSong();
        newSong1.setId(1);
        newSong1.setType(1);
        newSong1.setName("baihuli");
        newSong1.setPicUrl("http://localhost:8080/images/baihuli.jpeg");
        newSong1.setAlg("alg1");
        PNSSong pnsSong1 = new PNSSong();
        pnsSong1.setName("pnsSong1");
        pnsSong1.setStatus(1);
        pnsSong1.setFee(100);
        pnsSong1.setId(1);
        List<PNSSongArtists> artists1 = new ArrayList<>();
        PNSSongArtists artist1 = new PNSSongArtists();
        artist1.setId(2);
        artist1.setName("artists2");
        artists1.add(artist1);
        pnsSong1.setArtists(artists1);
        newSong1.setSong(pnsSong1);

        PersonalizedNewSong newSong2 = new PersonalizedNewSong();
        newSong2.setId(3);
        newSong2.setType(3);
        newSong2.setName("houzi.jpeg");
        newSong2.setPicUrl("http://localhost:8080/images/houzi.jpeg");
        newSong2.setAlg("alg2");
        PNSSong pnsSong2 = new PNSSong();
        pnsSong2.setName("pnsSong2");
        pnsSong2.setStatus(3);
        pnsSong2.setFee(100);
        pnsSong2.setId(3);
        List<PNSSongArtists> artists2 = new ArrayList<>();
        PNSSongArtists artist2 = new PNSSongArtists();
        artist2.setId(2);
        artist2.setName("artists2");
        artists2.add(artist2);
        pnsSong2.setArtists(artists2);
        newSong2.setSong(pnsSong2);

        PersonalizedNewSong newSong3 = new PersonalizedNewSong();
        newSong3.setId(3);
        newSong3.setType(3);
        newSong3.setName("hu.jpeg");
        newSong3.setPicUrl("http://localhost:8080/images/hu.jpeg");
        newSong3.setAlg("alg3");
        PNSSong pnsSong3 = new PNSSong();
        pnsSong3.setName("pnsSong3");
        pnsSong3.setStatus(1);
        pnsSong3.setFee(100);
        pnsSong3.setId(3);
        List<PNSSongArtists> artists3 = new ArrayList<>();
        PNSSongArtists artist3 = new PNSSongArtists();
        artist3.setId(3);
        artist3.setName("artists3");
        artists3.add(artist3);
        pnsSong3.setArtists(artists3);
        newSong3.setSong(pnsSong3);

        PersonalizedNewSong newSong4 = new PersonalizedNewSong();
        newSong4.setId(4);
        newSong4.setType(4);
        newSong4.setName("huli.jpeg");
        newSong4.setPicUrl("http://localhost:8080/images/huli.jpeg");
        newSong4.setAlg("alg4");
        PNSSong pnsSong4 = new PNSSong();
        pnsSong4.setName("pnsSong4");
        pnsSong4.setStatus(1);
        pnsSong4.setFee(100);
        pnsSong4.setId(4);
        List<PNSSongArtists> artists = new ArrayList<>();
        PNSSongArtists artists4 = new PNSSongArtists();
        artists4.setId(4);
        artists4.setName("artists4");
        artists.add(artists4);
        pnsSong4.setArtists(artists);
        newSong4.setSong(pnsSong4);

        PersonalizedNewSong newSong5 = new PersonalizedNewSong();
        newSong5.setId(5);
        newSong5.setType(5);
        newSong5.setName("ma.jpeg");
        newSong5.setPicUrl("http://localhost:8080/images/ma.jpeg");
        newSong5.setAlg("alg5");
        PNSSong pnsSong5 = new PNSSong();
        pnsSong5.setName("pnsSong5");
        pnsSong5.setStatus(1);
        pnsSong5.setFee(100);
        pnsSong5.setId(5);
        List<PNSSongArtists> artists5 = new ArrayList<>();
        PNSSongArtists artist5 = new PNSSongArtists();
        artist5.setId(5);
        artist5.setName("artists5");
        artists5.add(artist5);
        pnsSong5.setArtists(artists5);
        newSong5.setSong(pnsSong5);


        List<PersonalizedNewSong> personalizedNewSongs = new ArrayList<>();
        personalizedNewSongs.add(newSong1);
        personalizedNewSongs.add(newSong2);
        personalizedNewSongs.add(newSong3);
        personalizedNewSongs.add(newSong4);
        personalizedNewSongs.add(newSong5);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("result", personalizedNewSongs);
        return jsonObject;
    }

    @RequestMapping(value = "/personalized/djprogram", method = RequestMethod.GET)
    @ResponseBody
    public JSONObject personalizedDjprogram() {
        DjProgram djProgram1 = new DjProgram();
        djProgram1.setId(1);
        djProgram1.setName("djProgram1");
        djProgram1.setType(1);
        djProgram1.setCopywriter("djProgram1copywriter");
        djProgram1.setPicUrl("http://localhost:8080/images/ma.jpeg");
        djProgram1.setCanDislike(true);
        djProgram1.setTrackNumberUpdateTime(System.currentTimeMillis());

        DjProgram djProgram2 = new DjProgram();
        djProgram2.setId(2);
        djProgram2.setName("djProgram2");
        djProgram2.setType(2);
        djProgram2.setCopywriter("djProgram2copywriter");
        djProgram2.setPicUrl("http://localhost:8080/images/yang.jpeg");
        djProgram2.setCanDislike(false);
        djProgram2.setTrackNumberUpdateTime(System.currentTimeMillis());

        DjProgram djProgram3 = new DjProgram();
        djProgram3.setId(3);
        djProgram3.setName("djProgram3");
        djProgram3.setType(3);
        djProgram3.setCopywriter("djProgram3copywriter");
        djProgram3.setPicUrl("http://localhost:8080/images/xishi2.png");
        djProgram3.setCanDislike(true);
        djProgram3.setTrackNumberUpdateTime(System.currentTimeMillis());

        DjProgram djProgram4 = new DjProgram();
        djProgram4.setId(4);
        djProgram4.setName("djProgram4");
        djProgram4.setType(4);
        djProgram4.setCopywriter("djProgram4copywriter");
        djProgram4.setPicUrl("http://localhost:8080/images/id_card_front.png");
        djProgram4.setCanDislike(false);
        djProgram4.setTrackNumberUpdateTime(System.currentTimeMillis());

        List<DjProgram> djPrograms = new ArrayList<>();
        djPrograms.add(djProgram1);
        djPrograms.add(djProgram2);
        djPrograms.add(djProgram3);
        djPrograms.add(djProgram4);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("result", djPrograms);
        return jsonObject;
    }

    @RequestMapping(value = "/personalized/privatecontent/list", method = RequestMethod.GET)
    @ResponseBody
    public JSONObject personalizedPrivatecontentList(@RequestParam int limit, @RequestParam int offset) {
        PersonalizedPrivateContent personalizedPrivateContent1 = new PersonalizedPrivateContent();
        personalizedPrivateContent1.setId(1);
        personalizedPrivateContent1.setName("personalizedPrivateContent1");
        personalizedPrivateContent1.setType(1);
        personalizedPrivateContent1.setCopywriter("personalizedPrivateContent1copywriter");
        personalizedPrivateContent1.setPicUrl("http://localhost:8080/images/dongman1.jpg");
        personalizedPrivateContent1.setsPicUrl("http://localhost:8080/images/dongman1.jpg");


        PersonalizedPrivateContent personalizedPrivateContent2 = new PersonalizedPrivateContent();
        personalizedPrivateContent2.setId(2);
        personalizedPrivateContent2.setName("personalizedPrivateContent2");
        personalizedPrivateContent2.setType(2);
        personalizedPrivateContent2.setCopywriter("personalizedPrivateContent1copywriter2");
        personalizedPrivateContent2.setPicUrl("http://localhost:8080/images/dongman3.jpeg");
        personalizedPrivateContent2.setsPicUrl("http://localhost:8080/images/dongman3.jpeg");


        PersonalizedPrivateContent personalizedPrivateContent3 = new PersonalizedPrivateContent();
        personalizedPrivateContent3.setId(3);
        personalizedPrivateContent3.setName("personalizedPrivateContent3");
        personalizedPrivateContent3.setType(3);
        personalizedPrivateContent3.setCopywriter("personalizedPrivateContent1copywriter3");
        personalizedPrivateContent3.setPicUrl("http://localhost:8080/images/dongman4.jpeg");
        personalizedPrivateContent3.setsPicUrl("http://localhost:8080/images/dongman4.jpeg");


        PersonalizedPrivateContent personalizedPrivateContent4 = new PersonalizedPrivateContent();
        personalizedPrivateContent4.setId(4);
        personalizedPrivateContent4.setName("personalizedPrivateContent4");
        personalizedPrivateContent4.setType(4);
        personalizedPrivateContent4.setCopywriter("personalizedPrivateContent1copywriter4");
        personalizedPrivateContent4.setPicUrl("http://localhost:8080/images/ma.jpeg");
        personalizedPrivateContent4.setsPicUrl("http://localhost:8080/images/ma.jpeg");


        List<PersonalizedPrivateContent> personalizedPrivateContents = new ArrayList<>();
        personalizedPrivateContents.add(personalizedPrivateContent1);
        personalizedPrivateContents.add(personalizedPrivateContent2);
        personalizedPrivateContents.add(personalizedPrivateContent3);
        personalizedPrivateContents.add(personalizedPrivateContent4);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("result", personalizedPrivateContents);
        return jsonObject;
    }
}
