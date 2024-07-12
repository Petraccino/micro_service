package com.micro_services.school.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

import com.micro_services.school.response.model.Student;

@FeignClient(name = "student-service", url = "${application.config.student-url}")
public interface StudentClient {

    @GetMapping("/by-school/{school-id}")
    List<Student> findAllBySchoolId(@PathVariable("school-id") Integer schoolId);
}