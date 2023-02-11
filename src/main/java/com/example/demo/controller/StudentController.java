package com.example.demo.controller;

import com.example.demo.entity.StudentEntity;
import com.example.demo.response.Response;
import com.example.demo.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

	private static final Logger LOGGER = LoggerFactory.getLogger(StudentController.class);
	@Autowired
	public StudentService studentService;

	@PostMapping("/savedStudents")
	public Response saveStudentInfo(@RequestBody StudentEntity entity) {
		LOGGER.info("Entered into SavedStudent Mapping:{}",entity.getID());
		return studentService.saveStudentInfo(entity);
	}

	@GetMapping("/findById/{studentId}")
	public Response getStudentById(@PathVariable Integer studentId) {
		return studentService.getStudentById(studentId);
		
	}
	@DeleteMapping("/deleteById/{studentId}")
	public Response deleteStudentById(@PathVariable Integer studentId) {
		  return studentService.delStudentById(studentId);
	}
}
