package com.shop.tcshop.controller.tctalk;

import com.shop.tcshop.models.fe.Result;
import com.shop.tcshop.models.tctalk.Song;
import com.shop.tcshop.models.tctalk.SongUrl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/song")
public class SongController {
    @RequestMapping(value = "/url", method = RequestMethod.GET)
    @ResponseBody
    public Result songUrl() {

        SongUrl songUrl1 = new SongUrl();
        songUrl1.setId(1);
        songUrl1.setUrl("http://localhost:8080/mp3/demo.ogg");
        songUrl1.setBr(1);
        songUrl1.setSize(1024);
        songUrl1.setMd5("md5");
        songUrl1.setCode(1);
        songUrl1.setExpi(1);
        songUrl1.setType("tp1");
        songUrl1.setGain(1);
        songUrl1.setFee(1);
        songUrl1.setPayed(1);
        songUrl1.setFlag(1);
        songUrl1.setFee(1);


        SongUrl songUrl2 = new SongUrl();
        songUrl2.setId(2);
        songUrl2.setUrl("http://localhost:8080/song/2");
        songUrl2.setBr(2);
        songUrl2.setSize(1024);
        songUrl2.setMd5("md5");
        songUrl2.setCode(1);
        songUrl2.setExpi(1);
        songUrl2.setType("tp2");
        songUrl2.setGain(1);
        songUrl2.setFee(1);
        songUrl2.setPayed(1);
        songUrl2.setFlag(1);
        songUrl2.setFee(1);

        SongUrl songUrl3 = new SongUrl();
        songUrl3.setId(3);
        songUrl3.setUrl("http://localhost:8080/song/3");
        songUrl3.setBr(1);
        songUrl3.setSize(1024);
        songUrl3.setMd5("md5");
        songUrl3.setCode(1);
        songUrl3.setExpi(1);
        songUrl3.setType("tp3");
        songUrl3.setGain(1);
        songUrl3.setFee(1);
        songUrl3.setPayed(1);
        songUrl3.setFlag(1);
        songUrl3.setFee(1);

        SongUrl songUrl4 = new SongUrl();
        songUrl4.setId(4);
        songUrl4.setUrl("http://localhost:8080/song/4");
        songUrl4.setBr(1);
        songUrl4.setSize(1024);
        songUrl4.setMd5("md5");
        songUrl4.setCode(1);
        songUrl4.setExpi(1);
        songUrl4.setType("tp1");
        songUrl4.setGain(1);
        songUrl4.setFee(1);
        songUrl4.setPayed(1);
        songUrl4.setFlag(1);
        songUrl4.setFee(1);

        List<SongUrl> songUrls = new ArrayList<>();
        songUrls.add(songUrl1);
        songUrls.add(songUrl2);
        songUrls.add(songUrl3);
        songUrls.add(songUrl4);
        return new Result("200", songUrls);
    }

    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    @ResponseBody
    public Result songDetail(@RequestParam Integer id) {

        Song song = new Song();
        song.setId(1);
        song.setName("song1");
        return new Result("200", song);
    }
}