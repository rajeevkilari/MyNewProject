package com.example.demo.repository;

import com.example.demo.entity.StudentEntity;
import com.example.demo.interfaces.StudentInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class StudentRepository {

    @Autowired
    public StudentInterface studentInterface;

    public StudentEntity saveStudentsData(StudentEntity entity) {
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setName(entity.getName());
        studentEntity.setSection(entity.getSection());
        return studentInterface.save(studentEntity);
    }

    public Optional<StudentEntity> getStudentById(Integer studentId) {
        Optional<StudentEntity> studentEntity = studentInterface.findById(studentId);
        if (!studentEntity.isPresent()) {
            return null;
        } else {
            return studentEntity;
        }
    }

    public String delStudentById(Integer studentId) {
        if (studentInterface.findById(studentId).isPresent()) {
            studentInterface.deleteById(studentId);
            return "Data has been deleted from database";
        } else {
            return "Data has already been Deleted in Database";
        }
    }
}
