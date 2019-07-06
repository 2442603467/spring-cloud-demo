package com.user.server2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author by ydj
 * @Date 2019/6/122:18 PM
 **/
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients(basePackages = "com.user.server1.feign")
@EnableCircuitBreaker // CircuitBreaker 闭路器，断路器
//@SpringCloudApplication,包含bootApplication,断路器，DiscoveryClient
public class UserServer2App {
    public static void main(String[] args) {
        SpringApplication.run(UserServer2App.class,args);
    }
}
