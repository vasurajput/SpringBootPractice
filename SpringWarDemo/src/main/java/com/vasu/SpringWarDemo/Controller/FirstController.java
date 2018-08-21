/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vasu.SpringWarDemo.Controller;

import com.vasu.SpringWarDemo.Bean.FirstBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Vasu Rajput
 */
@RestController
public class FirstController {

    @GetMapping("/test")
    public String testRest() {
        System.out.println("inside test Rest");
        return "test success";
    }

    @GetMapping("/")
    public ResponseEntity<Object> index() {
        FirstBean bean = new FirstBean(2L, "Vasu Rajput");
        return new ResponseEntity<>(bean, HttpStatus.OK);
    }

}
