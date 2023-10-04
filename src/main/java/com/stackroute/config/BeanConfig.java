package com.stackroute.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Indicates this as a configuration class
 */
@Configuration("appBeanConfig")
public class BeanConfig {
    /**
     *Code to create Bean for RestTemplate with the name restTemplate.
     */
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
