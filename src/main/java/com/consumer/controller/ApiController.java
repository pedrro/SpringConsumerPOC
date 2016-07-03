package com.consumer.controller;

import com.consumer.model.Quote;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class ApiController {

    private static final String API_URI = "http://gturnquist-quoters.cfapps.io/api/random";
    private RestTemplate template;

    @PostConstruct()
    public void controller() {
        template = new RestTemplate();
    }

    @RequestMapping(value = "/", method = GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Quote getQuote() {
        return template.getForEntity(API_URI, Quote.class).getBody();
    }

}
