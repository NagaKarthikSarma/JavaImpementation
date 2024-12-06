package com.karthik.jdbc;


import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.sql.*;
@RestController
public class KalkiResource {
	@Autowired
	KalkiRepository rep;
	
	@GetMapping("/kalki")
	public List<Kalki> getKalki(){
		
		List<Kalki> kal = (List<Kalki>) rep.findAll();
		
		
		return kal;
		
		
	}
	@GetMapping("/kalkiid/{idno}")
	 public Kalki getDetails(@PathVariable int idno) {
		 
		 List<Kalki> kal = (List<Kalki>) rep.findAll();
		 
		 for(Kalki k: kal) {
			 
			 if (k.getId()==idno) {
				 
				return k;
			 }
		 }
		 return null;
	 }
//	
//	@DeleteMapping("delete/{id}")
//	//@ResponseBody
//	public ResponseEntity<String> Delete(@PathVariable int id) {
//		
//		String deletequery ="delete from kalki where id = ?;";
//
//		jdbc.update(deletequery,id);
//		return new ResponseEntity<String>("deleted", HttpStatus.OK);
//	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteKalki(@PathVariable int id) {
	    try {
	        String deleteQuery = "DELETE FROM kalki WHERE id = ?";
	        int rowsAffected = jdbc.update(deleteQuery, id);
	        
	        if (rowsAffected == 0) {
	            return new ResponseEntity<>("Kalki record with ID " + id + " not found", HttpStatus.NOT_FOUND);
	        } else {
	            return new ResponseEntity<>("Kalki record deleted successfully!", HttpStatus.OK);
	        }
	    } catch (Exception e) {
	        // Log the exception and return an error response
	        e.printStackTrace();
	        return new ResponseEntity<>("Error deleting Kalki record", HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Kalki> updateKalki(@PathVariable int id,@RequestBody Kalki k) {
		String updateQuery = "UPDATE kalki SET   name = ?, points = ?  WHERE id = ?";
        jdbc.update(updateQuery, k.getName(), k.getPoints(), id);
        return new  ResponseEntity<Kalki>(HttpStatus.OK);
	
	}
	@Autowired
	JdbcTemplate jdbc;
	@PostMapping("/kalkisave")
	//@ResponseBody
	public ResponseEntity<Kalki> saveData(@RequestBody Kalki k) {
		String query = "insert into kalki values(?,?,?);";
		
      Kalki k1 = new Kalki();
      
		
		//jdbc.update(query,k.getId(),k.getName(),k.getPoints());
		
		 Kalki savedKalki = rep.save(k); // Assuming save method returns the saved object
		
	        return new ResponseEntity<Kalki>(savedKalki,HttpStatus.CREATED);
		
	}
	

}
