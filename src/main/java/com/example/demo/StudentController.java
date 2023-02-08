package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;

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
