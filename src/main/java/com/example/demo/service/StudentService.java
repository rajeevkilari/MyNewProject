package com.example.demo.service;

import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepository;
import com.example.demo.response.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private static final Logger LOGGER = LoggerFactory.getLogger(StudentService.class);
    
    @Autowired
    public StudentRepository studentRepository;

    public Response saveStudentInfo(StudentEntity entity) {
        LOGGER.info("Student Id is {}",entity.getID());
        return studentRepository.saveStudentsData(entity);
    }

    public Response getStudentById(Integer studentId) {
        LOGGER.info("Student Id is {}",studentId);
        return studentRepository.getStudentById(studentId);
    }

    public Response delStudentById(Integer studentId) {
        LOGGER.info("Student Id is {}",studentId);
        return studentRepository.delStudentById(studentId);

    }
}
