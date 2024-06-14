package com.shop.tcshop.controller.tctalk;

import com.alibaba.fastjson.JSONObject;
import com.shop.tcshop.models.tctalk.*;
import com.shop.tcshop.models.tctalk.artist.*;
import com.shop.tcshop.models.tctalk.artist.Artist;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/artist")
public class ArtistController {
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public JSONObject list(@RequestParam Integer type, @RequestParam Integer area, @RequestParam String initial, @RequestParam(required = false) Integer page, @RequestParam(required = false) Integer limit) {
        Artist artist = new Artist();
        artist.setId(1);
        artist.setName("artist1");
        artist.setImg1v1Url("http://localhost:8080/images/hudie.webp");

        Artist artist2 = new Artist();
        artist2.setId(2);
        artist2.setName("artist2");
        artist2.setImg1v1Url("http://localhost:8080/images/chengshi.webp");

        Artist artist3 = new Artist();
        artist3.setId(3);
        artist3.setName("artist3");
        artist3.setImg1v1Url("http://localhost:8080/images/shanding.jpg");

        List<Artist> artists = new ArrayList<>();
        artists.add(artist);
        artists.add(artist2);
        artists.add(artist3);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("artists", artists);
        return jsonObject;
    }

    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    @ResponseBody
    public JSONObject detail(@RequestParam Integer id) {
        ArtistDetail artistDetail = new ArtistDetail();
        ArtistDetailArtist artist = new ArtistDetailArtist();
        artist.setId(1);
        artist.setName("artist1");
        artist.setMusicSize(100);
        artist.setAlbumSize(80);
        artist.setMvSize(100);
        artist.setBriefDesc("第一张专辑");
        artist.setCover("http://localhost:8080/images/shangding.jpg");
        artistDetail.setArtist(artist);


        JSONObject jsonObject = new JSONObject();
        jsonObject.put("data", artistDetail);
        return jsonObject;
    }


    @RequestMapping(value = "/songs", method = RequestMethod.GET)
    @ResponseBody
    public JSONObject songs(@RequestParam Integer id, @RequestParam String order, @RequestParam Integer limit, @RequestParam Integer offset) {
        Song song = new Song();
        song.setId(1);
        song.setDjId(10000000);
        song.setName("song1");
        song.setMv(10);
        List<SongAr> ars = new ArrayList<>();
        SongAr songAr = new SongAr();
        songAr.setId(1);
        songAr.setName("songAr1");
        SongAr songAr2 = new SongAr();
        songAr2.setId(2);
        songAr2.setName("songAr2");
        ars.add(songAr);
        ars.add(songAr2);
        song.setAr(ars);
        SongAl al = new SongAl();
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
        SongAr songAr21 = new SongAr();
        songAr21.setId(1);
        songAr21.setName("songAr21");
        SongAr songAr22 = new SongAr();
        songAr22.setId(2);
        songAr22.setName("songAr22");
        ars2.add(songAr21);
        ars2.add(songAr22);
        song2.setAr(ars2);
        SongAl al2 = new SongAl();
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
        SongAr songAr31 = new SongAr();
        songAr31.setId(1);
        songAr31.setName("songAr31");
        SongAr songAr32 = new SongAr();
        songAr32.setId(2);
        songAr32.setName("songAr32");
        ars3.add(songAr31);
        ars3.add(songAr32);
        song3.setAr(ars3);
        SongAl al3 = new SongAl();
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


    @RequestMapping(value = "/album", method = RequestMethod.GET)
    @ResponseBody
    public JSONObject album(@RequestParam Integer id, @RequestParam Integer limit, @RequestParam Integer offset) {
        Album album1 = new Album();
        album1.setId(1);
        album1.setName("album1");
        album1.setPicUrl("http://localhost:8080/images/zhuanji1.jpg");
        album1.setPublishTime(System.currentTimeMillis());
        Album album2 = new Album();
        album2.setId(1);
        album2.setName("album1");
        album2.setPicUrl("http://localhost:8080/images/zhuanji2.jpeg");
        album2.setPublishTime(System.currentTimeMillis());

        List<Album> hotAlbums = new ArrayList<>();
        hotAlbums.add(album1);
        hotAlbums.add(album2);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("hotAlbums", hotAlbums);
        return jsonObject;

    }

    @RequestMapping(value = "/mv", method = RequestMethod.GET)
    @ResponseBody
    public JSONObject mv(@RequestParam Integer id, @RequestParam Integer limit, @RequestParam Integer offset) {
        Mv mv1 = new Mv();
        mv1.setId(1);
        mv1.setName("mv1");
        mv1.setImgurl("http://localhost:8080/images/tuzi.jpeg");
        mv1.setImgurl16v9("http://localhost:8080/images/tuzi.jpeg");
        mv1.setPlayCount(100);

        Mv mv2 = new Mv();
        mv2.setId(1);
        mv2.setName("mv2");
        mv2.setImgurl("http://localhost:8080/images/lang.jpg");
        mv2.setImgurl16v9("http://localhost:8080/images/lang.jpg");
        mv2.setPlayCount(200);

        List<Mv> mvs = new ArrayList<>();
        mvs.add(mv1);
        mvs.add(mv2);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("mvs", mvs);
        return jsonObject;
    }

    @RequestMapping(value = "/desc", method = RequestMethod.GET)
    @ResponseBody
    public ArtistDesc desc(@RequestParam Integer id) {
        ArtistDesc artistDesc = new ArtistDesc();
        List<ArtistDescIntroduction> introduction=new ArrayList<>();
        ArtistDescIntroduction artistDescIntroduction1=new ArtistDescIntroduction();
        artistDescIntroduction1.setTi("artistDescIntroduction1ti1");
        artistDescIntroduction1.setTxt("artistDescIntroduction1");

        ArtistDescIntroduction artistDescIntroduction2=new ArtistDescIntroduction();
        artistDescIntroduction2.setTi("artistDescIntroduction1ti2");
        artistDescIntroduction2.setTxt("artistDescIntroduction2");

        introduction.add(artistDescIntroduction1);
        introduction.add(artistDescIntroduction2);
        artistDesc.setIntroduction(introduction);

        return artistDesc;
    }
}
