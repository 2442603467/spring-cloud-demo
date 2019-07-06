package com.user.server1.feign;

import com.user.server1.config.FeignConfigg;
import com.user.server1.utils.FeignFallBack;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClientProperties;
import org.springframework.cloud.openfeign.support.FeignHttpClientProperties;
import org.springframework.web.bind.annotation.*;

/**
 * @Author by ydj
 * @Date 2019/7/49:27 AM
 **/
@FeignClient(value = "USER-SERVER1",fallback = FeignFallBack.class,configuration = FeignHttpClientProperties.class)
public interface TestService {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String hello();

    @RequestMapping(value = "/hello2",method = RequestMethod.GET)
    String sayHello(@RequestParam("name") String name);
}
