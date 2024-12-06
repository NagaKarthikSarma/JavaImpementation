package com.karthik.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.println("<h1> I am karthik <h1>");
		
		int val =Integer.parseInt(request.getParameter("val1"));
		out.println(val);
		out.println("<br>");
		int val2 =Integer.parseInt(request.getParameter("val2"));
		out.println(val2);
		out.println("<br>");
		//out.println(val+val2);
		
		RequestDispatcher rd = request.getRequestDispatcher("/Second");
		request.setAttribute("val1", val);
		request.setAttribute("val2", val);
		
		rd.forward(request, response);

		
	}

}
