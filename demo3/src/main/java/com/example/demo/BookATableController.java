package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Controller
public class BookATableController {

    @Autowired
    RestTemplate restTemplate;


    @RequestMapping(value = "/BookATable", method = RequestMethod.GET)
    public ModelAndView Hi(HttpServletRequest request) {
        System.out.println("In BookATable");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello");
        ResponseEntity<BookATable[]>responseEntity=restTemplate.getForEntity("http://localhost:8107/booktable", BookATable[].class);
        BookATable[] bookATables=responseEntity.getBody();
        System.out.println("after number of members:"+bookATables.length);
        request.setAttribute("bookATables", Arrays.asList(bookATables));
        return modelAndView;

    }
    @RequestMapping("/bookATable")
    public String bookATablePage(){
        return "bookATable";
    }

   @RequestMapping(value = "/bookAtableAdd", method = RequestMethod.POST)
   public String createBookATable(@ModelAttribute BookATable bookATable) {
       System.out.println("before hello");
        restTemplate.postForEntity("http://localhost:8107/booktable",bookATable, BookATable.class);
        System.out.println("after hello");
        return "success";
    }
}

