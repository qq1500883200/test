package com.example.aa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AaApplication {

	public static void main(String[] args) {
		/*v3.0*/
		//
		SpringApplication.run(AaApplication.class, args);
	}

}

