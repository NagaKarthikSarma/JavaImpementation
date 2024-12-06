package Com.karthik.ZDbc;

import java.util.Collection;
import java.util.List;
 
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.query.Query;
import org.hibernate.query.*;

public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	
       SessionFactory factory = new Configuration()
    		                         .configure("hibernate.cfg.xml")
    		                         .addAnnotatedClass(Com.karthik.ZDbc.StudentClass.class)
    		                         .buildSessionFactory();
  Session session = factory.getCurrentSession();
       
      Transaction tx= ((SharedSessionContract) session).beginTransaction();
       try {
//    	   StudentClass s = new StudentClass(5,"karthiksara",22);
//    	   
//    	   
//    	  session.save(s);
    	   
//    	   // Retrieve all students using a query   
    	   
    	  
    	  SQLQuery qr = session.createSQLQuery("select * from StudentClass") ;

    	   qr.addEntity(StudentClass.class);
    	   List<StudentClass> students = qr.getResultList();

           // Print student details
           for (StudentClass student : students) {
               System.out.println("Roll Number: " + student.getRollno());
               System.out.println("Student Name: " + student.getSname());
               System.out.println("Age: " + student.getAge());
               System.out.println("-------------------------");
          }
           
           SQLQuery qr1 = session.createSQLQuery("select * from StudentClass") ;

    	   qr1.addEntity(StudentClass.class);
    	   List<StudentClass> students1 = qr1.getResultList();

           // Print student details
           for (StudentClass student : students1) {
               System.out.println("Roll Number: " + student.getRollno());
               System.out.println("Student Name: " + student.getSname());
               System.out.println("Age: " + student.getAge());
               System.out.println("-------------------------");
          }

           
    	   tx.commit();
    	   System.out.println("hello");
       }
       finally {
    	   session.close();
    	   factory.close();
       }
    		                         
     
        
    }
}
