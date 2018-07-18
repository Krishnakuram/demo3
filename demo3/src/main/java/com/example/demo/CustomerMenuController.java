package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
public class CustomerMenuController {



    @Autowired
    CustomerMenuCartService ocl;
    @Autowired
    MenuService ms;
    @RequestMapping("/customerMenuList")
    public String goToPage(){
        System.out.println("goTo page controller method calling");
        return "customerMenu";
    }

    @RequestMapping(value = "/customerMenuList", method = RequestMethod.GET)
    public ModelAndView menuListToCart(Menu menu){
        List<Menu> list=ms.listAll(menu);
        return new ModelAndView("customerMenu","list",list);
    }


    @RequestMapping(value = "/addToCart", method = RequestMethod.POST)
    public String addToCart(@ModelAttribute CustomerOrder customerOrder){
        ocl.saveOrder(customerOrder);
        return "customerCart";
    }

    @RequestMapping(value = "/customerCartList", method = RequestMethod.GET)
    public ModelAndView cartList(CustomerOrder customerOrder){
        List<CustomerOrder> list=ocl.listAll(customerOrder);
        return new ModelAndView("customerCart","list",list);
    }


    @RequestMapping(value = "/customerDeleteItem", method = RequestMethod.GET)
    public ModelAndView deleteEmployee(HttpServletRequest request, CustomerOrder customerOrder) {
        Integer id = Integer.parseInt(request.getParameter("id"));
        ocl.deleteOrder(id);
        List<CustomerOrder> list=ocl.listAll(customerOrder);
        return new ModelAndView("customerCart","list",list);
    }










}
