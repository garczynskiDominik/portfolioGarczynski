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
import java.util.List;

@Controller
public class TechnologiesController {

    private final TechnologiesRepository technologiesRepository;
    private final TechnologiesServices technologiesServices;

    public TechnologiesController(TechnologiesRepository technologiesRepository, TechnologiesServices technologiesServices) {
        this.technologiesRepository = technologiesRepository;
        this.technologiesServices = technologiesServices;
    }

    //get all
    @RequestMapping(value = {"/technologies"}, method = RequestMethod.GET)
    public String getAbout(Model model) {
        List<Technologies> listTechnologies = technologiesRepository.findAll();
        model.addAttribute("technologies", listTechnologies);
        return "technologies/technologies";
    }

    //add get
    @RequestMapping(value = {"addTechnologies"}, method = RequestMethod.GET)
    public String getAddTechnnologies() {
        return "technologies/addTechnologies";
    }

    //add post
    @RequestMapping(value = {"addTechnologies"}, method = RequestMethod.POST)
    public RedirectView addWork(@ModelAttribute Technologies technologies) {
        technologiesRepository.save(technologies);
        return new RedirectView("/technologies");
    }

    //edit post
    @RequestMapping(value = {"/editTechnologies/{id}"}, method = RequestMethod.POST)
    public RedirectView saveEditTechnologies(@ModelAttribute Technologies technologies, @PathVariable("id") Long id) {
        technologiesServices.editTechnologies(technologies, id);
        return new RedirectView("/technologies");
    }

    //edit get
    @RequestMapping(value = {"/editTechnologies/{id}"}, method = RequestMethod.GET)
    public String getEditTechnologies(Model model, @PathVariable("id") Long id) {
        model.addAttribute("technologies", technologiesServices.getTechnologies(id));
        return "technologies/editTechnologies";
    }

    //delete
    @Transactional
    @RequestMapping(value = {"/deleteTechnologies/{id}"}, method = {RequestMethod.GET, RequestMethod.POST})
    public RedirectView deleteTechnologies(@PathVariable("id") Long id) {
        technologiesRepository.deleteById(id);
        return new RedirectView("/technologies");
    }
}
