package com.user.server1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @Author by ydj
 * @Date 2019/6/112:35 PM
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class Server1App {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Server1App.class).web(true).run(args);
    }
}

