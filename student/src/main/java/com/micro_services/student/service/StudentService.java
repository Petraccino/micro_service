package com.micro_services.student.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.micro_services.student.entity.Student;
import com.micro_services.student.repository.SchoolRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final SchoolRepository schoolRepository;

    public void save(Student student){
        schoolRepository.save(student);
    }

    public List<Student> findAll(){
        return schoolRepository.findAll();
    }

    public List<Student> findAllBySchoolId(Integer schoolId) {
        return schoolRepository.findAllBySchoolId(schoolId);
    }
}
