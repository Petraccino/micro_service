package com.micro_services.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.micro_services.school.entity.School;

public interface SchoolRepository extends JpaRepository<School, Integer> {
}
