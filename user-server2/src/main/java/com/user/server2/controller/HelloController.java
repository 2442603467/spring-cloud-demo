package com.user.server2.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCollapser;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
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
//@DefaultProperties(defaultFallback = "defaultFallBack")
public class HelloController {

    @Autowired
    private TestService testService;

    @GetMapping("/hello")
//    @HystrixCommand(commandProperties = {
//            //超时
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "5000")
//    },fallbackMethod = "fallback")
    public String hello() throws Exception{
        String a = testService.hello();
        return "111";
    }

    @GetMapping("/hello1")
    @HystrixCommand
    public String sayHello(){
        String name = "123444";
        String a = testService.sayHello(name);
        return a;
    }

    private String fallback(){
        return "111server2";
    }
    private String defaultFallBack(){
        return "222";
    }
}
