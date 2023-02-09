package com.example.demo.controller;

import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class StudentController {

	private static final Logger LOGGER = LoggerFactory.getLogger(StudentController.class);
	@Autowired
	public StudentService studentService;

	@PostMapping("/savedStudents")
	public StudentEntity saveStudentInfo(@RequestBody StudentEntity entity) {
		LOGGER.info("Entered into SavedStudent Mapping:{}",entity.getID());
		return studentService.saveStudentInfo(entity);
	}

	@GetMapping("/savedStudents/{studentId}")
	public Optional<StudentEntity> getStudentById(@PathVariable Integer studentId) {
		return studentService.getStudentById(studentId);
		
	}
	@DeleteMapping("/savedStudents/{studentId}")
	public String deleteStudentById(@PathVariable Integer studentId) {
		  return studentService.delStudentById(studentId);
	}
}
