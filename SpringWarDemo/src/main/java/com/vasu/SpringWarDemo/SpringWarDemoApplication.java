package com.vasu.SpringWarDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringWarDemoApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringWarDemoApplication.class);
    }

    public static void main(String[] args) {
        System.out.println("inside main method");
        SpringApplication.run(SpringWarDemoApplication.class, args);
    }
}
