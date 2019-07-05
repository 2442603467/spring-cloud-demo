package com.ydj.sso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 * @Author by ydj
 * @Date 2019/7/12:16 PM
 **/
@SpringBootApplication
public class SsoApp {


    public static void main(String[] args) {
       // new SpringApplicationBuilder().web(true).run(args);
        SpringApplication.run(SsoApp.class,args);
    }


//    @Bean
//    public ErrorFilter errorFilter(){
//        return new ErrorFilter();
//    }
//    @Bean
//    public FirstFilter firstFilter(){
//        return new FirstFilter();
//    }
//    @Bean
//    public ResultFilter resultFilter(){
//        return new ResultFilter();
//    }
//    @Bean
//    public SecondFilter secondFilter(){
//        return new SecondFilter();
//    }
}
