package com.example.tollsystems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudTollsystemAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudTollsystemAppApplication.class, args);
	}

}

