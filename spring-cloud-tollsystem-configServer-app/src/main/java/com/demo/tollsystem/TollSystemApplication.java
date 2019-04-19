/**
 * 
 */
package com.demo.tollsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
/**
 * @author Tanmoy Dasgupta
 */
@SpringBootApplication
@EnableConfigServer 
public class TollSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(TollSystemApplication.class, args);
	}

}

