package com.karthik.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SendRedirectconc")
public class SendRedirectconc extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		int a =5;
		int b =6;
		
		
		response.sendRedirect("/AcceptRedirect?val1=" + a + "&val2=" + b);
		
		
		
	}

	

}
