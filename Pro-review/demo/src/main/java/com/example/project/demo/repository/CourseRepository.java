package com.example.project.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.demo.model.*;

public interface CourseRepository extends JpaRepository<Course, Long> {

}

