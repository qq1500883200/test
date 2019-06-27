package com.example.bb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class BbApplication {

	public static void main(String[] args) {
		SpringApplication.run(BbApplication.class, args);
	}

}

