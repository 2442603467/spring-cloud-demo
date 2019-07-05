package com.ydj.sso.controller;

import com.ydj.sso.entity.User;
import com.ydj.sso.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author by ydj
 * @Date 2019/7/19:43 PM
 **/
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/user/test")
    public String getTest(){
        return "123";
    }

    @PostMapping(value = "/user/login")
    public String login(@RequestBody User user){
        String pw = userService.getUserByUsername(user.getUsername());
        if(pw.equals(user.getPassword())){
            return "index.html";
        }else{
            return "123123";
        }
    }
}
