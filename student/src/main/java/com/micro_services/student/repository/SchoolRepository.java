package com.micro_services.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.micro_services.student.entity.Student;

public interface SchoolRepository extends JpaRepository<Student, Integer> {
    List<Student> findAllBySchoolId(Integer schoolId);
}
