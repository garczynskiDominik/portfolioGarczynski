package com.example.contoller;

import com.example.model.Education;
import com.example.model.Technologies;
import com.example.repository.EducationRepository;
import com.example.services.EducationServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import javax.transaction.Transactional;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class EducationController {

    private final EducationRepository educationRepository;
    private final EducationServices educationServices;


    @GetMapping(value = {"/education"})
    public String getEducation(Model model) {
        educationServices.getAllEucations(model);
        return "education/education";
    }

    @GetMapping(value = {"addEducation"})
    public String getAddTEducation() {
        return "education/addEducation";
    }


    @PostMapping(value = {"addEducation"})
    public RedirectView postAddEducation(@ModelAttribute Education education) {
        educationRepository.save(education);
        return new RedirectView("/education");
    }

    @PostMapping(value = {"/editEducation/{id}"})
    public RedirectView postEditEducation(@ModelAttribute Education education, @PathVariable("id") Long id) {
        educationServices.editEducation(education, id);
        return new RedirectView("/education");
    }

    @GetMapping(value = {"/editEducation/{id}"})
    public String getEditEducation(Model model, @PathVariable("id") Long id) {
        model.addAttribute("education", educationServices.getEducation(id));
        return "education/editEducation";
    }

    @Transactional
    @PostMapping(value = {"/deleteEducation/{id}"})
    public RedirectView deleteEducation(@PathVariable("id") Long id) {
        educationRepository.deleteById(id);
        return new RedirectView("/education");
    }
}
