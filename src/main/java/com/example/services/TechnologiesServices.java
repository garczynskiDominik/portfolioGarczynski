package com.example.services;

import com.example.DTO.converters.TechnologiesConverter;
import com.example.DTO.TechnologiesDto;
import com.example.model.Technologies;
import com.example.repository.TechnologiesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TechnologiesServices {

    private final TechnologiesRepository technologiesRepository;
    private final TechnologiesConverter technologiesConverter;


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

    public void getAllTechnologies(Model model) {
        List<Technologies> listTechnologies = technologiesRepository.findAll();
        List<TechnologiesDto> technologiesDtos = technologiesConverter.entityToDto(listTechnologies);
        model.addAttribute("technologies", technologiesDtos);
    }

    public void addTechnologie(Technologies technologies) {
        technologiesRepository.save(technologies);
    }

    public void egitTechnologie(Model model, Long id) {
        model.addAttribute("technologies", getTechnologies(id));

    }

    public void delete(Long id) {
        technologiesRepository.deleteById(id);

    }
}
