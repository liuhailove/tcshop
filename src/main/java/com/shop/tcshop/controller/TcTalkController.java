package com.shop.tcshop.controller;

import com.alibaba.fastjson.JSONObject;
import com.shop.tcshop.models.tctalk.Artist;
import com.shop.tcshop.models.tctalk.Banner;
import com.shop.tcshop.models.tctalk.PersonalizedMvResp;
import com.shop.tcshop.models.tctalk.PersonalizedResp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
        List<Artist> artists=new ArrayList<>();
        Artist artist1=new Artist(1,"artist1");
        Artist artist2=new Artist(2,"artist2");
        artists.add(artist1);
        artists.add(artist2);

        PersonalizedMvResp personalizedMvResp=new PersonalizedMvResp(1,1,"mv1","TcTalk","http://localhost:8080/images/apple-1.jpeg",true,System.currentTimeMillis(),1000L,100,true,artists,"artistName1",1,"alg1");
        PersonalizedMvResp personalizedMvResp2=new PersonalizedMvResp(2,2,"mv2","TcTalk","http://localhost:8080/images/apple-2.jpeg",true,System.currentTimeMillis(),800L,1100,true,artists,"artistName1",1,"alg1");
        PersonalizedMvResp personalizedMvResp3=new PersonalizedMvResp(3,3,"mv3","TcTalk","http://localhost:8080/images/apple-3.jpeg",true,System.currentTimeMillis(),900L,1200,true,artists,"artistName1",1,"alg1");
        PersonalizedMvResp personalizedMvResp4=new PersonalizedMvResp(4,4,"mv4","TcTalk","http://localhost:8080/images/apple-4.jpeg",true,System.currentTimeMillis(),1100L,1300,true,artists,"artistName1",1,"alg1");
        PersonalizedMvResp personalizedMvResp5=new PersonalizedMvResp(5,5,"mv5","TcTalk","http://localhost:8080/images/apple-5.jpeg",true,System.currentTimeMillis(),1200L,1400,true,artists,"artistName1",1,"alg1");

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
        List<Artist> artists=new ArrayList<>();
        Artist artist1=new Artist(1,"artist1");
        Artist artist2=new Artist(2,"artist2");
        artists.add(artist1);
        artists.add(artist2);

        PersonalizedMvResp personalizedMvResp=new PersonalizedMvResp(1,1,"mv1","TcTalk","http://localhost:8080/images/apple-1.jpeg",true,System.currentTimeMillis(),1000L,100,true,artists,"artistName1",1,"alg1");
        PersonalizedMvResp personalizedMvResp2=new PersonalizedMvResp(2,2,"mv2","TcTalk","http://localhost:8080/images/apple-2.jpeg",true,System.currentTimeMillis(),800L,1100,true,artists,"artistName1",1,"alg1");
        PersonalizedMvResp personalizedMvResp3=new PersonalizedMvResp(3,3,"mv3","TcTalk","http://localhost:8080/images/apple-3.jpeg",true,System.currentTimeMillis(),900L,1200,true,artists,"artistName1",1,"alg1");
        PersonalizedMvResp personalizedMvResp4=new PersonalizedMvResp(4,4,"mv4","TcTalk","http://localhost:8080/images/apple-4.jpeg",true,System.currentTimeMillis(),1100L,1300,true,artists,"artistName1",1,"alg1");
        PersonalizedMvResp personalizedMvResp5=new PersonalizedMvResp(5,5,"mv5","TcTalk","http://localhost:8080/images/apple-5.jpeg",true,System.currentTimeMillis(),1200L,1400,true,artists,"artistName1",1,"alg1");

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
}
