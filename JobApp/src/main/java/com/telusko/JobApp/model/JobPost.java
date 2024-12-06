package com.telusko.JobApp.model;

import java.util.List;

import org.springframework.stereotype.Component;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Component
@Data  // creates the getters and setter
@NoArgsConstructor // creates the default constructor
@AllArgsConstructor // creates the parameter constructor
public class JobPost {
	private int postId;
	private String postProfile;
	private String postDesc;
	private int reqExperience;
	private List<String> postTechStack;
	

}
