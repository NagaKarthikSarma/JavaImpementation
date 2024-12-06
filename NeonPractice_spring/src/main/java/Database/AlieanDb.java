package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AlieanDb {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/helium?useSSL=false";
		String user="root";
		String pass="D@ngereag1e";

		String Query="select * from Argon";
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		String s3=null;
	try {
		con=DriverManager.getConnection(url,user,pass);
		st=con.createStatement();
        rs=  st.executeQuery(Query);
         System.out.println("hii");
         while(rs.next()) {
        	 int aid= rs.getInt("Aid");
        	 String Aname= rs.getString("Aname");
        	 System.out.println(""+aid+" "+Aname);
        	 
         }
		
	}
	catch(Exception e) {
		
	}
	finally {
		
	}
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
