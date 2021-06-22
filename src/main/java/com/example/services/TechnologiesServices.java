package com.example.services;

import com.example.model.Technologies;
import com.example.repository.TechnologiesRepository;
import org.springframework.stereotype.Service;

@Service
public class TechnologiesServices {

    private final TechnologiesRepository technologiesRepository;

    public TechnologiesServices(TechnologiesRepository technologiesRepository) {
        this.technologiesRepository = technologiesRepository;
    }

    public Technologies getTechnologies(Long id) {
        return technologiesRepository.findById(id).orElse(null);
    }


    public void editTechnologies(Technologies technologies, Long id) {
        Technologies edit = new Technologies(
                id,
                technologies.getTitle(),
                technologies.getDescription(),
                technologies.getLogo()
        );

        technologiesRepository.save(edit);
    }


}
