package com.karthik.springJDBC.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.karthik.springJDBC.model.Student;
@Repository
public interface Repo extends JpaRepository<Student, Integer> {

}
