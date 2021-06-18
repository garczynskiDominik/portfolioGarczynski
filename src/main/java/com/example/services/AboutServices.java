package com.example.services;

import com.example.model.About;
import com.example.repository.AboutRepository;
import org.springframework.stereotype.Service;

@Service
public class AboutServices {

    private final AboutRepository aboutRepository;

    public AboutServices(AboutRepository aboutRepository) {
        this.aboutRepository = aboutRepository;
    }

    public About getAbout(Long id){
        return aboutRepository.findById(id).orElse(null);
    }
}
