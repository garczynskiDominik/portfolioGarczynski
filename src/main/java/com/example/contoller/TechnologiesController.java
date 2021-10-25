package com.example.contoller;

import com.example.model.Technologies;
import com.example.services.TechnologiesServices;
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
public class TechnologiesController {

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
        technologiesServices.addTechnologie(technologies);
        return new RedirectView("/technologies");
    }

    @PostMapping(value = {"/editTechnologies/{id}"})
    public RedirectView saveEditTechnologies(@ModelAttribute Technologies technologies, @PathVariable("id") Long id) {
        technologiesServices.editTechnologies(technologies, id);
        return new RedirectView("/technologies");
    }

    @GetMapping(value = {"/editTechnologies/{id}"})
    public String getEditTechnologies(Model model, @PathVariable("id") Long id) {
        technologiesServices.egitTechnologie(model, id);
        return "technologies/editTechnologies";
    }

    @PostMapping(value = {"/deleteTechnologies/{id}"})
    public RedirectView deleteTechnologies(@PathVariable("id") Long id) {
        technologiesServices.delete(id);
        return new RedirectView("/technologies");
    }
}
