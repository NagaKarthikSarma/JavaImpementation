package com.testdb;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class KalkiViewData {
	
    @GetMapping("/employees")
    public String getEmployees(Model model) {
   EmployeeConfig ec = new EmployeeConfig();
  
        List<Employee> employees = ec.findAll();
        model.addAttribute("employees", employees); // Add list to model
        return "employees"; // Return view name

    }
	
}
