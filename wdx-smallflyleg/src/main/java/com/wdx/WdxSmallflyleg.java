package com.wdx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class WdxSmallflyleg {
    public static void main(String[] args) {
        SpringApplication.run(WdxSmallflyleg.class, args);
    }
}
