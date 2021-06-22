package com.example.repository;

import com.example.model.Work;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface WorkRepository extends JpaRepository<Work, Long> {

    Optional<Work> findById(Long id);

    Work save(Work work);

    List<Work> findAll();

    void deleteById(Long id);
}
