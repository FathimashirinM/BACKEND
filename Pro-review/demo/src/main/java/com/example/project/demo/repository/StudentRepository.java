package com.example.project.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.example.project.demo.model.*;

public interface StudentRepository extends JpaRepository<Student, Long> {
boolean existsByName(@Param("mail") String mail,@Param("password") String password);

}

