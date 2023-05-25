package com.studenttable.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.studenttable.springboot.entity.Student;
import com.studenttable.springboot.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	
	@GetMapping("/student")
	public List<Student> getAllStudent() {
		return studentService.getAllStudent();	
	}
	
	@PostMapping("/addstudent")
	public void addStudent(@RequestBody Student student) {
		studentService.addStudent(student);
	}
	
	@PutMapping("/student/{id}")
	public void updateStudent(@PathVariable Long id, @RequestBody Student student) {
		studentService.updateStudent(id, student);	
	}
	
	@DeleteMapping("/deletestudent/{id}")
	public void deleteStudent(@PathVariable Long id) {
		studentService.deleteStudent(id);
	}

}
