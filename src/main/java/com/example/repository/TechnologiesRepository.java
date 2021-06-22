package com.example.repository;

import com.example.model.Technologies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface TechnologiesRepository extends JpaRepository<Technologies, Long> {


    Optional<Technologies> findById(Long id);

    List<Technologies> findAll();

    Technologies save(Technologies technologies);

    void deleteById(Long id);
}