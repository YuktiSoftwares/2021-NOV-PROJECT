package com.yuktisoftwares.ServerApp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/students")
	public List getStudents() {
		
		//Student[] students = new Student[3];
		List<Student>students = new ArrayList<Student>();
		Student s1 = new Student();
		s1.setName("Pragya");
		s1.setEmail("pragya@gmail.com");
		s1.setMobil("+91 1234555222");
		s1.setMarks("99.0");
		s1.setEnrollment("18ETCSB001");
		 
		Student s2 = new Student();
		s2.setName("Shivji");
		s2.setEmail("Shivji@gmail.com");
		s2.setMobil("+91 123452340");
		s2.setMarks("91.0");
		s2.setEnrollment("18ETCSB002");
		
		Student s3 = new Student();
		s3.setName("Intekhab");
		s3.setEmail("Intekhab@gmail.com");
		s3.setMobil("+91 1234567890");
		s3.setMarks("99.0");
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
