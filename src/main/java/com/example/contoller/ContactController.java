package com.example.contoller;

import com.example.repository.AboutRepository;
import com.example.services.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ContactController {

    private final LoginService loginService;

    @GetMapping(value = {"/contact"})
    public String getAboutsForContact(Model model) {
        loginService.getInfoContact(model);
        return "contactSection/contact";
    }
}


