package com.ydj.sso.utils;

import com.ydj.sso.config.RedisConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @Author by ydj
 * @Date 2019/7/17:53 PM
 **/
public class CacheProvider {

    @Autowired
    private RedisTemplate redisTemplate;

    public void set(String key, Object object){
        redisTemplate.opsForValue().set(key,object.toString());
    }

    public Object get(String key){
        return redisTemplate.opsForValue().get(key);
    }
}
