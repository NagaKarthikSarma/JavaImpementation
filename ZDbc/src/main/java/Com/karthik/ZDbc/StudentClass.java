package Com.karthik.ZDbc;


import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//import jakarta.persistence.Id;
//import jakarta.persistence.Column;
@Entity
public class StudentClass {
	  @Id
	    @Column(name = "rollno")
	    private int rollno;

	    @Column(name = "Sname")
	    private String sname;

         

	    @Column(name = "age")
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
