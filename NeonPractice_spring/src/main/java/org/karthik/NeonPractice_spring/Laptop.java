package org.karthik.NeonPractice_spring;


public class Laptop implements Computer {

	public Laptop() {
		System.out.println("laptop object");
	}
	@Override
	public void Compile() {
		System.out.println("Compiling by laptop");
		

	}

}
