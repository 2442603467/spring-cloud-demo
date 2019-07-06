package com.user.server1.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

/**
 * @Author by ydj
 * @Date 2019/7/611:38 AM
 **/
@RestController
public class HystrixController {


    public String getPostTest(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject("/127.0.0.1:8767/hello"
                ,new ArrayList<>(10),
                String.class);

    }
}
