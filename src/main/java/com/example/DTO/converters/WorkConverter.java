package com.example.DTO.converters;

import com.example.DTO.WorkDto;
import com.example.model.Work;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class WorkConverter {

    public WorkDto entityToDto(Work work){

        WorkDto workDto = new WorkDto();
        workDto.setId(work.getId());
        workDto.setImg(work.getImg());
        workDto.setTitle(work.getTitle());
        workDto.setCategory(work.getCategory());
        workDto.setDate(work.getDate());
        workDto.setUrl(work.getUrl());

        return workDto;
    }
    public List<WorkDto> entityToDto (List<Work> workList){
        return workList.stream()
                .map(this::entityToDto)
                .collect(Collectors.toList());
    }

    public Work dtoToEntity(WorkDto workDto){
        Work work = new Work();
        work.setId(workDto.getId());
        work.setImg(workDto.getImg());
        work.setTitle(workDto.getTitle());
        work.setCategory(workDto.getCategory());
        work.setDate(workDto.getDate());
        work.setUrl(workDto.getUrl());

        return  work;
    }

    public List<Work> dtoToEntity (List<WorkDto> workDtos){
        return workDtos.stream()
                .map(this::dtoToEntity)
                .collect(Collectors.toList());

    }
}
