package com.ruanko.springboothelloworld.controller;

import com.ruanko.springboothelloworld.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(String userName,String passWord){
        boolean b = userService.checkLogin(userName, passWord);
        if(!b){
            return "failed";
        }
        return "success";
    }


}
