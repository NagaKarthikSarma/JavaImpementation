package com.karthik;

import org.springframework.stereotype.Component;

@Component
public class Argon {

	private int Aid;
	private String Aname;
	public int getAid() {
		return Aid;
	}
	public void setAid(int aid) {
		Aid = aid;
	}
	public String getAname() {
		return Aname;
	}
	public void setAname(String aname) {
		Aname = aname;
	}
	@Override
	public String toString() {
		return "Argon [Aid=" + Aid + ", Aname=" + Aname + "]";
	}
	
}
