package com.example.services;

import com.example.DTO.converters.WorkConverter;
import com.example.DTO.WorkDto;
import com.example.model.Work;
import com.example.repository.WorkRepository;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
public class WorkServices {
    private final WorkRepository workRepository;
    private final WorkConverter workConverter;

    public WorkServices(WorkRepository workRepository, WorkConverter workConverter) {
        this.workRepository = workRepository;
        this.workConverter = workConverter;
    }

    public Work getWork(Long id) {
        return workRepository.findById(id).orElse(null);
    }

    public void editWork(Work work, Long id) {
        Work edit = new Work(
                id,
                work.getImg(),
                work.getTitle(),
                work.getCategory(),
                work.getDate(),
                work.getUrl());

        workRepository.save(edit);
        System.out.printf("adding work on id: " + edit.getId());
    }

    public void getWorks(Model model) {
        List<Work> works = workRepository.findAll();
        List<WorkDto> workDtos = workConverter.entityToDto(works);
        model.addAttribute("work", workDtos);
    }
}
