package com.ydj.sso.service.impl;

import com.ydj.sso.dao.UserDao;
import com.ydj.sso.entity.User;
import com.ydj.sso.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author by ydj
 * @Date 2019/7/19:39 PM
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public String getUserByUsername(String username) {
        Object password = redisTemplate.opsForValue().get(username);
        if(password == null){
            User user =  userDao.findUserByUserName(username);
            redisTemplate.opsForValue().set(username,user.getPassword(),100000000L, TimeUnit.MILLISECONDS);
            return user.getPassword();
        }else{
            return password.toString();

        }

    }
}
