package com.karthik.docker.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.karthik.docker.entity.Student;



@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}
