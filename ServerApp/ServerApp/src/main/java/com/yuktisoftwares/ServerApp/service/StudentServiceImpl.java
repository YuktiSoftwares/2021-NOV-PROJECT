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

	
	
	public Student saveStudent(Student student) {
		Student savedStudent = studentRepository.save(student);
		return savedStudent;
	}
	//For fetching all students
	public List<Student> getStudents(){
		return studentRepository.findAll();
		
	}
	public StudentRepository getStudentRepository() {
		return studentRepository;
	}

	public void setStudentRepository(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	
	/*Method returns student with given id*/
	public Student getStudent(Integer id){
		return studentRepository.findById(id).get();
		
	}
	public Student editStudent(Student student) {		
		Integer id = student.getId();
		//Student updatedStudent = studentRepository.findById(id).get();
		Student updatedStudent = studentRepository.findStudentByEnrollment(student.getEnrollment());
		updatedStudent.setMobile(student.getMobile());
		updatedStudent.setMarks(student.getMarks());
		updatedStudent.setName(student.getName());
		updatedStudent.setEmail(student.getEmail());
		studentRepository.save(updatedStudent);
		return updatedStudent;
	}

}
