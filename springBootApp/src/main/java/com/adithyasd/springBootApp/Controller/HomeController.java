package com.adithyasd.springBootApp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet() {
        return "Hi, Welcome to Homepage";
    }

    @RequestMapping("/about")
    public String about() {
        return "About Us";
    }
}