package com.example.service;

import com.example.entity.StudentEntity;
import com.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public StudentEntity saveStudentInfo(StudentEntity entity) {
        return studentRepository.saveStudentInfo(entity);
    }

    public Optional<StudentEntity> getStudentById(Integer studentId) {
        return studentRepository.getStudentById(studentId);
    }

    public String delStudentById(Integer studentId) {
        return studentRepository.delStudentById(studentId);

    }
}
