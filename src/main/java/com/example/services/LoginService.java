package com.example.services;

import com.example.model.About;
import com.example.repository.AboutRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final AboutRepository aboutRepository;


    public void getInfoContact(Model model) {
        List<About> list = aboutRepository.findAll();
        model.addAttribute("about", list);
    }
}
