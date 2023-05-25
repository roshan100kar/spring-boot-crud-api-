package com.studenttable.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studenttable.springboot.entity.Student;
import com.studenttable.springboot.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	public StudentRepository studentRepo;
	
	public List<Student> getAllStudent() {
		List<Student> student = new ArrayList<>();
		studentRepo.findAll().forEach(student::add);
		return student;
	}

	public void addStudent(Student student) {
		studentRepo.save(student);
		
	}

	public void updateStudent(Long id, Student student) {
		studentRepo.save(student);
		
	}

	public void deleteStudent(Long id) {
		studentRepo.deleteById(id);
		
	}
}
