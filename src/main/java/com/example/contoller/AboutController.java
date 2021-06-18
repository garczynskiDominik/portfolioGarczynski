package com.example.contoller;

import com.example.model.About;
import com.example.repository.AboutRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class AboutController {

    private final AboutRepository aboutRepository;

    public AboutController(AboutRepository aboutRepository) {
        this.aboutRepository = aboutRepository;
    }

    //view
    @RequestMapping(value = {"/about"}, method = RequestMethod.GET)
    public String getAbout() {
        return "about/about";
    }

    //add
    @RequestMapping(value = {"/addAbout"}, method = RequestMethod.POST)
    public RedirectView addAbout(@ModelAttribute About about) {
        aboutRepository.save(about);
        return new RedirectView("/about");
    }

    //edit
    @RequestMapping(value = {"/editAbout/{id}"}, method = RequestMethod.GET)
    public String getAbout(Model model, @PathVariable("id") Long id) {
        model.addAttribute("about", aboutRepository.getOne(id));
        return "about/editAbout";
    }

}

