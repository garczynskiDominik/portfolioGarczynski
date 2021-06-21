package com.example.model;


import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Work {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String img;
    private String title;
    private String category;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;
    private String url;
}
