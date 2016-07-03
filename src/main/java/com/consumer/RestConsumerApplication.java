package com.consumer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import lombok.extern.log4j.Log4j;

@Log4j
@SpringBootApplication
public class RestConsumerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RestConsumerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		RestTemplate restTemplate = new RestTemplate();
		Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
		log.info(quote.toString());
	}
}
