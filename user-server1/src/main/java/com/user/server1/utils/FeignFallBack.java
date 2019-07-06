package com.user.server1.utils;

import com.user.server1.feign.TestService;
import org.springframework.stereotype.Component;

/**
 * @Author by ydj
 * @Date 2019/7/49:29 AM
 **/
@Component
public class FeignFallBack implements TestService{

    @Override
    public String hello() {
        return "fallback server1";
    }

    @Override
    public String sayHello(String name) {
        return "fallback";
    }
}