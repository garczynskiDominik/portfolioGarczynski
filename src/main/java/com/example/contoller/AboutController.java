package com.example.contoller;

import com.example.model.About;
import com.example.repository.AboutRepository;
import com.example.services.AboutServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;


@Controller
@RequiredArgsConstructor
public class AboutController {

    private final AboutRepository aboutRepository;
    private final AboutServices aboutServices;


    @RequestMapping(value = {"/about"}, method = RequestMethod.GET)
    public String getAbouts(Model model) {
        aboutServices.getAbouts(model);
        return "about/about";
    }

    @RequestMapping(value = {"/addAbout"}, method = RequestMethod.POST)
    public RedirectView addAbout(@ModelAttribute About about) {
        aboutRepository.save(about);
        return new RedirectView("/about");
    }

    @RequestMapping(value = {"/editAbout/{id}"}, method = RequestMethod.POST)
    public RedirectView saveEditAbout(@ModelAttribute About about, @PathVariable("id") Long id) {
        aboutServices.editAbout(about, id);
        return new RedirectView("/editAbout/{id}");

    }

    @RequestMapping(value = {"/editAbout/{id}"}, method = RequestMethod.GET)
    public String getEditAbout(Model model, @PathVariable("id") Long id) {
        model.addAttribute("about", aboutServices.getAbout(id));
        return "about/editAbout";
    }
}

