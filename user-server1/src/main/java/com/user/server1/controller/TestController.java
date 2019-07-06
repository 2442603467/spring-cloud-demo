package com.user.server1.controller;

import com.user.server1.feign.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.SyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.FutureTask;

/**
 * @Author by ydj
 * @Date 2019/6/113:19 PM
 **/
@RestController
public class TestController{


    @GetMapping("/hello")
    public String hello(){
        try{
            Thread.sleep(1500);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "hello user-server1";

    }

    @GetMapping("/hello2")
    public String sayHello(String name){
        try{
            Thread.sleep(2000L);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "hello "+name;
    }
}
