package com.shop.tcshop.controller;

import com.alibaba.fastjson.JSONObject;
import com.shop.tcshop.models.fe.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/fe")
public class PartitionsController {

    @RequestMapping(value = "/partitions", method = RequestMethod.GET)
    @ResponseBody
    public Result partitions() {
        Partition p1 = new Partition(1, "动画", 5);
        Partition p2 = new Partition(2, "国创", 6);
        Partition p3 = new Partition(3, "音乐", 7);
        Partition p4 = new Partition(4, "番剧", 8);

        Partition p5 = new Partition(5, "动画C", -1);
        Partition p6 = new Partition(6, "国创C", -1);
        Partition p7 = new Partition(7, "音乐C", -1);
        Partition p8 = new Partition(8, "番剧C", -1);

        List<Partition> partitions = new ArrayList<>();
        partitions.add(p1);
        partitions.add(p2);
        partitions.add(p3);
        partitions.add(p4);

        List<Partition> partitionsChildren1 = new ArrayList<>();
        partitionsChildren1.add(p5);
        partitionsChildren1.add(p6);
        partitionsChildren1.add(p7);
        partitionsChildren1.add(p8);


        Partition p9 = new Partition(9, "赛事", -1);
        Partition p10 = new Partition(10, "黑科技", -1);
        List<Partition> partitionsChildren2 = new ArrayList<>();
        partitionsChildren2.add(p9);
        partitionsChildren2.add(p10);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("0", partitions);
        jsonObject.put("1", partitionsChildren1);
        jsonObject.put("2", partitionsChildren2);

        return new Result("1", jsonObject);
    }

    @RequestMapping(value = "/round-sowing", method = RequestMethod.GET)
    @ResponseBody
    public Result sowing() {
        Banner b1 = new Banner(1, "动画", "http://localhost:8080/images/leaf.jpeg", "http://localhost:8080/images/leaf_11zon.webp");
        Banner b2 = new Banner(2, "Banner", "http://localhost:8080/images/tree.jpeg", "http://localhost:8080/images/tree_11zon.webp");
        Banner b3 = new Banner(3, "Banner3", "http://localhost:8080/images/sand.jpeg", "http://localhost:8080/images/sand_11zon.webp");
        Banner b4 = new Banner(4, "Banner4", "http://localhost:8080/images/cat.jpeg", "http://localhost:8080/images/cat_11zon.webp");

        List<Banner> banners = new ArrayList<>();
        banners.add(b1);
        banners.add(b2);
        banners.add(b3);
        banners.add(b4);

        return new Result("1", banners);
    }

    @RequestMapping(value = "/ranking/{rId}", method = RequestMethod.GET)
    @ResponseBody
    public Result rankings(@PathVariable("rId") int rid) {
        Video v1 = new Video(1, "动画", "p1", "人蛇大战", 100, 0, 100, 10, "v1", "https://fastly.jsdelivr.net/npm/@vant/assets/apple-1.jpeg", new UpUser(
                1,
                "u1",
                "abc",
                0,
                "male",
                "",
                10, 10

        ));
        Video v2 = new Video(2, "动画", "p1", "舍得传奇", 100, 0, 100, 10, "https://m.bilibili.com/video/BV1ZH4y1V7AE", "https://fastly.jsdelivr.net/npm/@vant/assets/apple-2.jpeg", new UpUser(
                1,
                "u1",
                "abc",
                0,
                "male",
                "",
                10, 10

        ));

        Video v3 = new Video(3, "动画", "p1", "凤凰卫视", 100, 0, 100, 10, "v3", "https://fastly.jsdelivr.net/npm/@vant/assets/apple-3.jpeg", new UpUser(
                1,
                "u1",
                "abc",
                0,
                "male",
                "",
                10, 10

        ));

        Video v4 = new Video(4, "动画4", "熊猫传奇", "p1", 100, 0, 100, 10, "v3", "https://fastly.jsdelivr.net/npm/@vant/assets/apple-4.jpeg", new UpUser(
                1,
                "u1",
                "abc",
                0,
                "male",
                "",
                10, 10

        ));


        Video v5 = new Video(5, "动画5", "爱的教育", "p1", 10000, 0, 80000, 10, "v3", "https://fastly.jsdelivr.net/npm/@vant/assets/apple-5.jpeg", new UpUser(
                1,
                "u1",
                "abc",
                0,
                "male",
                "",
                10, 10

        ));

        List<Video> videos = new ArrayList<>();
        videos.add(v1);
        videos.add(v2);
        videos.add(v3);
        videos.add(v4);
        videos.add(v5);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("list", videos);


        return new Result("1", jsonObject);
    }


