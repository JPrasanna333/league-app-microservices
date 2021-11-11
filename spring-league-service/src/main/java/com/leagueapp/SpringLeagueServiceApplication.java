package com.leagueapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringLeagueServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLeagueServiceApplication.class, args);
	}

}
