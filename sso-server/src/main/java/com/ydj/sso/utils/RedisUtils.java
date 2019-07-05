package com.ydj.sso.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @Author by ydj
 * @Date 2019/7/110:39 PM
 **/
public class RedisUtils {

    @Autowired
    private RedisTemplate redisTemplate;

    public void set(String key,Object o){
        redisTemplate.opsForValue().set(key,o.toString());
    }
}
