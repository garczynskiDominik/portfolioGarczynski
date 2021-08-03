package com.example.DTO.converters;

import com.example.DTO.TechnologiesDto;
import com.example.model.Technologies;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TechnologiesConverter {
    public TechnologiesDto entityToDto(Technologies technologies) {

        TechnologiesDto technologiesDto = new TechnologiesDto();
        technologiesDto.setId(technologies.getId());
        technologiesDto.setTitle(technologies.getTitle());
        technologiesDto.setDescription(technologies.getDescription());
        technologiesDto.setLogo(technologies.getLogo());

        return technologiesDto;
    }

    public List<TechnologiesDto> entityToDto(List<Technologies> technologies) {
        return technologies.stream()
                .map(this::entityToDto)
                .collect(Collectors.toList());
    }

    public Technologies dtoToEntity(TechnologiesDto technologiesDtoc) {

        Technologies technologies = new Technologies();
        technologies.setId(technologiesDtoc.getId());
        technologies.setTitle(technologiesDtoc.getTitle());
        technologies.setDescription(technologiesDtoc.getDescription());
        technologies.setLogo(technologiesDtoc.getLogo());

        return technologies;
    }

    public List<Technologies> dtoToEntity(List<TechnologiesDto> technologiesDtos) {
        return technologiesDtos.stream()
                .map(this::dtoToEntity)
                .collect(Collectors.toList());
    }
}
