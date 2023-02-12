package com.example.demo.interfaces;

import com.example.demo.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentInterface extends JpaRepository<StudentEntity, Integer> {

    // Write Code for FindBySection.
    //Write Code for FindBySchoolName.
    //Try changing the methodName
    public List<StudentEntity> findByName(String name);
    public List<StudentEntity> findBySection(String section);
    public  Optional<StudentEntity> findBySchoolName(String schoolName);
}
