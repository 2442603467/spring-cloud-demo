package com.user.server1.config;

import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.cloud.openfeign.FeignClientProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author by ydj
 * @Date 2019/7/611:17 PM
 **/
//@Configuration
public class FeignConfigg extends FeignClientProperties.FeignClientConfiguration{

    private static final Integer connectTimeout = 5000;
    private static final Integer readTimeout = 5000;

   // @Bean
    public FeignClientProperties.FeignClientConfiguration feignConfig(){
        FeignClientProperties.FeignClientConfiguration feignConfig = new FeignClientProperties.FeignClientConfiguration();
        feignConfig.setConnectTimeout(connectTimeout);
        feignConfig.setReadTimeout(readTimeout);
        return feignConfig;
    }
}
