package org.karthik.NeonPractice_spring;

public class Aliean {
	
		
		private int age;
		private Computer com;
		public Aliean() {
			System.out.println("object created");
		}
		
		public Aliean(int age, Computer com) {
			super();
			this.age = age;
			this.com = com;
			System.out.println("object created");
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public Computer getCom() {
			return com;
		}
		public void setCom(Computer com) {
			this.com = com;
		}
		
		
		public void code() {
			
			System.out.println("coding from aliean");
			
			com.Compile();
			
		}
		
	
}
