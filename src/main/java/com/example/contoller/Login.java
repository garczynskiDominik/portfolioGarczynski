package com.example.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller


public class Login {


    @RequestMapping(value = {"/login"}, method = RequestMethod.GET)
    public String postLogin() {
        return "/login/login";
    }


//    @RequestMapping(value = {"/login"}, method = RequestMethod.POST)
//    public String setLogin() {
//        return "/login/login";
//    }
}