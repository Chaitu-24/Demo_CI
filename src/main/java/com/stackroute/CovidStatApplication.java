package com.stackroute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Enables Spring Boot auto config and component scanning.
 */
@SpringBootApplication
public class CovidStatApplication {

    public static void main(String[] args) {
        SpringApplication.run(CovidStatApplication.class, args);
    }



}
