package com.example.demo.interfaces;

import com.example.demo.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentInterface extends JpaRepository<StudentEntity, Integer> {

    // Write Code for FindBySection.
    //Write Code for FindBySchoolName.
    public List<StudentEntity> findByName(String name);
}
