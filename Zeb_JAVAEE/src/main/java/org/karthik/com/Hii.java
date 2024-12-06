package org.karthik.com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class Hii extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//	int a = (int) request.getAttribute("a");
//	int b = (int) request.getAttribute("b");
//	
		//SendRedirect
		int a =Integer.parseInt( request.getParameter("a"));
	int b = Integer.parseInt( request.getParameter("b"));
	int c= a+b;
//	
		
//		HttpSession session  = request.getSession();
//		int a = (int) session.getAttribute("a");
//		int b = (int)session.getAttribute("b");
//		int c= a+b;
//		
//	PrintWriter out = response.getWriter();
//	out.println(c);
//		session.removeAttribute("a");
//		
//	int c = 0;
//	int d=0;
//	Cookie cookies[] = request.getCookies();
//	for(Cookie a: cookies) {
//	if (a.getName().equals("a")) {
//		c=Integer.parseInt(a.getValue());
//	}
//	if (a.getName().equals("b")) {
//		d=Integer.parseInt(a.getValue());
//	}
//	}
		PrintWriter out = response.getWriter();
 out.println(c);       
 out.println("<br>");
 
//		out.println(d);
	}

	

}