    @RequestMapping(value = "/ranking/region", method = RequestMethod.GET)
    @ResponseBody
    public Result rankingRegion(@RequestParam Integer rId, @RequestParam Integer day) {
        Video v1 = new Video(11, "动画region1", "p1", "p1", 100, 0, 100, 10, "v1", "abc", new UpUser(
                1,
                "u1",
                "abc",
                0,
                "male",
                "",
                10, 10

        ));
        Video v2 = new Video(12, "动画region2", "p1", "1000", 100, 0, 100, 10, "https://m.bilibili.com/video/BV1ZH4y1V7AE", "https://fastly.jsdelivr.net/npm/@vant/assets/apple-5.jpeg", new UpUser(
                1,
                "u1",
                "abc",
                0,
                "male",
                "",
                10, 10

        ));

        Video v3 = new Video(13, "动画region3", "p1", "p1", 100, 0, 100, 10, "v3", "https://fastly.jsdelivr.net/npm/@vant/assets/apple-7.jpeg", new UpUser(
                1,
                "u1",
                "abc",
                0,
                "male",
                "",
                10, 10

        ));

        Video v4 = new Video(14, "动画region4", "p1", "p1", 100, 0, 100, 10, "v4", "https://fastly.jsdelivr.net/npm/@vant/assets/apple-8.jpeg", new UpUser(
                1,
                "u1",
                "abc",
                0,
                "male",
                "",
                10, 10

        ));

        Video v5 = new Video(15, "动画region5", "p1", "p1", 100, 0, 100, 10, "v5", "https://fastly.jsdelivr.net/npm/@vant/assets/apple-9.jpeg", new UpUser(
                1,
                "u1",
                "abc",
                0,
                "male",
                "",
                10, 10

        ));

        List<Video> videos = new ArrayList<>();
        videos.add(v1);
        videos.add(v2);
        videos.add(v3);
        videos.add(v4);
        videos.add(v5);
//        JSONObject jsonObject=new JSONObject();
//        jsonObject.put("list",videos);


        return new Result("1", videos);
    }


    @RequestMapping(value = "/ranking/partitions", method = RequestMethod.GET)
    @ResponseBody
    public Result rankingPartitions() {
        Partition p1 = new Partition(110, "动画110", 5);
        Partition p2 = new Partition(111, "国创111", 6);


        List<Partition> partitions = new ArrayList<>();
        partitions.add(p1);
        partitions.add(p2);

        return new Result("1", partitions);
    }


    @RequestMapping(value = "/ranking/archive", method = RequestMethod.GET)
    @ResponseBody
    public Result rankingArchive(@RequestParam Integer tId, @RequestParam Integer p) {
        Video v1 = new Video(211, "动画regionLatest", "p1", "p1", 100, 0, 100, 10, "v1", "https://fastly.jsdelivr.net/npm/@vant/assets/apple-1.jpeg", new UpUser(
                1,
                "u1",
                "abc",
                0,
                "male",
                "",
                10, 10

        ));
        Video v2 = new Video(212, "动画regionLatest", "p1", "1000", 100, 0, 100, 10, "https://m.bilibili.com/video/BV1ZH4y1V7AE", "https://fastly.jsdelivr.net/npm/@vant/assets/apple-2.jpeg", new UpUser(
                1,
                "u1",
                "abc",
                0,
                "male",
                "",
                10, 10

        ));
        List<Video> videos = new ArrayList<>();
        videos.add(v1);
        videos.add(v2);
        return new Result("1", videos);
    }

