package com.example.contoller;

import com.example.model.About;
import com.example.repository.AboutRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class HomeController {

    private final AboutRepository aboutRepository;

    public HomeController(AboutRepository aboutRepository) {
        this.aboutRepository = aboutRepository;
    }

    @RequestMapping(value = {"/home", "/"}, method = RequestMethod.GET)
    public String getHome(Model model) {
        List<About> list = aboutRepository.findAll();
        model.addAttribute("about", list);
        return "home/home";
    }
}
