package com.avinash.jenkins.Controller;

import com.avinash.jenkins.Service.AppService;
import com.avinash.jenkins.model.User;
import com.avinash.jenkins.model.UserIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@RestController
public class AppController {

    @Autowired
    AppService service;

    //Home
    @GetMapping("/")
    public String home(){
        return "Hellooo....!";
    }
    //signin
    @GetMapping("/signup")
    public ModelAndView signup(ModelAndView mv)  {
        mv.setViewName("home");
        return mv;
    }

    @GetMapping("/signin")
    public ModelAndView signin(ModelAndView mv){
        mv.setViewName("home2");
        return mv;
    }

    //submit-signup
    @PostMapping(value="/submitsignup")
    public String submitsignup(@ModelAttribute User user){
        System.out.println(user);
        System.out.println("Controller");
        return service.submitsignup(user);
    }

    //submit-signip
    @PostMapping("/submitsignip")
    public String submitsignip(@ModelAttribute UserIn userin){
        return service.submitsignip(userin);
    }
}
