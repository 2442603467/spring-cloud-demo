package com.ydj.sso.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;

/**
 * 跨域管理
 * @Author by ydj
 * @Date 2019/7/611:25 AM
 **/
@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter(){
        final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();

        final CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);//是否允许跨域
        config.setAllowedOrigins(Arrays.asList("*"));//此处参数是一个域名的list
        config.setAllowedHeaders(Arrays.asList("*"));//允许的头步
        config.setAllowedMethods(Arrays.asList("*"));//允许的请求方式；get post
        config.setMaxAge(300l);//缓存时间，在这个时间段里，相同的跨域请求不会再做检查

        source.registerCorsConfiguration("/**",config);

        return new CorsFilter(source);
    }
}
