/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vasu.SpringBootWithAngularRouting.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Vasu Rajput
 */
@Controller
public class DemoController {

    @GetMapping("/")
    public ModelAndView myModel() {
        System.out.println("Index Controller call");
        ModelAndView model = new ModelAndView("index");
        return model;
    }

    @GetMapping("/first")
    public ModelAndView firstModel() {
        System.out.println("first Controller call");
        ModelAndView model = new ModelAndView("first");
        return model;
    }

    @GetMapping("/second")
    public ModelAndView secondModel() {
        System.out.println("second Controller call");
        ModelAndView model = new ModelAndView("second");
        return model;
    }

    @GetMapping("/defaul")
    public ModelAndView defaultdModel() {
        System.out.println("default Controller call");
        ModelAndView model = new ModelAndView("default");
        return model;
    }

}
