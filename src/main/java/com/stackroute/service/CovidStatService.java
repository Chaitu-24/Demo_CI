package com.stackroute.service;

import org.springframework.http.ResponseEntity;

public interface CovidStatService {
    /**
     * AbstractMethod to get Covid Stat
     */
    ResponseEntity<Object> getCovidStat();
}
