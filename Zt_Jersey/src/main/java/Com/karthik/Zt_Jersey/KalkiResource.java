package Com.karthik.Zt_Jersey;

import org.glassfish.jersey.server.ResourceConfig;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


//@Path("/employees")
@Path("kalki")
public class KalkiResource {
	

	@GET
	@Produces(MediaType.APPLICATION_XML)
      //@Consumes(MediaType.APPLICATION_XML)
	public Kalki getKalki() {
		System.out.println("kalki called");
		Kalki k1 = new Kalki(); 
		k1.setName("karthik");
		k1.setPoints(10);
		return k1;
	}



//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public Employee getEmployee() {
//        Employee emp = new Employee();
//        emp.setId(1);
//        emp.setName("John Doe");
//        emp.setDepartment("Engineering");
//        return emp;
//    
//}
	
}
