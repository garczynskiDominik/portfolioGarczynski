package com.example.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
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


}
