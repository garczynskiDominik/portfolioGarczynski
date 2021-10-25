package com.example.contoller;

import com.example.model.About;
import com.example.services.AboutServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;


@Controller
@RequiredArgsConstructor
public class AboutController {

    private final AboutServices aboutServices;


    @GetMapping(value = {"/about"})
    public String getAbouts(Model model) {
        aboutServices.getAbouts(model);
        return "about/about";
    }

    @PostMapping(value = {"/addAbout"})
    public RedirectView addAbout(@ModelAttribute About about) {
        aboutServices.addAbout(about);
        return new RedirectView("/about");
    }

    @PostMapping(value = {"/editAbout/{id}"})
    public RedirectView saveEditAbout(@ModelAttribute About about, @PathVariable("id") Long id) {
        aboutServices.editAbout(about, id);
        return new RedirectView("/editAbout/{id}");

    }

    @GetMapping(value = {"/editAbout/{id}"})
    public String getEditAbout(Model model, @PathVariable("id") Long id) {
        aboutServices.editAboutGet(model, id);
        return "about/editAbout";
    }
}

