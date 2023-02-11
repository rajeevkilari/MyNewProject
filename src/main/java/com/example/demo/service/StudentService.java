package com.example.demo.service;

import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepository;
import com.example.demo.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    
    @Autowired
    public StudentRepository studentRepository;

    public Response saveStudentInfo(StudentEntity entity) {
        return studentRepository.saveStudentsData(entity);
    }

    public Response getStudentById(Integer studentId) {
        return studentRepository.getStudentById(studentId);
    }

    public Response delStudentById(Integer studentId) {
        return studentRepository.delStudentById(studentId);

    }
}
