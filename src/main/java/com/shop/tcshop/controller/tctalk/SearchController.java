package com.shop.tcshop.controller.tctalk;

import com.shop.tcshop.models.fe.Result;
import com.shop.tcshop.models.tctalk.SearchHotDetail;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/search")
public class SearchController {
    @RequestMapping(value = "/hot/detail", method = RequestMethod.GET)
    @ResponseBody
    public Result hotDetail() {

        SearchHotDetail searchHotDetail1 = new SearchHotDetail("hot1", 100, "hot1content", 10, 1, "icon1", "http://localhost/tctalk", "alg1");
        SearchHotDetail searchHotDetail2 = new SearchHotDetail("hot2", 110, "hot1content1", 10, 2, "icon2", "http://localhost/tctalk2", "alg2");
        SearchHotDetail searchHotDetail3 = new SearchHotDetail("hot3", 120, "hot1content2", 10, 3, "icon3", "http://localhost/tctalk3", "alg3");
        SearchHotDetail searchHotDetail4 = new SearchHotDetail("hot4", 130, "hot1content3", 10, 4, "icon4", "http://localhost/tctalk4", "alg4");
        List<SearchHotDetail> searchHotDetailList = new ArrayList<>();
        searchHotDetailList.add(searchHotDetail1);
        searchHotDetailList.add(searchHotDetail2);
        searchHotDetailList.add(searchHotDetail3);
        searchHotDetailList.add(searchHotDetail4);
        return new Result("200", searchHotDetailList);
    }
}
