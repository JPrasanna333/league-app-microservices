package com.teamapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringTeamServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTeamServiceApplication.class, args);
	}

}
