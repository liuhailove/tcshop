package com.shop.tcshop.controller.tctalk;

import com.shop.tcshop.models.fe.Result;
import com.shop.tcshop.models.tctalk.LoginResp;
import com.shop.tcshop.models.tctalk.LoginStatusResp;
import com.shop.tcshop.models.tctalk.UserProfile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login")
public class UserController {
    @RequestMapping(value = "/cellphone", method = RequestMethod.GET)
    @ResponseBody
    public LoginResp userLogin(@RequestParam String phone, @RequestParam String password) {


        return new LoginResp(200, "cookie","token");
    }

    @RequestMapping(value = "/status", method = RequestMethod.GET)
    @ResponseBody
    public Result loginStatus() {
        UserProfile userProfile = new UserProfile();
        userProfile.setUserId(1234);
        userProfile.setUserType(1);
        userProfile.setNickname("hello");
        userProfile.setAvatarImgId(1);
        userProfile.setAvatarUrl("http://localhost");
        userProfile.setBackgroundImgId(1);
        userProfile.setBackgroundUrl("http://localhost");
        userProfile.setSignature("abcd");
        userProfile.setCreateTime(System.currentTimeMillis());
        userProfile.setUserName("helloUser");
        userProfile.setShortUserName("shortUserName");
        userProfile.setBirthday(10);
        LoginStatusResp loginStatusResp=new LoginStatusResp(200,userProfile);
        return new Result<>("200",loginStatusResp);
    }

}
