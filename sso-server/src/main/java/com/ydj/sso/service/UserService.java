package com.ydj.sso.service;

import com.ydj.sso.entity.User;
import org.springframework.stereotype.Service;

/**
 * @Author by ydj
 * @Date 2019/7/19:38 PM
 **/
public interface UserService {

    String getUserByUsername(String username);
}
