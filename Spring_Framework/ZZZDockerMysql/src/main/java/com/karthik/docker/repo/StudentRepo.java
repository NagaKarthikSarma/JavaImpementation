package com.karthik.docker.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karthik.docker.entity.Student;

public interface StudentRepo extends JpaRepository<Student,Integer> {

}
