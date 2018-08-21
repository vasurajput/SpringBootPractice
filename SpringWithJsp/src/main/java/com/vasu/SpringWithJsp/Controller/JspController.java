/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vasu.SpringWithJsp.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Vasu Rajput
 */
@Controller
public class JspController {

    @GetMapping("/")
    public ResponseEntity<Object> testRest() {
        return new ResponseEntity<>("Rest Working", HttpStatus.OK);
    }

    @RequestMapping("/first")
    public String getFirstJspPage() {
        System.out.println("inside first Jsp controller");
        return "index";           // here index is the name of jsp file
    }
}
