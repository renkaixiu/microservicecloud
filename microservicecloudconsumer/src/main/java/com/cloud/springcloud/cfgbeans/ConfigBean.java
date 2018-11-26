package com.cloud.springcloud.cfgbeans;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by dongao on 2018/11/23.
 */
@Configuration
public class ConfigBean {
    /**
     * RestTemplate提供了多种便捷访问远程Http服务的方法，
     * 是一种简单便捷的访问restful服务模板类，是Spring提供的用于访问Rest服务的客户端模板工具集。
     */

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
