package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@Autowired
	private StudentInterface interface1;

	@PostMapping("/savedstudents")
	public StudentEntity saveinfo(StudentEntity entity) {
		StudentEntity studentEntity = new StudentEntity();
		studentEntity.setName(entity.getName());
		studentEntity.setSection(entity.getSection());
		return interface1.save(studentEntity);

	}
}
