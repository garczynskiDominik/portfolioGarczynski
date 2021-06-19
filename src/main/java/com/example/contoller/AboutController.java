package com.example.contoller;

import com.example.model.About;
import com.example.repository.AboutRepository;
import com.example.services.AboutServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class AboutController {

    private final AboutRepository aboutRepository;
    private final AboutServices aboutServices;

    public AboutController(AboutRepository aboutRepository, AboutServices aboutServices) {
        this.aboutRepository = aboutRepository;
        this.aboutServices = aboutServices;
    }


    //get all
    @RequestMapping(value = {"/about"}, method = RequestMethod.GET)
    public String getAbouts(Model model) {
        List<About> list = aboutRepository.findAll();
        model.addAttribute("about", list);
        return "about/about";
    }

    //add
    @RequestMapping(value = {"/addAbout"}, method = RequestMethod.POST)
    public RedirectView addAbout(@ModelAttribute About about) {
        aboutRepository.save(about);
        return new RedirectView("/about");
    }

    //edit post
    @RequestMapping(value = {"/editAbout/{id}"}, method = RequestMethod.POST)
    public RedirectView saveEditPerson(@ModelAttribute About about, @PathVariable("id") Long id) {
        aboutServices.editAbout(about, id);
        return new RedirectView("/editAbout/{id}");

    }

    //edit get
    @RequestMapping(value = {"/editAbout/{id}"}, method = RequestMethod.GET)
    public String getEditAbout(Model model, @PathVariable("id") Long id) {
        model.addAttribute("about", aboutServices.getAbout(id));
        return "about/editAbout";
    }
}

