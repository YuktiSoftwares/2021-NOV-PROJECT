package com.yuktisoftwares.ServerApp;

public class Student {

	private String name;
	private String enrollment;
	private String email;
	private String mobil;
	private String marks;
	
	
	public Student() {
		super();
	}
	public Student(String name, String enrollment, String email, String mobil, String marks) {
		super();
		this.name = name;
		this.enrollment = enrollment;
		this.email = email;
		this.mobil = mobil;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEnrollment() {
		return enrollment;
	}
	public void setEnrollment(String enrollment) {
		this.enrollment = enrollment;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobil() {
		return mobil;
	}
	public void setMobil(String mobil) {
		this.mobil = mobil;
	}
	public String getMarks() {
		return marks;
	}
	public void setMarks(String marks) {
		this.marks = marks;
	}
	
	
	
}
