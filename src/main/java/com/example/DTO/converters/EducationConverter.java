package com.example.DTO.converters;

import com.example.DTO.EducationDto;
import com.example.model.Education;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EducationConverter {

    public EducationDto entityToDto(Education education) {

        EducationDto educationDto = new EducationDto();
        educationDto.setId(education.getId());
        educationDto.setNameOfSchool(education.getNameOfSchool());
        educationDto.setDescription(education.getDescription());
        education.setType(education.getType());
        educationDto.setDateStart(education.getDateStart());
        educationDto.setDateEnd(education.getDateEnd());
        educationDto.setImg(education.getImg());

        return educationDto;
    }

    public List<EducationDto> entityToDto(List<Education> educationList) {
        return educationList.stream()
                .map(this::entityToDto)
                .collect(Collectors.toList());
    }

    public Education dtoToEntity(EducationDto educationDto) {
        Education education = new Education();
        education.setId(educationDto.getId());
        education.setNameOfSchool(educationDto.getNameOfSchool());
        education.setDescription(educationDto.getDescription());
        education.setType(educationDto.getType());
        education.setDateStart(educationDto.getDateStart());
        education.setDateEnd(educationDto.getDateEnd());
        education.setImg(educationDto.getImg());

        return education;
    }

    public List<Education> dtoToEntity(List<EducationDto> educationDtos) {
        return educationDtos.stream()
                .map(this::dtoToEntity)
                .collect(Collectors.toList());
    }
}
