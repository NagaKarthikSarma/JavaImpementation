package com.controller.test;

public class ConstructorB {

	public ConstructorB(ConstructorA ca2) {
	
	}

	public ConstructorA ca;
	
	

	public ConstructorA getCa() {
		return ca;
	}



	public void setCa(ConstructorA ca) {
		this.ca = ca;
	}



	@Override
	public String toString() {
		return "ConstructorB [ca=" + ca + "]";
	}
	
	
	
	
}
