package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class MenuController {

    @Autowired
    MenuService ms;

    @RequestMapping("/dailyMenu")
    public String addMenuPage(Menu menu){

        return "adminAddMenu";
    }
    @RequestMapping(value = "/dailyMenu", method =RequestMethod.POST)
    public String menu(@ModelAttribute Menu menu){
        ms.save(menu);
        return "AdminMenu";
    }

    @RequestMapping(value = "/adminMenuList", method =RequestMethod.GET)
    public ModelAndView menuList(Menu menu){
        List<Menu> list=ms.listAll(menu);
        return new ModelAndView("AdminMenu","list",list);
    }

    @RequestMapping(value = "/adminDeleteItem", method = RequestMethod.GET)
    public ModelAndView deleteEmployee(HttpServletRequest request, Menu menu) {
        Integer id = Integer.parseInt(request.getParameter("id"));
        ms.deleteItemFromMenu(id);
        List<Menu> list=ms.listAll(menu);
        return new ModelAndView("AdminMenu","list",list);
    }


}
