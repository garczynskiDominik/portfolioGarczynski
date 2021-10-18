package com.example.services;

import com.example.DTO.AboutDto;
import com.example.DTO.converters.AboutConverter;
import com.example.model.About;
import com.example.repository.AboutRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import java.util.List;


@RequiredArgsConstructor
@Service
public class AboutServices {

    private final AboutRepository aboutRepository;
    private final AboutConverter aboutConverter;

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

    public void getAbouts(Model model) {
        List<About> list = aboutRepository.findAll();
        List<AboutDto> aboutDtos = aboutConverter.entityToDto(list);
        model.addAttribute("about", aboutDtos);
    }
}
