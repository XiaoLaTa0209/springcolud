package com.xinghy.springcoluddata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableEurekaClient
@EnableResourceServer
@SpringBootApplication
public class SpringcoludDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcoludDataApplication.class, args);
    }

}
