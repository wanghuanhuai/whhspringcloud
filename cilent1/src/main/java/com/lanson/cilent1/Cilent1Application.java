package com.lanson.cilent1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Cilent1Application {

    public static void main(String[] args) {
        SpringApplication.run(Cilent1Application.class, args);
    }

}
