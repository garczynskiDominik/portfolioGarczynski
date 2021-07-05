package com.example.repository;

import com.example.model.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EducationRepository extends JpaRepository<Education, Long> {

    Optional<Education> findById(Long id);
    List<Education> findAll();
    Education save(Education education);
    void deleteById(Long id);

}
