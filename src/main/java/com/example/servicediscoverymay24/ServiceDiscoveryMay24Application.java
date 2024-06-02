package com.example.servicediscoverymay24;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceDiscoveryMay24Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceDiscoveryMay24Application.class, args);
    }

}
