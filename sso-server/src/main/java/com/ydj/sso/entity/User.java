package com.ydj.sso.entity;

import java.io.Serializable;

/**
 * @Author by ydj
 * @Date 2019/7/13:09 PM
 **/
public class User implements Serializable{

    private static final long serialVersionUID = 12345678L;
    private String id;
    private String username;
    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
