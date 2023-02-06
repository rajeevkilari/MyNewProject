package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
