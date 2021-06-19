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

    public About getAbout(Long id) {
        return aboutRepository.findById(id).orElse(null);
    }

    public void editAbout(About about, Long id) {
        About edit = new About(
                id,
                about.getName(),
                about.getProfile(),
                about.getEmail(),
                about.getNumber(),
                about.getAboutMe(),
                about.getJava(),
                about.getGit(),
                about.getSpring(),
                about.getMySql(),
                about.getHibernate(),
                about.getHtmlCss(),
                about.getJavaScript(),
                about.getImg(),
                about.getAddress(),
                about.getFacebook(),
                about.getGithub(),
                about.getLinkedin());
        aboutRepository.save(edit);
        System.out.println("adding person on id:" + edit.getId());

    }

}
