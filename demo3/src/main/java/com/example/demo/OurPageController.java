package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class OurPageController {
    @RequestMapping(value = "/OurPage", method = RequestMethod.GET)
    public String OurPage() {
        System.out.println("inside OurPage Controller");
        return "OurPage";

    }
}
