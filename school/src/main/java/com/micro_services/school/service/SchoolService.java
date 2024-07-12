package com.micro_services.school.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.micro_services.school.client.StudentClient;
import com.micro_services.school.entity.School;
import com.micro_services.school.repository.SchoolRepository;
import com.micro_services.school.response.FullSchoolResponse;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SchoolService {

    private final SchoolRepository schoolRepository;

    private final StudentClient studentClient;

    public void save(School student){
        schoolRepository.save(student);
    }

    public List<School> findAll(){
        return schoolRepository.findAll();
    }

    public FullSchoolResponse findSchoolWithStudents(Integer schoolId) {
        var school = schoolRepository.findById(schoolId).orElseThrow();
        var student = studentClient.findAllBySchoolId(schoolId);
        return FullSchoolResponse.builder()
                .nome(school.getNome())
                .email(school.getEmail())
                .students(student)
                .build();
    }
}
