package com.yuktisoftwares.ServerApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuktisoftwares.ServerApp.model.Student;
import com.yuktisoftwares.ServerApp.repository.StudentRepository;

@Service
public class StudentServiceImpl {
	
	@Autowired
	private StudentRepository studentRepository;

	
	
	public List<Student> getStudents(){
		return studentRepository.findAll();
		
	}
	public StudentRepository getStudentRepository() {
		return studentRepository;
	}

	public void setStudentRepository(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	
	

}
