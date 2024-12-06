package com.karthik;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


public interface StudentRepo extends JpaRepository<Student, Integer> {

}
