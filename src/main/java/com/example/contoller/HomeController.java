package com.example.contoller;

import com.example.services.HomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final HomeService homeService;

    @GetMapping(value = {"/home", "/"})
    public String getHome(Model model) {
        homeService.homeGet(model);
        return "home/home";
    }
}
