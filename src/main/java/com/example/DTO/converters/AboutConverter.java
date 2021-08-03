package com.example.DTO.converters;

import com.example.DTO.AboutDto;
import com.example.model.About;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AboutConverter {

    public AboutDto entityToDto(About about) {

        AboutDto aboutDto = new AboutDto();
        aboutDto.setId(about.getId());
        aboutDto.setName(about.getName());
        aboutDto.setProfile(about.getProfile());
        aboutDto.setEmail(about.getEmail());
        aboutDto.setNumber(about.getNumber());
        aboutDto.setAboutMe(about.getAboutMe());
        aboutDto.setJava(about.getJava());
        aboutDto.setGit(about.getGit());
        aboutDto.setSpring(about.getSpring());
        aboutDto.setMySql(about.getMySql());
        aboutDto.setHibernate(about.getHibernate());
        aboutDto.setHtmlCss(about.getHtmlCss());
        aboutDto.setJavaScript(about.getJavaScript());
        aboutDto.setImg(about.getImg());
        aboutDto.setAddress(about.getAddress());
        aboutDto.setFacebook(about.getFacebook());
        aboutDto.setGithub(about.getGithub());
        aboutDto.setLinkedin(about.getLinkedin());

        return aboutDto;
    }

    public List<AboutDto> entityToDto(List<About> aboutList) {
        return aboutList.stream()
                .map(this::entityToDto)
                .collect(Collectors.toList());
    }

    public About dtoToEntity(AboutDto aboutDto) {
        About about = new About();

        about.setId(aboutDto.getId());
        about.setName(aboutDto.getName());
        about.setProfile(aboutDto.getProfile());
        about.setEmail(aboutDto.getEmail());
        about.setNumber(aboutDto.getNumber());
        about.setAboutMe(aboutDto.getAboutMe());
        about.setJava(aboutDto.getJava());
        about.setGit(aboutDto.getGit());
        about.setSpring(aboutDto.getSpring());
        about.setMySql(aboutDto.getMySql());
        about.setHibernate(aboutDto.getHibernate());
        about.setHtmlCss(aboutDto.getHtmlCss());
        about.setJavaScript(aboutDto.getJavaScript());
        about.setImg(aboutDto.getImg());
        about.setAddress(aboutDto.getAddress());
        about.setFacebook(aboutDto.getFacebook());
        about.setGithub(aboutDto.getGithub());
        about.setLinkedin(aboutDto.getLinkedin());

        return about;
    }

    public List<About> dtoToEntity(List<AboutDto> aboutDtos) {
        return aboutDtos.stream()
                .map(this::dtoToEntity)
                .collect(Collectors.toList());
    }
}
