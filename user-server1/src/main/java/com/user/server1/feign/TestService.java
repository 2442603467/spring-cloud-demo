package com.user.server1.feign;

import com.user.server1.utils.FeignFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * @Author by ydj
 * @Date 2019/7/49:27 AM
 **/
@FeignClient(value = "USER-SERVER1",fallback = FeignFallBack.class)
public interface TestService {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String hello();

    @RequestMapping(value = "/hello2",method = RequestMethod.GET)
    String sayHello(String name);
}
