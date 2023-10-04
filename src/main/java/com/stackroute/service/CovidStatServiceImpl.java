package com.stackroute.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Service indicates annotated class is a service
 * which hold business logic in the Service layer
 */
@Service
public class CovidStatServiceImpl implements CovidStatService {






    /**
     *declare RestTemplate field
     */
    private RestTemplate restTemplate;
    /**
     *Using Environment to get the property values
     */
    @Value("${app.baseUrl}")
    private String apiUrl;



    /**
     *Constructor to autowire RestTemplate
     */
    @Autowired
    public CovidStatServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /**
     *Implementation of getCovidStat method
     */
    @Override
    public ResponseEntity<Object> getCovidStat() {
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.getForEntity(apiUrl, String.class);
            String apiResponse = response.getBody();
            return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(apiResponse);

    }
}
