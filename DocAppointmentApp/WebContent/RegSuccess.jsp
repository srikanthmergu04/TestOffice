<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.ArrayList" %>
	<%@page import="java.io.PrintWriter"%>
    
    <jsp:useBean id="pat" class = "com.srikanth.PatJBean"></jsp:useBean>

    <center><h2>Registration Successfull<h2></center>
    
<%
ArrayList  list = new ArrayList();
Object result = session.getAttribute("PatList"); 
list = (ArrayList) result;
ArrayList  list1 = new ArrayList();
Object result1 = session.getAttribute("Patid"); 
list1 = (ArrayList) result1;
int size = list.size();

out.println("<html>");
out.println("<body>");
out.println("<center>");

out.println("<table border ='5' cellpadding= '8'>");
out.println("<tr>");
out.println("<th>Name</th>");
out.println("<th>Values</th>");
out.println("<tr>");

for(int i=0;i<list.size();i++)
{
	out.println("<tr>");
	out.println("<td>");
	out.println(list1.get(i));
	out.println("</td>");
	
	out.println("<td>");
	out.println(list.get(i));
	out.println("</td>");
	out.println("</tr>");
}



%>
   
    <center>
    
  
    <form action = "PatDisplayController" method = "post">
    <input type = "submit" value = "HomePage"></br></br>
    </form>
    </center>
    