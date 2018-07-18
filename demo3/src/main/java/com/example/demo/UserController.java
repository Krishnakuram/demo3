package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@Scope("session")
public class UserController {

    @Autowired
    UserService us;

    @Autowired
    User u;

    @RequestMapping("/register")
    public String getRegisterPage(User user){

        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String getRegister(@ModelAttribute User user){
        us.saveUser(user);
        return "login";
    }
    @RequestMapping("/login")
    public String getLoginPage(User user){

        return "login";
    }
    //@Scope("session")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String doLogin(String email, String password ){
        System.out.println("calling doLoginMethod");
                System.out.println(email);
        System.out.println(password);

        List<User> list=us.validateUser(email, password);
        if (list!=null){
            System.out.println("validating user");
            return "home";
        }
     return "error";
    }

    @RequestMapping("/logout")
    public String logout(HttpServletRequest request) throws ServletException {
        request.logout();
        return "home";
    }

}
