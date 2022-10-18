package com.ajie;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.ajie.product.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class AjiemallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(AjiemallProductApplication.class, args);
    }

}
