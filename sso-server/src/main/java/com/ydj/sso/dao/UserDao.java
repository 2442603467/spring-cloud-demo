package com.ydj.sso.dao;

import com.ydj.sso.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Author by ydj
 * @Date 2019/7/13:12 PM
 **/
@Mapper
@Component
public interface UserDao {
    User findUserByUserName(@Param("username") String username);
}
