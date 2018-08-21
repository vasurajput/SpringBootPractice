/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vasu.SpringWithBootstrapAndJquery.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Vasu Rajput
 */
@Controller
public class DemoController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
