package com.example.contoller;

import com.example.model.Education;
import com.example.services.EducationServices;
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
public class EducationController {

    private final EducationServices educationServices;


    @GetMapping(value = {"/education"})
    public String getEducation(Model model) {
        educationServices.getAllEducations(model);
        return "education/education";
    }

    @GetMapping(value = {"addEducation"})
    public String getAddTEducation() {
        return "education/addEducation";
    }


    @PostMapping(value = {"addEducation"})
    public RedirectView postAddEducation(@ModelAttribute Education education) {
        educationServices.addEducation(education);
        return new RedirectView("/education");
    }

    @PostMapping(value = {"/editEducation/{id}"})
    public RedirectView postEditEducation(@ModelAttribute Education education, @PathVariable("id") Long id) {
        educationServices.editEducation(education, id);
        return new RedirectView("/education");
    }

    @GetMapping(value = {"/editEducation/{id}"})
    public String getEditEducation(Model model, @PathVariable("id") Long id) {
        educationServices.editEducationGet(model, id);
        return "education/editEducation";
    }


    @PostMapping(value = {"/deleteEducation/{id}"})
    public RedirectView deleteEducation(@PathVariable("id") Long id) {
        educationServices.delete(id);
        return new RedirectView("/education");
    }
}
