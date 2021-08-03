package com.example.DTO;

import lombok.Data;

import java.util.Date;
@Data
public class WorkDto {

    private Long id;
    private String img;
    private String title;
    private String category;
    private Date date;
    private String url;
}
