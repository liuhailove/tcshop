package com.shop.tcshop.controller.tctalk;

import com.alibaba.fastjson.JSONObject;
import com.shop.tcshop.models.fe.Result;
import com.shop.tcshop.models.tctalk.Video;
import com.shop.tcshop.models.tctalk.VideoData;
import com.shop.tcshop.models.tctalk.VideoGroup;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/video")
public class VideoController {
    @RequestMapping(value = "/group", method = RequestMethod.GET)
    @ResponseBody
    public JSONObject group(@RequestParam int id,@RequestParam int offset) {
        Video video1=new Video();
        video1.setId(1);
        video1.setType(1);
        VideoData data1=new VideoData();
        data1.setVid("1");
        data1.setCoverUrl("http://localhost:8080/images/hamburger.png");
        data1.setTitle("hamburger");
        video1.setData(data1);

        Video video2=new Video();
        video2.setId(2);
        video2.setType(2);
        VideoData data2=new VideoData();
        data2.setVid("2");
        data2.setCoverUrl("http://localhost:8080/images/huli.jpeg");
        data2.setTitle("hamburger");
        video2.setData(data2);

        List<Video> videoList=new ArrayList<>();
        videoList.add(video1);
        videoList.add(video2);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("datas", videoList);
        return jsonObject;
    }

    @RequestMapping(value = "/group/list", method = RequestMethod.GET)
    @ResponseBody
    public Result groupList(@RequestParam(required = false) Integer id,@RequestParam(required = false) Integer offset) {
        VideoGroup videoGroup1=new VideoGroup();
        videoGroup1.setId(1);
        videoGroup1.setName("videoGroup1");
        videoGroup1.setUrl("https://www.baidu.com/");
        videoGroup1.setRelatedVideoType(1);
        videoGroup1.setSelectTab(true);
        videoGroup1.setAbExtInfo("abExtInfo1");

        VideoGroup videoGroup2=new VideoGroup();
        videoGroup2.setId(2);
        videoGroup2.setName("videoGroup2");
        videoGroup2.setUrl("https://www.baidu.com/2");
        videoGroup2.setRelatedVideoType(2);
        videoGroup2.setSelectTab(true);
        videoGroup2.setAbExtInfo("abExtInfo2");

        VideoGroup videoGroup3=new VideoGroup();
        videoGroup3.setId(3);
        videoGroup3.setName("videoGroup3");
        videoGroup3.setUrl("https://www.baidu.com/3");
        videoGroup3.setRelatedVideoType(3);
        videoGroup3.setSelectTab(false);
        videoGroup3.setAbExtInfo("abExtInfo3");

        List<VideoGroup> videoGroups=new ArrayList<>();
        videoGroups.add(videoGroup1);
        videoGroups.add(videoGroup2);
        videoGroups.add(videoGroup3);

        return new Result("200", videoGroups);
    }

    @RequestMapping(value = "/timeline/all", method = RequestMethod.GET)
    @ResponseBody
    public JSONObject timelineAll(@RequestParam(required = false) Integer id,@RequestParam(required = false) Integer offset) {
        Video video1=new Video();
        video1.setId(1);
        video1.setType(1);
        VideoData data1=new VideoData();
        data1.setVid("1");
        data1.setCoverUrl("http://localhost:8080/images/hamburger.png");
        data1.setTitle("hamburger");
        video1.setData(data1);

        Video video2=new Video();
        video2.setId(2);
        video2.setType(2);
        VideoData data2=new VideoData();
        data2.setVid("2");
        data2.setCoverUrl("http://localhost:8080/images/huli.jpeg");
        data2.setTitle("hamburger");
        video2.setData(data2);

        List<Video> videoList=new ArrayList<>();
        videoList.add(video1);
        videoList.add(video2);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("datas", videoList);
        return jsonObject;
    }
}
