package com.example.contoller;

import com.example.model.Work;
import com.example.repository.WorkRepository;
import com.example.services.WorkServices;
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
public class WorkController {

    private final WorkRepository workRepository;
    private final WorkServices workServices;

    public WorkController(WorkRepository workRepository, WorkServices workServices) {
        this.workRepository = workRepository;
        this.workServices = workServices;
    }


    //get all
    @RequestMapping(value = {"/work"}, method = RequestMethod.GET)
    public String getWork(Model model) {
        List<Work> list = workRepository.findAll();
        model.addAttribute("work", list);
        return "work/work";
    }

    //add
    @RequestMapping(value = {"/addWork"}, method = RequestMethod.GET)
    public String getAddWork() {
        return "work/addWork";
    }

    //add
    @RequestMapping(value = {"/addWork"}, method = RequestMethod.POST)
    public RedirectView addWork(@ModelAttribute Work work) {
        workRepository.save(work);
        return new RedirectView("/work");
    }

    //edit post
    @RequestMapping(value = {"/editWork/{id}"}, method = RequestMethod.POST)
    public RedirectView saveEditWork(@ModelAttribute Work work, @PathVariable("id") Long id) {
        workServices.editWork(work, id);
        return new RedirectView("/work");

    }

    //edit get
    @RequestMapping(value = {"/editWork/{id}"}, method = RequestMethod.GET)
    public String getEditWork(Model model, @PathVariable("id") Long id) {
        model.addAttribute("work", workServices.getWork(id));
        return "work/editWork";
    }

    //delete
//    @Transactional
    @RequestMapping(value = {"/deleteWork/{id}"}, method = {RequestMethod.GET, RequestMethod.POST})
    public RedirectView deleteWork(@PathVariable("id") Long id) {
        workRepository.deleteById(id);
        return new RedirectView("/work");
    }
}
