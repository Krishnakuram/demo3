package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
//
//@RestController
//public class HomeController {
//
//
//    @RequestMapping(value = "/hello", method = RequestMethod.GET)
//    public String Hi(){
//        return "helloWorld";
//    }
//}
@Controller
public class HomeController {

//    private String message;


    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String hello() {
        System.out.println("inside Home Controller");
        return "home";
    }

}