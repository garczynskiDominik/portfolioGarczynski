package com.example.services;

import com.example.DTO.converters.EducationConverter;
import com.example.DTO.EducationDto;
import com.example.model.Education;
import com.example.repository.EducationRepository;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
public class EducationServices {

    private final EducationRepository educationRepository;
    private final EducationConverter educationConverter;


    public EducationServices(EducationRepository educationRepository, EducationConverter educationConverter) {
        this.educationRepository = educationRepository;
        this.educationConverter = educationConverter;
    }

    public Education getEducation(Long id) {
        return educationRepository.findById(id).orElse(null);
    }

    public void editEducation(Education education, Long id){
        Education edit = new Education(
                id,
                education.getNameOfSchool(),
                education.getDescription(),
                education.getType(),
                education.getDateStart(),
                education.getDateEnd(),
                education.getImg()
        );

        educationRepository.save(edit);
    }

    public void getAllEucations(Model model) {
        List<Education> listEducations = educationRepository.findAll();
        List<EducationDto> educationDtos = educationConverter.entityToDto(listEducations);
        model.addAttribute("education", educationDtos);
    }
}
