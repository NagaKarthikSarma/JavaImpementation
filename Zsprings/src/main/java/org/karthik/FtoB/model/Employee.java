package org.karthik.FtoB.model;

public class Employee {

private int Empid;
private String Emname;
public int getEmpid() {
	return Empid;
}
public void setEmpid(int empid) {
	Empid = empid;
}
public String getEmname() {
	return Emname;
}
public void setEmname(String emname) {
	Emname = emname;
}


public Employee(int empid, String emname) {
	super();
	Empid = empid;
	Emname = emname;
}
public Employee() {
	
}
@Override
public String toString() {
	return "Employee [Empid=" + Empid + ", Emname=" + Emname + "]";
}


	

}
