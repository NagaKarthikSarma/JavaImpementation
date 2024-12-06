package com.karthik.jdbc.employee;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Entity
public class Employee {
     @Id
	private int cuid;
	private String ename;
	private int esalary;
	public int getCuid() {
		return cuid;
	}
	public void setCuid(int cuid) {
		this.cuid = cuid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsalary() {
		return esalary;
	}
	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}
	@Override
	public String toString() {
		return "Employee [cuid=" + cuid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}
	
	
	
}
