package com.karthik.employeeJdbc;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Entity
public class Employee {
	@Id
	private int Cuid;
	private String ename;
	private int Salary;
	public int getCuid() {
		return Cuid;
	}
	public void setCuid(int cuid) {
		Cuid = cuid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	
	
	@Override
	public String toString() {
		return "Employee [Cuid=" + Cuid + ", ename=" + ename + ", Salary=" + Salary + "]";
	}
	
	

}
