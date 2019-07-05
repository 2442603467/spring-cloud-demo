package com.user.server2.controller;

import com.user.server1.feign.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author by ydj
 * @Date 2019/7/210:16 PM
 **/
@RestController
public class HelloController {

    @Autowired
    private TestService testService;

    @GetMapping("/hello")
    public String hello(){
       String a = testService.hello();
        return a;
    }

    @GetMapping("/hello1")
    public String sayHello(){
        String name = "123444";
        String a = testService.sayHello(name);
        return a;
    }
}
