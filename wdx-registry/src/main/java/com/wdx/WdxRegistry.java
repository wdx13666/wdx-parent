package com.wdx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //开启eureka
public class WdxRegistry {
    public static void main(String[] args) {
        SpringApplication.run(WdxRegistry.class,args);
    }
}