    @RequestMapping(value = "/live/data", method = RequestMethod.GET)
    @ResponseBody
    public Result liveData() {
        List<ModuleInfoWrapper> moduleList = new ArrayList<>();

        ModuleInfo m1 = new ModuleInfo();
        m1.setTitle("banner位");
        m1.setLink("https://www.bilibili.com/banner?parent_area_id=1&parent_area_name=a&area_id=1&area_name=hello");
        Live l1 = new Live(1, "live1", 100, 100, "http://localhost:8080/images/xishi1.jpg", "live1");
        Live l2 = new Live(2, "live2", 101, 100, "http://localhost:8080/images/xishi2.jpg", "live2");
        Live l3 = new Live(3, "live3", 102, 100, "http://localhost:8080/images/yc.jpg", "live3");
        Live l4 = new Live(4, "live4", 103, 100, "http://localhost:8080/images/hot_product_banner.png", "live4");
        Live l5 = new Live(5, "live5", 104, 100, "http://localhost:8080/images/id_card_front.png", "live5");


        List<Live> lives = new ArrayList<>();
        lives.add(l1);
        lives.add(l2);
        lives.add(l3);
        lives.add(l4);
        lives.add(l5);
        moduleList.add(new ModuleInfoWrapper(m1, lives));


        ModuleInfo m2 = new ModuleInfo();
        m2.setTitle("电台");
        m2.setLink("https://localhost:8080/module?parent_area_id=2&parent_area_name=a&area_id=2&area_name=hello2");
        Live l11 = new Live(6, "live1", 1001, 100, "http://localhost:8080/images/jyz.jpg", "live1");
        Live l21 = new Live(7, "live2", 1011, 100, "http://localhost:8080/images/jyz2.jpg", "live1");
        Live l31 = new Live(8, "live3", 1021, 1110, "http://localhost:8080/images/jyz3.jpg", "live1");
        Live l41 = new Live(9, "live4", 1031, 1020, "http://localhost:8080/images/uy.jpg", "live1");
        Live l51 = new Live(10, "live5", 1041, 1200, "http://localhost:8080/images/xishi1.jpg", "live1");


        List<Live> lives2 = new ArrayList<>();
        lives2.add(l11);
        lives2.add(l21);
        lives2.add(l31);
        lives2.add(l41);
        lives2.add(l51);
        moduleList.add(new ModuleInfoWrapper(m2, lives2));

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("module_list", moduleList);

        return new Result("1", jsonObject);
    }


    @RequestMapping(value = "/live/room/list", method = RequestMethod.GET)
    @ResponseBody
    public Result liveRoomList(@RequestParam Integer parentAreaId, @RequestParam(required = false) Integer areaId, @RequestParam int page, @RequestParam int pageSize) {
        List<Room> rooms = new ArrayList<>();
        Room r1 = new Room(1, "henan", 1, "zhouhou", 1, "u1", "face1", "desc1", new Date(), "room1", 1, 100, "abcdef", "http://localhost:8080/images/huli.jpeg", 1);
        Room r2 = new Room(2, "henan2", 2, "zhouhou2", 2, "u1", "face1", "desc1", new Date(), "room2", 2, 100, "abcdef", "http://localhost:8080/images/huli.jpeg", 1);
        Room r3 = new Room(3, "guangzhou", 3, "shenzhen", 3, "u2", "face1", "desc1", new Date(), "room3", 3, 100, "abcdef", "http://localhost:8080/images/huli.jpeg", 1);
        Room r4 = new Room(4, "guangzhou1", 4, "shenzhen", 4, "u2", "face4", "desc4", new Date(), "room4", 4, 100, "abcdef", "http://localhost:8080/images/huli.jpeg", 1);
        rooms.add(r1);
        rooms.add(r2);
        rooms.add(r3);
        rooms.add(r4);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("list", rooms);
        jsonObject.put("liveListData", rooms);
        jsonObject.put("shouldLoad", true);
        return new Result("1", jsonObject);
    }

