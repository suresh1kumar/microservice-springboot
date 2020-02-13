package com.springboot.admin.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.admin.app.model.Student;

public interface StudentReposatory extends JpaRepository<Student, Long>{

}
