<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> I am naga karthik sarma baruri, please  </h1>


<h4> expression tag --> Boolean operations, printing output</h4>
<%=25>2 %>
<br>
<%=23 %>
<br>
<%= new Integer(33) %>
<h4>Declaration --> declaring methods, public,private keywords can be used</h4>
<br>
<%!  public void display(){
	System.out.println("hello I am karthik");
}
	%>
<h4>Servlet tag --> we can use servlet operation here</h4>
<%  display(); %>   <!--  in the console we can see the output -->

<%
int a = 5;



response.sendRedirect("/secondFile");


%>



</body>
</html>