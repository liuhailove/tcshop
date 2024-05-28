package com.shop.tcshop.controller.tctalk;

import com.alibaba.fastjson.JSONObject;
import com.shop.tcshop.models.tctalk.top.TopListDetail;
import com.shop.tcshop.models.tctalk.top.TopListDetailTracks;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/toplist")
public class TopController {
    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    @ResponseBody
    public JSONObject groupList() {
        TopListDetail topListDetail1=new TopListDetail();
        topListDetail1.setId(1);
        topListDetail1.setName("topListDetail1");
        topListDetail1.setCoverImgUrl("http://localhost:8080/images/huli.jpeg");
        topListDetail1.setPlayCount(100);

        TopListDetailTracks tracks11=new TopListDetailTracks();
        tracks11.setFirst("tracks111");
        tracks11.setSecond("tracks12");

        TopListDetailTracks tracks12=new TopListDetailTracks();
        tracks11.setFirst("tracks121");
        tracks11.setSecond("tracks122");

        List<TopListDetailTracks> tracksList=new ArrayList<>();
        tracksList.add(tracks11);
        tracksList.add(tracks12);
        topListDetail1.setTracks(tracksList);



        TopListDetail topListDetail2=new TopListDetail();
        topListDetail2.setId(2);
        topListDetail2.setName("topListDetail3");
        topListDetail2.setCoverImgUrl("http://localhost:8080/images/jyz.jpg");
        topListDetail2.setPlayCount(10220);

        TopListDetailTracks tracks121=new TopListDetailTracks();
        tracks121.setFirst("tracks1110");
        tracks121.setSecond("tracks120");

        TopListDetailTracks tracks122=new TopListDetailTracks();
        tracks122.setFirst("tracks1210");
        tracks122.setSecond("tracks1220");

        List<TopListDetailTracks> tracksList2=new ArrayList<>();
        tracksList2.add(tracks121);
        tracksList2.add(tracks122);
        topListDetail2.setTracks(tracksList2);


        TopListDetail topListDetail3=new TopListDetail();
        topListDetail3.setId(3);
        topListDetail3.setName("topListDetail4");
        topListDetail3.setCoverImgUrl("http://localhost:8080/images/bird.jpeg");
        topListDetail3.setPlayCount(1020);

        TopListDetailTracks tracks0121=new TopListDetailTracks();
        tracks0121.setFirst("tracks1110");
        tracks0121.setSecond("tracks120");

        TopListDetailTracks tracks0122=new TopListDetailTracks();
        tracks0122.setFirst("tracks1210");
        tracks0122.setSecond("tracks1220");

        List<TopListDetailTracks> tracksList3=new ArrayList<>();
        tracksList3.add(tracks0121);
        tracksList3.add(tracks0122);
        topListDetail3.setTracks(tracksList3);




        TopListDetail topListDetail4=new TopListDetail();
        topListDetail4.setId(4);
        topListDetail4.setName("topListDetail5");
        topListDetail4.setCoverImgUrl("http://localhost:8080/images/hu.jpeg");
        topListDetail4.setPlayCount(2100);

        TopListDetailTracks tracks1211=new TopListDetailTracks();
        tracks1211.setFirst("tracks1110");
        tracks1211.setSecond("tracks120");

        TopListDetailTracks tracks1212=new TopListDetailTracks();
        tracks1212.setFirst("tracks1210");
        tracks1212.setSecond("tracks1220");

        List<TopListDetailTracks> tracksList4=new ArrayList<>();
        tracksList4.add(tracks1211);
        tracksList4.add(tracks1212);
        topListDetail4.setTracks(tracksList4);



        TopListDetail topListDetail5=new TopListDetail();
        topListDetail5.setId(5);
        topListDetail5.setName("topListDetail0");
        topListDetail5.setCoverImgUrl("http://localhost:8080/images/ma.jpeg");
        topListDetail5.setPlayCount(1010);

        TopListDetailTracks tracks12111=new TopListDetailTracks();
        tracks12111.setFirst("tracks1110");
        tracks12111.setSecond("tracks120");

        TopListDetailTracks tracks1122=new TopListDetailTracks();
        tracks1122.setFirst("tracks1210");
        tracks1122.setSecond("tracks1220");

        List<TopListDetailTracks> tracksList5=new ArrayList<>();
        tracksList5.add(tracks12111);
        tracksList5.add(tracks1122);
        topListDetail5.setTracks(tracksList5);


        TopListDetail topListDetail6=new TopListDetail();
        topListDetail6.setId(6);
        topListDetail6.setName("topListDetail221");
        topListDetail6.setCoverImgUrl("http://localhost:8080/images/ma.jpeg");
        topListDetail6.setPlayCount(10110);

        TopListDetailTracks tracks121101=new TopListDetailTracks();
        tracks121101.setFirst("tracks1110");
        tracks121101.setSecond("tracks120");

        TopListDetailTracks tracks11202=new TopListDetailTracks();
        tracks11202.setFirst("tracks1210");
        tracks11202.setSecond("tracks1220");

        List<TopListDetailTracks> tracksList50=new ArrayList<>();
        tracksList5.add(tracks121101);
        tracksList5.add(tracks1122);
        topListDetail6.setTracks(tracksList50);


        List<TopListDetail> topListDetails=new ArrayList<>();
        topListDetails.add(topListDetail1);
        topListDetails.add(topListDetail2);
        topListDetails.add(topListDetail3);
        topListDetails.add(topListDetail4);
        topListDetails.add(topListDetail5);
        topListDetails.add(topListDetail6);


        JSONObject jsonObject = new JSONObject();
        jsonObject.put("list", topListDetails);
        return jsonObject;
    }
}
