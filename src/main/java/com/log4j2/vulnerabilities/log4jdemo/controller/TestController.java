package com.log4j2.vulnerabilities.log4jdemo.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private static final Logger logger = LogManager.getLogger(TestController.class);

    @GetMapping("/search")
    public String search(@RequestParam("data") String data) {
        logger.info("user input to search data : " + data);
        return data;
    }
}
