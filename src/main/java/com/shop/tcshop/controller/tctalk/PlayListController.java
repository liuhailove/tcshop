package com.shop.tcshop.controller.tctalk;

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
@RequestMapping("/playlist")
public class PlayListController {
    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    @ResponseBody
    public JSONObject detail(@RequestParam Integer id, @RequestParam String s) {
        PlayListDetail playListDetail = new PlayListDetail();
        playListDetail.setId(1);
        playListDetail.setCoverImgUrl("http://localhost:8080/images/huli.jpeg");
        playListDetail.setName("playListDetailName");
        PlayListDetailCreator creator=new PlayListDetailCreator();
        creator.setAvatarUrl("http://localhost:8080/images/hamburger.png");
        creator.setNickname("hamburger");
        playListDetail.setCreator(creator);
        List<String> tags=new ArrayList<>();
        tags.add("tag1");
        tags.add("tag2");
        tags.add("tag3");
        playListDetail.setTags(tags);
        playListDetail.setDescription("hamburger description");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("playlist", playListDetail);
        return jsonObject;
    }

    @RequestMapping(value = "/track/all", method = RequestMethod.GET)
    @ResponseBody
    public JSONObject listTrackAll(@RequestParam Integer id) {
        Song song = new Song();
        song.setId(1);
        song.setDjId(10000000);
        song.setName("song1");
        song.setMv(10);
        List<SongAr> ars = new ArrayList<>();
        SongAr songAr=new SongAr();
        songAr.setId(1);
        songAr.setName("songAr1");
        SongAr songAr2=new SongAr();
        songAr2.setId(2);
        songAr2.setName("songAr2");
        ars.add(songAr);
        ars.add(songAr2);
        song.setAr(ars);
        SongAl al=new SongAl();
        al.setId(1);
        al.setName("al1");
        song.setAl(al);
        song.setDt(3600);

        Song song2 = new Song();
        song2.setId(2);
        song2.setDjId(20000000);
        song2.setName("song2");
        song2.setMv(10);
        List<SongAr> ars2 = new ArrayList<>();
        SongAr songAr21=new SongAr();
        songAr21.setId(1);
        songAr21.setName("songAr21");
        SongAr songAr22=new SongAr();
        songAr22.setId(2);
        songAr22.setName("songAr22");
        ars2.add(songAr21);
        ars2.add(songAr22);
        song2.setAr(ars2);
        SongAl al2=new SongAl();
        al2.setId(12);
        al2.setName("al2");
        song2.setAl(al2);
        song2.setDt(6400);

        Song song3 = new Song();
        song3.setId(3);
        song3.setDjId(30000000);
        song3.setName("song3");
        song3.setMv(30);
        List<SongAr> ars3 = new ArrayList<>();
        SongAr songAr31=new SongAr();
        songAr31.setId(1);
        songAr31.setName("songAr31");
        SongAr songAr32=new SongAr();
        songAr32.setId(2);
        songAr32.setName("songAr32");
        ars3.add(songAr31);
        ars3.add(songAr32);
        song3.setAr(ars3);
        SongAl al3=new SongAl();
        al3.setId(123);
        al3.setName("al3");
        song3.setAl(al3);
        song3.setDt(12400);

        List<Song> songs = new ArrayList<>();
        songs.add(song);
        songs.add(song2);
        songs.add(song3);
        songs.add(song);
        songs.add(song2);
        songs.add(song3);
        songs.add(song);
        songs.add(song2);
        songs.add(song3);
        songs.add(song);
        songs.add(song2);
        songs.add(song3);
        songs.add(song);
        songs.add(song2);
        songs.add(song3);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("songs", songs);
        return jsonObject;
    }
}
