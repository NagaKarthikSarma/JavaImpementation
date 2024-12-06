package com.telusko.JobApp;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.controller.Age;



@Controller
public class JobController {


@GetMapping("/age")
    public String getAge(Model model) {
	Age age = new Age();
	int hi=age.getAge();
model.addAttribute("age",hi);
System.out.println("this is age"+ hi);
System.out.println("hii");
        
        return "age"; // Return the JSP page name
    }
	@RequestMapping({"/","/home"})
	public String home() {
		return "home";
	}


	@RequestMapping("/addjob")
	public String addJob() {
		return "addjob";
	}

	@GetMapping("/viewalljobs")
	public String viewJobs() {

	
		return "viewalljobs";
	}
	

	@PostMapping("/handleForm")
	public String handleAddJobForm() {
		
		  return "success";
		
	}
	


	
	
	
	
	
	
	
	
	
	
}