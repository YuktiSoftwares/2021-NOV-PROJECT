package com.yuktisoftwares.ServerApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuktisoftwares.ServerApp.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
