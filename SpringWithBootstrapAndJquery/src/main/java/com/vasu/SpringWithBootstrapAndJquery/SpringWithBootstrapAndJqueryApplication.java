package com.vasu.SpringWithBootstrapAndJquery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringWithBootstrapAndJqueryApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return super.configure(builder); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringWithBootstrapAndJqueryApplication.class, args);
    }
}
