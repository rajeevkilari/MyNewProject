package com.example.demo.controller;

import com.example.demo.entity.StudentEntity;
import com.example.demo.response.Response;
import com.example.demo.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

	@Autowired
	public StudentService studentService;

	@PostMapping("/savedStudents")
	public Response saveStudentInfo(@Valid @RequestBody StudentEntity entity) {
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
	@PatchMapping("/savePartialData")
	public Response savePartialStudentData(@Valid @RequestBody StudentEntity entity) {
		return studentService.savePartialData(entity);
	}
}
