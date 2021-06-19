package com.example.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EducationController {

    @RequestMapping(value = {"/education"}, method = RequestMethod.GET)
    public String getAbout() {
        return "education/education";
    }
}
