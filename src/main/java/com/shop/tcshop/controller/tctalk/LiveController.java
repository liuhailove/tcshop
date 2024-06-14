package com.shop.tcshop.controller.tctalk;

import com.alibaba.fastjson.JSONObject;
import com.shop.tcshop.models.fe.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Date;

@Controller
@RequestMapping("/live")
public class LiveController {

    @RequestMapping(value = "/room/info", method = RequestMethod.GET)
    @ResponseBody
    public JSONObject liveRoomInfo(@RequestParam Integer roomId) {
        Room r1 = new Room(1, "henan", 1, "zhouhou", 1, "u1", "face1", "这是一个诉说有关宠物饲养的房间", new Date(), "宠物饲养", 1, 100, "abcdef","http://localhost:8080/images/huli.jpeg",1);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("roomInfo", r1);
        return jsonObject;
    }

    @RequestMapping(value = "/room/play_url", method = RequestMethod.GET)
    @ResponseBody
    public JSONObject liveRoomPlayUrl(@RequestParam Integer roomId) {
        PlayUrl playUrl = new PlayUrl(1, Arrays.asList(new Url("http://localhost:8080/avi/fj.avi")));
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("playUrl", playUrl);
        return jsonObject;
    }

    @RequestMapping(value = "/up/{mId}", method = RequestMethod.GET)
    @ResponseBody
    public JSONObject up(@PathVariable Integer mId) {
        UpUser u1 = new UpUser(
                1,
                "u1",
                "http://localhost:8080/images/huli.jpeg",
                0,
                "male",
                "",
                10, 10

        );
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("upUser", u1);
        return jsonObject;
    }
}
