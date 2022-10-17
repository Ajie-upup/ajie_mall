package com.ajie.geteway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1、开启服务的注册发现
 *  1)、配置nacos的注册中西地址
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
public class AjiemallGetewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(AjiemallGetewayApplication.class, args);
    }

}
