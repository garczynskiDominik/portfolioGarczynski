package com.example.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class Blog {

    @RequestMapping(value = {"/blog"}, method = RequestMethod.GET)
    public String getAbout(){
        return "blog/blog";
    }
}
