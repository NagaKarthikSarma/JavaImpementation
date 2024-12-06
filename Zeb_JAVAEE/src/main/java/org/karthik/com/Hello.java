package org.karthik.com;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("hii")	;
		
		PrintWriter out = response.getWriter();
		
		out.println("hii");
		int a = 5;
		int b= 10;
//		
//		RequestDispatcher rd = request.getRequestDispatcher("Hii");
//		request.setAttribute("a", a);
//		request.setAttribute("b", b);
//		rd.forward(request, response);
		
		response.sendRedirect("Hii?"+"a="+a+"&b="+b);
		
//		HttpSession session = request.getSession();
//		session.setAttribute("a", a);
//		session.setAttribute("b",b);
//		response.sendRedirect("Hii");
		
//		RequestDispatcher rd = request.getRequestDispatcher("Hii");
//	
//		rd.forward(request, response);
//		
//		Cookie cookie = new Cookie("a",a+"");
//		Cookie cookie1 = new Cookie("b",b+"");
//		response.addCookie(cookie);
//		response.addCookie(cookie1);
//		response.sendRedirect("Hii");
		
		}

	

}
