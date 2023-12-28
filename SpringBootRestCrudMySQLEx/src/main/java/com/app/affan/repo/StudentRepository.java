package com.app.affan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.affan.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
