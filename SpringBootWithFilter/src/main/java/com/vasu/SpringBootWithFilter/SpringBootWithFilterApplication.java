package com.vasu.SpringBootWithFilter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootWithFilterApplication extends SpringBootServletInitializer {
    
    private static final Logger logger = LoggerFactory.getLogger("SpringBootWithFilterApplication.class");
    
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootWithFilterApplication.class);
    }
    
    public static void main(String[] args) {
        logger.info("Main Method Call");
        SpringApplication.run(SpringBootWithFilterApplication.class, args);
    }
}
