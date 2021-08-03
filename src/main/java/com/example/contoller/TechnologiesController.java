package com.example.contoller;

import com.example.model.Technologies;
import com.example.repository.TechnologiesRepository;
import com.example.services.TechnologiesServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import javax.transaction.Transactional;


@Controller
public class TechnologiesController {

    private final TechnologiesRepository technologiesRepository;
    private final TechnologiesServices technologiesServices;

    public TechnologiesController(TechnologiesRepository technologiesRepository, TechnologiesServices technologiesServices) {
        this.technologiesRepository = technologiesRepository;
        this.technologiesServices = technologiesServices;
    }

    @RequestMapping(value = {"/technologies"}, method = RequestMethod.GET)
    public String getTechnologies(Model model) {
        technologiesServices.getAllTechnologies(model);
        return "technologies/technologies";
    }

    @RequestMapping(value = {"addTechnologies"}, method = RequestMethod.GET)
    public String getAddTechnnologies() {
        return "technologies/addTechnologies";
    }


    @RequestMapping(value = {"addTechnologies"}, method = RequestMethod.POST)
    public RedirectView addTechnologies(@ModelAttribute Technologies technologies) {
        technologiesRepository.save(technologies);
        return new RedirectView("/technologies");
    }

    @RequestMapping(value = {"/editTechnologies/{id}"}, method = RequestMethod.POST)
    public RedirectView saveEditTechnologies(@ModelAttribute Technologies technologies, @PathVariable("id") Long id) {
        technologiesServices.editTechnologies(technologies, id);
        return new RedirectView("/technologies");
    }

    @RequestMapping(value = {"/editTechnologies/{id}"}, method = RequestMethod.GET)
    public String getEditTechnologies(Model model, @PathVariable("id") Long id) {
        model.addAttribute("technologies", technologiesServices.getTechnologies(id));
        return "technologies/editTechnologies";
    }

    @Transactional
    @RequestMapping(value = {"/deleteTechnologies/{id}"}, method = {RequestMethod.POST})
    public RedirectView deleteTechnologies(@PathVariable("id") Long id) {
        technologiesRepository.deleteById(id);
        return new RedirectView("/technologies");
    }
}
