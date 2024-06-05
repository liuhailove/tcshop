package com.shop.tcshop.controller.tctalk;

import com.alibaba.fastjson.JSONObject;
import com.shop.tcshop.models.tctalk.PNSSong;
import com.shop.tcshop.models.tctalk.PNSSongArtists;
import com.shop.tcshop.models.tctalk.PersonalizedNewSong;
import com.shop.tcshop.models.tctalk.category.TopCategory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/tccategoty")
public class TcCategoryController {


    @RequestMapping(value = "/toplist", method = RequestMethod.GET)
    @ResponseBody
    public JSONObject toplist() {
        List<TopCategory> topCategories = new ArrayList<>();
        PersonalizedNewSong newSong1 = new PersonalizedNewSong();
        newSong1.setId(1);
        newSong1.setType(1);
        newSong1.setName("baihuli");
        newSong1.setPicUrl("http://localhost:8080/images/xiaohongmao.jpg");
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
        newSong2.setPicUrl("http://localhost:8080/images/muzhiguniang.jpg");
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

//        PersonalizedNewSong newSong4 = new PersonalizedNewSong();
//        newSong4.setId(4);
//        newSong4.setType(4);
//        newSong4.setName("huli.jpeg");
//        newSong4.setPicUrl("http://localhost:8080/images/huli.jpeg");
//        newSong4.setAlg("alg4");
//        PNSSong pnsSong4 = new PNSSong();
//        pnsSong4.setName("pnsSong4");
//        pnsSong4.setStatus(1);
//        pnsSong4.setFee(100);
//        pnsSong4.setId(4);
//        List<PNSSongArtists> artists = new ArrayList<>();
//        PNSSongArtists artists4 = new PNSSongArtists();
//        artists4.setId(4);
//        artists4.setName("artists4");
//        artists.add(artists4);
//        pnsSong4.setArtists(artists);
//        newSong4.setSong(pnsSong4);
//
//        PersonalizedNewSong newSong5 = new PersonalizedNewSong();
//        newSong5.setId(5);
//        newSong5.setType(5);
//        newSong5.setName("ma.jpeg");
//        newSong5.setPicUrl("http://localhost:8080/images/ma.jpeg");
//        newSong5.setAlg("alg5");
//        PNSSong pnsSong5 = new PNSSong();
//        pnsSong5.setName("pnsSong5");
//        pnsSong5.setStatus(1);
//        pnsSong5.setFee(100);
//        pnsSong5.setId(5);
//        List<PNSSongArtists> artists5 = new ArrayList<>();
//        PNSSongArtists artist5 = new PNSSongArtists();
//        artist5.setId(5);
//        artist5.setName("artists5");
//        artists5.add(artist5);
//        pnsSong5.setArtists(artists5);
//        newSong5.setSong(pnsSong5);


        List<PersonalizedNewSong> personalizedNewSongs = new ArrayList<>();
        personalizedNewSongs.add(newSong1);
        personalizedNewSongs.add(newSong2);
        personalizedNewSongs.add(newSong3);
//        personalizedNewSongs.add(newSong4);
//        personalizedNewSongs.add(newSong5);

        TopCategory topCategory1 = new TopCategory();
        topCategory1.setId(1);
        topCategory1.setName("世界名著");
        topCategory1.setUpdateTime(System.currentTimeMillis());
        topCategory1.setTopNewSongList(personalizedNewSongs);

        TopCategory topCategory2 = new TopCategory();
        topCategory2.setId(2);
        topCategory2.setName("童话故事");
        topCategory2.setUpdateTime(System.currentTimeMillis());
        topCategory2.setTopNewSongList(personalizedNewSongs);

        TopCategory topCategory3 = new TopCategory();
        topCategory3.setId(3);
        topCategory3.setName("育儿经典");
        topCategory3.setUpdateTime(System.currentTimeMillis());
        topCategory3.setTopNewSongList(personalizedNewSongs);

        TopCategory topCategory4 = new TopCategory();
        topCategory4.setId(4);
        topCategory4.setName("相声评书");
        topCategory4.setUpdateTime(System.currentTimeMillis());
        topCategory4.setTopNewSongList(personalizedNewSongs);

        topCategories.add(topCategory1);
        topCategories.add(topCategory2);
        topCategories.add(topCategory3);
        topCategories.add(topCategory4);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("result", topCategories);
        return jsonObject;
    }
}
