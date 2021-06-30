package com.example.contoller;

import com.example.model.Education;
import com.example.model.Technologies;
import com.example.repository.EducationRepository;
import com.example.services.EducationServices;
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
public class EducationController {

    private final EducationRepository educationRepository;
    private final EducationServices educationServices;

    public EducationController(EducationRepository educationRepository, EducationServices educationServices) {
        this.educationRepository = educationRepository;
        this.educationServices = educationServices;
    }

    //get all
    @RequestMapping(value = {"/education"}, method = RequestMethod.GET)
    public String getEducation(Model model) {
        List<Education> listEducations = educationRepository.findAll();
        model.addAttribute("education", listEducations);
        return "education/education";
    }

    //add get
    @RequestMapping(value = {"addEducation"}, method = RequestMethod.GET)
    public String getAddTEducation() {
        return "education/addEducation";
    }

    //add post
    @RequestMapping(value = {"addEducation"}, method = RequestMethod.POST)
    public RedirectView addEducation(@ModelAttribute Education education) {
        educationRepository.save(education);
        return new RedirectView("/education");

    }

    //edit post
    @RequestMapping(value = {"/editEducation/{id}"}, method = RequestMethod.POST)
    public RedirectView saveEditEducation(@ModelAttribute Education education, @PathVariable("id") Long id) {
        educationServices.editEducation(education, id);
        return new RedirectView("/education");
    }

    //edit get
    @RequestMapping(value = {"/editEducation/{id}"}, method = RequestMethod.GET)
    public String getEditEducation(Model model, @PathVariable("id") Long id) {
        model.addAttribute("education", educationServices.getEducation(id));
        return "education/editEducation";
    }

    //delete
    @Transactional
    @RequestMapping(value = {"/deleteEducation/{id}"}, method = {RequestMethod.GET, RequestMethod.POST})
    public RedirectView deleteEducation(@PathVariable("id") Long id) {
        educationRepository.deleteById(id);
        return new RedirectView("/education");
    }
}
