package com.shop.tcshop.controller.tctalk;

import com.alibaba.fastjson.JSONObject;
import com.shop.tcshop.models.tctalk.Barrage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/av")
public class AvController {
    @RequestMapping(value = "/barrage/{cid}", method = RequestMethod.GET)
    @ResponseBody
    public JSONObject detail(@PathVariable Integer cid) {
        List<Barrage> barrageList=new ArrayList<>();

        Barrage barrage=new Barrage();
        barrage.setType("1");
        barrage.setContent("这是第一个字幕");
        barrage.setDecimalColor("f0f5e1");
        barrage.setTime("1");


        Barrage barrage2=new Barrage();
        barrage2.setType("2");
        barrage2.setContent("这是第2个字幕");
        barrage2.setDecimalColor("c85862");
        barrage2.setTime("4");


        Barrage barrage3=new Barrage();
        barrage3.setType("3");
        barrage3.setContent("这是第3个字幕");
        barrage3.setDecimalColor("5ba585");
        barrage3.setTime("6");

        barrageList.add(barrage);
        barrageList.add(barrage2);
        barrageList.add(barrage3);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("barrageDatas", barrageList);
        return jsonObject;
    }
}
