package com.example.contoller;

import com.example.model.Technologies;
import com.example.repository.TechnologiesRepository;
import com.example.services.TechnologiesServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import javax.transaction.Transactional;


@Controller
@RequiredArgsConstructor
public class TechnologiesController {

    private final TechnologiesRepository technologiesRepository;
    private final TechnologiesServices technologiesServices;


    @GetMapping(value = {"/technologies"})
    public String getTechnologies(Model model) {
        technologiesServices.getAllTechnologies(model);
        return "technologies/technologies";
    }

    @GetMapping(value = {"addTechnologies"})
    public String getAddTechnnologies() {
        return "technologies/addTechnologies";
    }


    @PostMapping(value = {"addTechnologies"})
    public RedirectView addTechnologies(@ModelAttribute Technologies technologies) {
        technologiesRepository.save(technologies);
        return new RedirectView("/technologies");
    }

    @PostMapping(value = {"/editTechnologies/{id}"})
    public RedirectView saveEditTechnologies(@ModelAttribute Technologies technologies, @PathVariable("id") Long id) {
        technologiesServices.editTechnologies(technologies, id);
        return new RedirectView("/technologies");
    }

    @GetMapping(value = {"/editTechnologies/{id}"})
    public String getEditTechnologies(Model model, @PathVariable("id") Long id) {
        model.addAttribute("technologies", technologiesServices.getTechnologies(id));
        return "technologies/editTechnologies";
    }

    @Transactional
    @PostMapping(value = {"/deleteTechnologies/{id}"})
    public RedirectView deleteTechnologies(@PathVariable("id") Long id) {
        technologiesRepository.deleteById(id);
        return new RedirectView("/technologies");
    }
}
