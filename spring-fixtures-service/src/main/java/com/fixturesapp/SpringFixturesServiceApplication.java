package com.fixturesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringFixturesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFixturesServiceApplication.class, args);
	}

}
