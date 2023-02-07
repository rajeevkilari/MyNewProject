package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class StudentController {
	@Autowired
	private StudentInterface studentInterface;

	@PostMapping("/savedstudents")
	public StudentEntity saveStudentInfo(@RequestBody StudentEntity entity) {
		StudentEntity studentEntity = new StudentEntity();
		studentEntity.setName(entity.getName());
		studentEntity.setSection(entity.getSection());
		return studentInterface.save(studentEntity);
	}

	@GetMapping("/savedstudents/{studentId}")
	public Optional<StudentEntity> getStudentById(@PathVariable Integer studentId) {
		Optional<StudentEntity> studentEntity = studentInterface.findById(studentId);
		if (!studentEntity.isPresent()) {
			return null;
		} else {
			return studentEntity;
		}
	}
	@DeleteMapping("/deleteStudents/{studentId}")
	public String deleteStudentByid(@PathVariable Integer studentId) {
		studentInterface.deleteById(studentId);
		if (getStudentById(studentId).isPresent()) {
			return "Data has Not been Deleted in Database";
		} else {
			return "Record has been deleted in Database";
		}
	}
}
