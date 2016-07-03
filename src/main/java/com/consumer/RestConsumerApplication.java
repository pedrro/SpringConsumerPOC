package com.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class RestConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestConsumerApplication.class, args);
	}
}
