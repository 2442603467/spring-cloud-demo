package com.user.server1.utils;

import com.user.server1.feign.TestService;

/**
 * @Author by ydj
 * @Date 2019/7/49:29 AM
 **/
public class FeignFallBack implements TestService{

    @Override
    public String hello() {
        return "fallback";
    }

    @Override
    public String sayHello(String name) {
        return "fallback";
    }
}
