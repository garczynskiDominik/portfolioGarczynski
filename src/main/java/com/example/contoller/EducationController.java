package com.example.contoller;

import com.example.model.Education;
import com.example.model.Technologies;
import com.example.repository.EducationRepository;
import com.example.services.EducationServices;
import lombok.RequiredArgsConstructor;
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
@RequiredArgsConstructor
public class EducationController {

    private final EducationRepository educationRepository;
    private final EducationServices educationServices;


    @RequestMapping(value = {"/education"}, method = RequestMethod.GET)
    public String getEducation(Model model) {
        educationServices.getAllEucations(model);
        return "education/education";
    }

    @RequestMapping(value = {"addEducation"}, method = RequestMethod.GET)
    public String getAddTEducation() {
        return "education/addEducation";
    }


    @RequestMapping(value = {"addEducation"}, method = RequestMethod.POST)
    public RedirectView postAddEducation(@ModelAttribute Education education) {
        educationRepository.save(education);
        return new RedirectView("/education");
    }

    @RequestMapping(value = {"/editEducation/{id}"}, method = RequestMethod.POST)
    public RedirectView postEditEducation(@ModelAttribute Education education, @PathVariable("id") Long id) {
        educationServices.editEducation(education, id);
        return new RedirectView("/education");
    }

    @RequestMapping(value = {"/editEducation/{id}"}, method = RequestMethod.GET)
    public String getEditEducation(Model model, @PathVariable("id") Long id) {
        model.addAttribute("education", educationServices.getEducation(id));
        return "education/editEducation";
    }

    @Transactional
    @RequestMapping(value = {"/deleteEducation/{id}"}, method = {RequestMethod.POST})
    public RedirectView deleteEducation(@PathVariable("id") Long id) {
        educationRepository.deleteById(id);
        return new RedirectView("/education");
    }
}
