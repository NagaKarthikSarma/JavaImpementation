<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page import ="org.karthik.com.HelloClass" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Hello world</h1>
<%= "Expression " %>
<br/>
<%= new Integer(33) %>
<br>  
<%= 23 %>
<br>

<%= "---------Declartion----------" %>
<%! public  int k=23; %> 
<br>
<%!
	%>

 
<br>
<%=k %>

<%= "---------Scriptlets----------" %>
<br>
<%!public void hello(){
	System.out.println("hii");
	
}
	%>
	<%!

	%>
<% hello(); %>

<%out.println(new HelloClass().demo()); %>

<%=new HelloClass().demo() %>

</body>
</html>    