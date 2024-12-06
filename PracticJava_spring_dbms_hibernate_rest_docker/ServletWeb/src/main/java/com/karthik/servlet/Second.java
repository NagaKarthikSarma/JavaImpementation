package com.karthik.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Second")
public class Second extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		int val =(int) request.getAttribute("val1");
		out.println(val);
		out.println("<br>");
		int val2 =(int) request.getAttribute("val2");
		out.println(val2);
		out.println("<br>");
		out.println(val+val2);
		out.println("this is second page");
	}

}
