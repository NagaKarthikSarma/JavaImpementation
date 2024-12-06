package com.karthik.job;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.karthik.job.model.JobPosts;

@Controller
public class JobController {

	@GetMapping({"/","home"})
	public String home() {
		System.out.println("home page called ");
		
		return "home";
	}
	@RequestMapping("addjob")
	public String addJob() {
		System.out.println("addjob page called ");
		return "addjob";
	}
	@PostMapping("handleform")
	public String handleForm(JobPosts post) {
		System.out.println("success page called ");
		return "success";
	}
	
}

