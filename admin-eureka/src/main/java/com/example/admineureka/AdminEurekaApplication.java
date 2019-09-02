package com.example.admineureka;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableAdminServer
public class AdminEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminEurekaApplication.class, args);
    }

}
