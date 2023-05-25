package com.studenttable.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studenttable.springboot.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Long> {

}
