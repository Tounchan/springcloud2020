package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author TERRY
 * @date 2020/4/26 11:26
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced //使用该注解开启微服务的负载均衡功能
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
