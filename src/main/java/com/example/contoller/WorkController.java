package com.example.contoller;

import com.example.model.Work;
import com.example.services.WorkServices;
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
public class WorkController {

    private final WorkServices workServices;

    @GetMapping(value = {"/work"})
    public String getWork(Model model) {
        workServices.getWorks(model);
        return "work/work";
    }

    @GetMapping(value = {"/addWork"})
    public String getAddWork() {
        return "work/addWork";
    }

    @PostMapping(value = {"/addWork"})
    public RedirectView addWork(@ModelAttribute Work work) {
        workServices.add(work);
        return new RedirectView("/work");
    }

    @PostMapping(value = {"/editWork/{id}"})
    public RedirectView saveEditWork(@ModelAttribute Work work, @PathVariable("id") Long id) {
        workServices.editWork(work, id);
        return new RedirectView("/work");

    }

    @GetMapping(value = {"/editWork/{id}"})
    public String getEditWork(Model model, @PathVariable("id") Long id) {
        workServices.egitWorkGet(model, id);
        return "work/editWork";
    }

    @PostMapping(value = {"/deleteWork/{id}"})
    public RedirectView deleteWork(@PathVariable("id") Long id) {
        workServices.delete(id);
        return new RedirectView("/work");
    }
}
