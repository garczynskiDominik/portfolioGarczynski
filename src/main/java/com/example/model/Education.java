package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity

public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nameOfSchool;
    private String description;
    private String type;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateStart;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateEnd;
    private String img;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "about_id")
    private About about;

    public Education(Long id, String nameOfSchool, String description, String type, Date dateStart, Date dateEnd, String img) {
        this.id = id;
        this.nameOfSchool = nameOfSchool;
        this.description = description;
        this.type = type;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.img = img;
    }

    public Education(String nameOfSchool, String description, String type, Date dateStart, Date dateEnd, String img) {

    }
}
