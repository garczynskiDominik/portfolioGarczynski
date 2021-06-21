package com.example.services;

import com.example.model.Work;
import com.example.repository.WorkRepository;
import org.springframework.stereotype.Service;

@Service
public class WorkServices {
    private final WorkRepository workRepository;

    public WorkServices(WorkRepository workRepository) {
        this.workRepository = workRepository;
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

}
