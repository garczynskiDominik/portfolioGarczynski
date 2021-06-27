package com.example.services;

import com.example.model.Education;
import com.example.repository.EducationRepository;
import org.springframework.stereotype.Service;

@Service
public class EducationServices {

    private final EducationRepository educationRepository;

    public EducationServices(EducationRepository educationRepository) {
        this.educationRepository = educationRepository;
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
}
