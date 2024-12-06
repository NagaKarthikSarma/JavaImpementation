package com.karthik.security.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity 
public class Employee {
	@Id
private int Eid;
private String Euser;
private String Epass;
public int getEid() {
	return Eid;
}
public void setEid(int eid) {
	this.Eid = eid;
}
public String getEuser() {
	return Euser;
}
public void setEuser(String euser) {
	this.Euser = euser;
}
public String getEpass() {
	return Epass;
}
public void setEpass(String epass) {
	this.Epass = epass;
}

}
