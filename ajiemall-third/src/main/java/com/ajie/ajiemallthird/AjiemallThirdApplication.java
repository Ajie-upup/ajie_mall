package com.ajie.ajiemallthird;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AjiemallThirdApplication {

    public static void main(String[] args) {
        SpringApplication.run(AjiemallThirdApplication.class, args);
    }

}
