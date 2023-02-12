package com.example.demo.controller;

import com.example.demo.entity.StudentEntity;
import com.example.demo.response.Response;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    public StudentService studentService;

    @PostMapping("/savedStudents")
    public Response saveStudentInfo(@RequestBody StudentEntity entity) {
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

    @PatchMapping("/updatePartialData")
    public Response savePartialStudentData(@RequestBody StudentEntity entity) {
        return studentService.savePartialData(entity);
    }

    @PutMapping("/updateData")
    public Response updateData(@RequestBody StudentEntity entity) {
        return studentService.updateData(entity);
    }

    @GetMapping("/findByName/{name}")
    public Response getStudentById(@PathVariable String name) {
        return studentService.findByName(name);
    }

    @GetMapping("/findBySection/{section}")
    public Response getStudentBySection(@PathVariable String section) {
        return studentService.findBySection(section);
    }

    @GetMapping("/findBySchoolName/{schoolName}")
    public Response getStudentBySchoolName(@PathVariable String schoolName) {
        return studentService.findBySchoolName(schoolName);
    }

    @PatchMapping("/patchData")
    public Response patchData(@RequestBody StudentEntity entity) {
        return studentService.patchData(entity);
    }
}
