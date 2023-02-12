package com.example.demo.interfaces;

import com.example.demo.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentInterface extends JpaRepository<StudentEntity, Integer> {

    List<StudentEntity> findByName(String name);
    List<StudentEntity> findBySection(String section);
    List<StudentEntity> findBySchoolName(String schoolName);
}
