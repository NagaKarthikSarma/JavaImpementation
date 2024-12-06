package org.karthik.Componet;

import org.springframework.stereotype.Component;

//import javax.persistence.Table;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.persistence.Column;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//import jakarta.persistence.Id;
//import jakarta.persistence.Column;

@Component
public class StudentClass {
	  
	    private int rollno;

	    private String sname;

         

	    private int age;

	
	public StudentClass() {
			super();
		}
	public StudentClass(int rollno, String sname, int age) {
	super();
	this.rollno = rollno;
	this.sname = sname;
	this.age = age;
}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", age=" + age + "]";
	}
	
	

}
