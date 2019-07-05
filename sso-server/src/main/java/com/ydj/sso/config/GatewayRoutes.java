//package com.ydj.sso.config;
//
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @Author by ydj
// * @Date 2019/7/23:25 PM
// **/
//@Configuration
//public class GatewayRoutes {
//
//    @Bean
//    public RouteLocator myRoute(RouteLocatorBuilder builder){
//        return builder.routes().route(r->r
//                                .path("/java/**")
//                                .filters(f->f.stripPrefix(1))
//                                .uri("http://localhost:8877/helloWorld"))
//                    .build();
//    }
//}
