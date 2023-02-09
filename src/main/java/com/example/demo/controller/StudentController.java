package com.example.demo.controller;

import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class StudentController {
	@Autowired
	public StudentService studentService;

	@PostMapping("/savedStudents")
	public StudentEntity saveStudentInfo(@RequestBody StudentEntity entity) {
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
