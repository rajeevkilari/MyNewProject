package com.example.demo.service;

import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {
    
    @Autowired
    public StudentRepository studentRepository;

    public StudentEntity saveStudentInfo(StudentEntity entity) {
        return studentRepository.saveStudentsData(entity);
    }

    public Optional<StudentEntity> getStudentById(Integer studentId) {
        return studentRepository.getStudentById(studentId);
    }

    public String delStudentById(Integer studentId) {
        return studentRepository.delStudentById(studentId);

    }
}
