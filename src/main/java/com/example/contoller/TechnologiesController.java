package com.example.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TechnologiesController {


    @RequestMapping(value = {"/technologies"}, method = RequestMethod.GET)
    public String getAbout() {
        return "technologies/technologies";
    }
}
