package org.karthik.webpage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
String str = request.getParameter("text1");
int a =Integer.parseInt( request.getParameter("num1"));

PrintWriter out = response.getWriter();

out.println("hello");
out.println("<br>");
out.println(str+"------"+a);
		
	}


}
