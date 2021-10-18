package com.example.contoller;

import com.example.model.About;
import com.example.repository.AboutRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ContactController {

    private final AboutRepository aboutRepository;

    @RequestMapping(value = {"/contact"}, method = RequestMethod.GET)
    public String getAboutsForContact(Model model) {
        List<About> list = aboutRepository.findAll();
        model.addAttribute("about", list);
        return "contactSection/contact";
    }
}


