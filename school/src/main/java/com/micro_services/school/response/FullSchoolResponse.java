package com.micro_services.school.response;


import java.util.List;

import com.micro_services.school.response.model.Student;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class FullSchoolResponse {

    private String nome;

    private String email;

    List<Student> students;
}
