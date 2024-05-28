package com.shop.tcshop.controller.tctalk;

import com.shop.tcshop.models.fe.Result;
import com.shop.tcshop.models.tctalk.MvUrl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/mv")
public class MvController {
    @RequestMapping(value = "/url", method = RequestMethod.GET)
    @ResponseBody
    public Result mvUrl(@RequestParam int id) {
        MvUrl mvUrl=new MvUrl();
        mvUrl.setId(1);
        mvUrl.setUrl("http://localhost:8080/mv/a.flv");
        return new Result("200", mvUrl);
    }
}
