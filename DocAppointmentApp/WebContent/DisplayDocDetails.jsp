<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<%@ page import="java.util.ArrayList" %>
<%@page import="java.io.PrintWriter"%>
Patient Details Are : </br></br>
<%
ArrayList  list = new ArrayList();
ArrayList row = new ArrayList();
Object result = session.getAttribute("DocList"); 
list = (ArrayList) result;
out.println("<html>");
out.println("<body>");
out.println("<table border = '10'>");
out.println("<tr>");
out.println("<th>Name</th>");
out.println("<th>AGE</th>");
out.println("<th>GENDER</th>");
out.println("<th>MOBILE NO</th>");
out.println("<th>MAIL ID</th>");
out.println("<th>USERNAME</th>");
out.println("<th>PASSWORD</th>");
out.println("</tr>");
for(int i=0;i<4;i++)
{
	row = (ArrayList)list.get(i);
    
out.println("<tr>"+"<td>"+row.get(0)+"</td>"+" "+"<td>"+row.get(1)+"</td>"+" "+"<td>"+row.get(2)+"</td>"+" "+"<td>"+row.get(3)+"</td>"+" "+"<td>"+row.get(4)+"</td>"+" "+"<td>"+row.get(5)+"</td>"+" "+"<td>"+row.get(6)+"</td>"+"</tr>");
  
}
out.println("</table>");
	out.println("</body>");
	out.println("</html>");
%>