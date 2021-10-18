package com.example.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class Login {


    @GetMapping(value = {"/login"})
    public String postLogin() {
        return "/login/login";
    }

    @GetMapping(value = {"/register"})
    public String getRegister() {
        return "/login/register";
    }
}