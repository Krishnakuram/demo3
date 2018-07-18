package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class AboutController {
    private String about;

    @RequestMapping(value = "/About", method = RequestMethod.GET)
    public String About() {
        System.out.println("inside about Controller");
        return "About";

    }
}
