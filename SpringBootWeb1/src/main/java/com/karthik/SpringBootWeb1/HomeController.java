package com.karthik.SpringBootWeb1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
	@RequestMapping("/home")
	
	public String home() {
	System.out.println("method called");
		return "index";
	}
	
//	@RequestMapping("add")
//	public  String add(@ModelAttribute("aliean") Aliean aliean) { 
//	// @ModelAttribute	is optional if we are using same aliean object
//		// in the add servlet.
//		return "add";
//	}
	
@RequestMapping("add")
	public  ModelAndView add(Aliean aliean, ModelAndView mv) {
//mv.addObject(aliean);  // optional  
		//mv.setViewName("add");  // it is also optional if we are using the same 
	// // @RequestMapping("add")
		
		return mv;
	}
 
	
	
	
//	@Autowired
//	HttpServletRequest req;
//	@Autowired
//	HttpServletRequest session;
//	@RequestMapping("add")
//	// public String add(@RequestParm("num1") int var1,@RequestParm("num1") int var2,HttpSession session)
//	//public String add(int num1, int num2,HttpSession session)
//	//Here the num1, num2 are must to be the input of forms  
//	public String add(@RequestParam("num1") int num,int num2, Model model) {
//		 
////		int  num1= Integer.parseInt(req.getParameter("num1"));
////		
////		int num2 = Integer.parseInt(req.getParameter("num2"));
//		int result = num+num2;
////		
////		session.setAttribute("result", result);
//		model.addAttribute("result", result);
//		
//		System.out.println(num+num2);
//		return "add";
//	}
	
}
