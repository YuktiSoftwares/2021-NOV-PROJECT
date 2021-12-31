package com.yuktisoftwares.ServerApp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yuktisoftwares.ServerApp.model.Student;
import com.yuktisoftwares.ServerApp.service.StudentServiceImpl;

@RestController
public class StudentController {

	@Autowired
	private StudentServiceImpl studentServiceImpl;
	
	//To fetch all existing students
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/students")
	public List<Student> getStudents() {
		return studentServiceImpl.getStudents();
		
		
	}
	
	//To create a new student
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student) {
		return studentServiceImpl.saveStudent(student);	
		
	}
	
	//To create a new student
	@CrossOrigin(origins = "http://localhost:3000")
	@PutMapping("/students/{id}")
	public Student editStudent(@RequestBody Student student) {
		//dont call save method. Try to edit a student.
		return studentServiceImpl.saveStudent(student);	
		
	}
	
	//localhost:2000/student/2
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/student/{id}")
	public Student getStudent(@PathVariable("id") Integer id) {
		//return studentServiceImpl.getStudents();
		System.out.println("Received id ="+id);
		return studentServiceImpl.getStudent(id);
		
	}
	
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/students1")
	public List getStudents1() {
		
		//Student[] students = new Student[3];
		List<Student>students = new ArrayList<Student>();
		Student s1 = new Student();
		s1.setName("Pragya");
		s1.setEmail("pragya@gmail.com");
		s1.setMobile("+91 1234555222");
		s1.setMarks("95.0");
		s1.setEnrollment("18ETCSB001");
		 
		Student s2 = new Student();
		s2.setName("Shivji");
		s2.setEmail("Shivji@gmail.com");
		s2.setMobile("+91 123452340");
		s2.setMarks("95.0");
		s2.setEnrollment("18ETCSB002");
		
		Student s3 = new Student();
		s3.setName("Intekhab");
		s3.setEmail("Intekhab@gmail.com");
		s3.setMobile("+91 1234567890");
		s3.setMarks("95.0");
		s3.setEnrollment("18ETCSB003");
		
//		students[0]=s1;
//		students[1]=s2;
//		return students;
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		return students;
	}
}
