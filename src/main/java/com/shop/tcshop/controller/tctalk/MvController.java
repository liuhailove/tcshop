package com.shop.tcshop.controller.tctalk;

import com.shop.tcshop.models.fe.Result;
import com.shop.tcshop.models.tctalk.MvUrl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
@RequestMapping("/mv")
public class MvController {
    @RequestMapping(value = "/url", method = RequestMethod.GET)
    @ResponseBody
    public Result mvUrl(@RequestParam int id) {
        MvUrl mvUrl = new MvUrl();
        mvUrl.setId(1);
        Random random = new Random();
        int randomNumber = random.nextInt(1000);
        if (randomNumber % 10 == 0) {
            mvUrl.setUrl("http://localhost:8080/avi/fj.avi");
        } else if (randomNumber % 10 == 1) {
            mvUrl.setUrl("http://localhost:8080/avi/a.flv");
        } else if (randomNumber % 10 == 2) {
            mvUrl.setUrl("http://localhost:8080/avi/fj3.avi");
        } else if (randomNumber % 10 == 3) {
            mvUrl.setUrl("http://localhost:8080/avi/fj4.avi");
        } else if (randomNumber % 10 == 4) {
            mvUrl.setUrl("http://localhost:8080/avi/fj6.avi");
        } else if (randomNumber % 10 == 5) {
            mvUrl.setUrl("http://localhost:8080/avi/fydsj.avi");
        } else if (randomNumber % 10 == 6) {
            mvUrl.setUrl("http://localhost:8080/avi/gqq.avi");
        } else if (randomNumber % 10 == 7) {
            mvUrl.setUrl("http://localhost:8080/avi/hw.avi");
        } else if (randomNumber % 10 == 8) {
            mvUrl.setUrl("http://localhost:8080/avi/pgydyd.avi");
        } else if (randomNumber % 10 == 9) {
            mvUrl.setUrl("http://localhost:8080/avi/qg.avi");
        }
        return new Result("200", mvUrl);
    }
}
