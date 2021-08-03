package com.example.DTO;

import lombok.Data;

import java.util.Date;

@Data
public class EducationDto {

    public Long id;
    public String nameOfSchool;
    public String description;
    public String type;
    public Date dateStart;
    public Date dateEnd;
    public String img;
}
