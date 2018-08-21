/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vasu.SpringBootWithFilter.Controller;

import com.vasu.SpringBootWithFilter.Bean.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Vasu Rajput
 */
@RestController
public class FilterController {

    private static final Logger logger = LoggerFactory.getLogger("FilterController.class");

    @GetMapping("/")
    public ResponseEntity<Object> demoController() {
        logger.info("Controller call");
        Student student = new Student(1, "vasu", "rajput");
        return new ResponseEntity<>(student, HttpStatus.OK);
    }
    @GetMapping("/demo")
    public ResponseEntity<Object> demo2Controller() {
        logger.info("Controller call");
        Student student = new Student(1, "koku", "rajput");
        return new ResponseEntity<>(student, HttpStatus.OK);
    }
}