    @RequestMapping(value = "/live/area", method = RequestMethod.GET)
    @ResponseBody
    public Result liveAreas() {
        List<Area> areas = new ArrayList<>();
        Area area1 = new Area(1, "地区1", new EntranceIcon("abcdef"));
        Area area2 = new Area(2, "地区2", new EntranceIcon("abcdef"));
        Area area3 = new Area(3, "地区3", new EntranceIcon("abcdef"));

        areas.add(area1);
        areas.add(area2);
        areas.add(area3);

        return new Result("1", areas);
    }

    @RequestMapping(value = "/live/room/info", method = RequestMethod.GET)
    @ResponseBody
    public Result liveRoomInfo(@RequestParam Integer roomId) {
        Room r1 = new Room(1, "henan", 1, "zhouhou", 1, "u1", "face1", "这是一个诉说有关宠物饲养的房间", new Date(), "宠物饲养", 1, 100, "abcdef", "http://localhost:8080/images/huli.jpeg", 1);
        return new Result("1", r1);
    }

    @RequestMapping(value = "/live/room/play_url", method = RequestMethod.GET)
    @ResponseBody
    public Result liveRoomPlayUrl(@RequestParam Integer roomId) {
        PlayUrl playUrl = new PlayUrl(1, Arrays.asList(new Url("http://localhost:8080/live/room/list?room_id=" + roomId)));
        return new Result("1", playUrl);
    }

    @RequestMapping(value = "/live/room/danmu_config", method = RequestMethod.GET)
    @ResponseBody
    public Result roomDanmuConfig(@RequestParam Integer roomId) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("host", "127.0.0.1");
        return new Result("1", jsonObject);
    }

    @RequestMapping(value = "/live/room/gifts", method = RequestMethod.GET)
    @ResponseBody
    public Result roomGifts() {
        Gift gift = new Gift(1, "gift1");
        Gift gift2 = new Gift(1, "gift2");
        List<Gift> gifts = new ArrayList<>();
        gifts.add(gift);
        gifts.add(gift2);
        return new Result("1", gifts);
    }


    @RequestMapping(value = "/up/{mId}", method = RequestMethod.GET)
    @ResponseBody
    public Result up(@PathVariable Integer mId) {
        UpUser u1 = new UpUser(
                1,
                "u1",
                "abc",
                0,
                "male",
                "",
                10, 10

        );
        return new Result("1", u1);
    }


    @RequestMapping(value = "/av/recommend", method = RequestMethod.GET)
    @ResponseBody
    public Result acRecommend(@RequestParam Integer aId) {
        Video v1 = new Video(211, "动画regionLatest", "推荐1", "p1", 100, 0, 100, 10, "v1", "https://fastly.jsdelivr.net/npm/@vant/assets/apple-1.jpeg", new UpUser(
                1,
                "u1",
                "abc",
                0,
                "male",
                "",
                10, 10

        ));
        Video v2 = new Video(212, "动画regionLatest", "推荐2", "1000", 100, 0, 100, 10, "https://m.bilibili.com/video/BV1ZH4y1V7AE", "https://fastly.jsdelivr.net/npm/@vant/assets/apple-2.jpeg", new UpUser(
                1,
                "u1",
                "abc",
                0,
                "male",
                "",
                10, 10

        ));
        List<Video> videos = new ArrayList<>();
        videos.add(v1);
        videos.add(v2);
        return new Result("1", videos);
    }


    @RequestMapping(value = "/transfer/image", method = RequestMethod.GET)
    @ResponseBody
    public byte[] transferImage(@RequestParam String pic) {
        RestTemplate restTemplate = new RestTemplate();
        // 配置支持 HTTPS
        HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
        restTemplate.setRequestFactory(requestFactory);
        if (pic.contains("@480w_300h.jpg")) {
            pic = pic.replace("@480w_300h.jpg", "");
        }
        if (pic.contains("@200w_125h.jpg")) {
            pic = pic.replace("@200w_125h.jpg", "");
        }
        if (pic.contains("@320w_200h.jpg")) {
            pic = pic.replace("@320w_200h.jpg", "");
        }
        try {
            ResponseEntity<byte[]> response = restTemplate.getForEntity(pic, byte[].class);
            if (response.getStatusCode().is2xxSuccessful()) {
                return response.getBody();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

