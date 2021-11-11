package com.leagueregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LeagueApplicationRegistry {

	public static void main(String[] args) {
		SpringApplication.run(LeagueApplicationRegistry.class, args);
	}

}
