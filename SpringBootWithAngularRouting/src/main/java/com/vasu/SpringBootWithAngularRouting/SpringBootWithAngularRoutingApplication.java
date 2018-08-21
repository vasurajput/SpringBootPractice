package com.vasu.SpringBootWithAngularRouting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootWithAngularRoutingApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootWithAngularRoutingApplication.class);
    }

    public static void main(String[] args) {
        System.out.println("Main Method Call");
        SpringApplication.run(SpringBootWithAngularRoutingApplication.class, args);
    }
}
