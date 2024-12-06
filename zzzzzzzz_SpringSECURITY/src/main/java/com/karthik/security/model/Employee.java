package com.karthik.security.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Entity
public class Employee {
	
	@Id
	private int eid;
	private String euser;
	private String epass;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEuser() {
		return euser;
	}
	public void setEuser(String euser) {
		this.euser = euser;
	}
	public String getEpass() {
		return epass;
	}
	public void setEpass(String epass) {
		this.epass = epass;
	}
	
	

}
