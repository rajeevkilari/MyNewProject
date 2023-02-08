package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
