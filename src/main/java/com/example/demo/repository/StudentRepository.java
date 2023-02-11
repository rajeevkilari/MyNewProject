package com.example.demo.repository;

import com.example.demo.Response;
import com.example.demo.entity.StudentEntity;
import com.example.demo.interfaces.StudentInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class StudentRepository {

    private static final Logger LOGGER = LoggerFactory.getLogger(StudentRepository.class);

    @Autowired
    public StudentInterface studentInterface;

    public Response saveStudentsData(StudentEntity entity) {
        Response response = new Response();
        if(entity!=null) {
            StudentEntity studentEntity = new StudentEntity();
            studentEntity.setName(entity.getName());
            studentEntity.setSection(entity.getSection());
            StudentEntity student = studentInterface.save(studentEntity);
            if (student.getName()!=null && student.getName().equals(entity.getName())) {
                response.setMessage("The Data has been Saved with the Id" + " " + student.getID());
                response.setStatusCode("200");
                response.setStudentEntity(student);
            } else {
                response.setMessage("The Data has Not Been Saved or already Exists");
                response.setStatusCode("500");
                response.setStudentEntity(null);
            }
        }
        return response;

    }

    public Response getStudentById(Integer studentId) {
        Response response = new Response();
        Optional<StudentEntity> studentEntity = studentInterface.findById(studentId);
        if (!studentEntity.isPresent()) {
            response.setMessage("The Data with this ID"+" "+studentId +" "+"doesn't exist in Database");
            response.setStatusCode("400");
            response.setStudentEntity(null);
        } else {
            response.setMessage("The Data is Present with this ID"+" "+studentId);
            response.setStatusCode("200");
            response.setStudentEntity(studentEntity.get());
        }
        return response;
    }

    public Response delStudentById(Integer studentId) {
         Response response = new Response();
         Optional<StudentEntity> studentEntity = studentInterface.findById(studentId);
        if (studentEntity.isPresent()) {
            studentInterface.deleteById(studentId);
            response.setMessage("The Data with this ID"+" "+studentId +" "+"has been deleted");
            response.setStatusCode("200");
            response.setStudentEntity(studentEntity.get());
        } else {
            response.setMessage("The Data with this ID"+" "+studentId +" "+"Is already deleted or not available");
            response.setStatusCode("400");
            response.setStudentEntity(studentEntity.get());
        }
        return response;
    }
}
