package com.stackroute.controller;

import com.stackroute.service.CovidStatService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * RestController annotation is used to create Restful web services using Spring MVC
 */
@RestController

/**
 * RequestMapping annotation maps HTTP requests to handler methods
 */
@RequestMapping("/api/v1/covidstat")
public class CovidStatController {

    private static final Logger logger = LoggerFactory.getLogger(CovidStatController.class);
    private CovidStatService covidStatService;

    @Autowired
    public CovidStatController(CovidStatService covidStatService) {
        this.covidStatService = covidStatService;
    }

    @GetMapping
    public ResponseEntity<Object> getCovidStatistics() {
        try {
            return covidStatService.getCovidStat();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error fetching COVID-19 statistics");
        }
    }
    /**
     *To retrieve the external api data
     */

}