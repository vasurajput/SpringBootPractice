package com.vasu.SpringWithJsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringWithJspApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringWithJspApplication.class);
    }

    public static void main(String[] args) {
        System.out.println("inside main method");
        SpringApplication.run(SpringWithJspApplication.class, args);
    }
}
