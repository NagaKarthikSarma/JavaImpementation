package com.karthik.jdbc.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@Entity
public class Employee {
     @Id
     @Column(name="cuid")
	private int cuid;
     @Column(name="ename")
	private String ename;
     @Column(name="esalary")
	private int esalary;
}
