package com.example.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor

@Getter
@Setter
@ToString
public class About {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String profile;
    private String email;
    private Integer number;
    private String aboutMe;
    private Integer java;
    private Integer git;
    private Integer spring;
    private Integer mySql;
    private Integer hibernate;
    private Integer htmlCss;
    private Integer javaScript;
    private String img;
    private String address;
    private String facebook;
    private String github;
    private String linkedin;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "about")
    private Set<Education> educations = new HashSet<Education>();


    public About(Long id, String name, String profile, String email, Integer number, String aboutMe,
                 Integer java, Integer git, Integer spring, Integer mySql, Integer hibernate, Integer htmlCss,
                 Integer javaScript, String img, String address, String facebook, String github, String linkedin) {
        this.id = id;
        this.name = name;
        this.profile = profile;
        this.email = email;
        this.number = number;
        this.aboutMe = aboutMe;
        this.java = java;
        this.git = git;
        this.spring = spring;
        this.mySql = mySql;
        this.hibernate = hibernate;
        this.htmlCss = htmlCss;
        this.javaScript = javaScript;
        this.img = img;
        this.address = address;
        this.facebook = facebook;
        this.github = github;
        this.linkedin = linkedin;
        this.educations = educations;
    }

    public About(String name, String profile, String email, Integer number, String aboutMe,
                 Integer java, Integer git, Integer spring, Integer mySql, Integer hibernate, Integer htmlCss,
                 Integer javaScript, String img, String address, String facebook, String github, String linkedin) {
    }
}

