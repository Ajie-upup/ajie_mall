package com.ajie;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.ajie.product.dao")
@SpringBootApplication
public class AjiemallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(AjiemallProductApplication.class, args);
    }

}
