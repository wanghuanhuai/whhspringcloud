package com.lanson.hystrik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.lanson.hystrik.feign")
@EnableCircuitBreaker  //启用数据监控
@EnableHystrixDashboard  //启用可视化数据监控
public class HystrikApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrikApplication.class, args);
    }

}
