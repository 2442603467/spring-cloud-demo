package com.user.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * @Author by ydj
 * @Date 2019/6/96:36 PM
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaApp  {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApp.class,args);
    }
}
