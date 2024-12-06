package Com.karthik.ZDbc;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class Entity {

	public static void main(String[] args) {
	
		
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("your_persistence_unit_name");
		
		EntityManager entity = factory.createEntityManager();
		
		EntityTransaction t = entity.getTransaction();
		
		TypedQuery<StudentClass> query=entity.createQuery("from StudentClass",StudentClass.class);
		   List<StudentClass>  students = query.getResultList();
		  // Print student details
        for (StudentClass student : students) {
            System.out.println("Roll Number: " + student.getRollno());
            System.out.println("Student Name: " + student.getSname());
            System.out.println("Age: " + student.getAge());
            System.out.println("-------------------------");
       }
t.commit();
	}

}
