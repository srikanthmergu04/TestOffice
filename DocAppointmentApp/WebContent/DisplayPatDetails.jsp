<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<%@ page import="java.util.ArrayList" %>
<%@page import="java.io.PrintWriter"%>


<%@include file="HomePage.jsp" %>
<center>
</br>
 <h3> Patient Details Are :  </h3>
<%
ArrayList  list = new ArrayList();
ArrayList row = new ArrayList();
Object result = session.getAttribute("PatList"); 
list = (ArrayList) result;
int size = list.size();
out.println("<html>");
out.println("<body>");
out.println("<table border ='5' cellpadding= '8'>");
out.println("<tr>");
out.println("<th>Select</th>");
out.println("<th>ID</th>");
out.println("<th>Name</th>");
out.println("<th>AGE</th>");
out.println("<th>GENDER</th>");
out.println("<th>MOBILE NO</th>");
out.println("<th>MAIL ID</th>");
out.println("<th>USERNAME</th>");
out.println("<th>PASSWORD</th>");
out.println("</tr>");
out.println("<form action = 'UpdatePatDetails' method = 'post'>");

for(int i=0;i<size;i++)
{
	row = (ArrayList)list.get(i);
	
    String s = row.get(0).toString();
  //  System.out.println(str);
//out.println("<tr>"+"<td><input type = 'radio' name = 'select' value = "+row.get(0)+"></td>"+"<td>"+row.get(0)+"</td>"+" "+"<td>"+row.get(1)+"</td>"+" "+"<td>"+row.get(2)+"</td>"+" "+"<td>"+row.get(3)+"</td>"+" "+"<td>"+row.get(4)+"</td>"+" "+"<td>"+row.get(5)+"</td>"+" "+"<td>"+row.get(6)+"</td>"+"<td>"+row.get(7)+"</td>"+"</tr>");
  out.println("<tr>");
  out.println("<td>");
  out.println("<input type = 'radio' name = 'select' value = "+s);
  out.println("</td>");
  out.println("<td>"+row.get(0)+"</td>");
  out.println("<td>"+row.get(1)+"</td>");
  out.println("<td>"+row.get(2)+"</td>");
  out.println("<td>"+row.get(3)+"</td>");
  out.println("<td>"+row.get(4)+"</td>");
  out.println("<td>"+row.get(5)+"</td>");
  out.println("<td>"+row.get(6)+"</td>");
  out.println("<td>"+row.get(7)+"</td>");
  out.println("</tr>");
}
out.println("</table>");
out.println("</br></br>");
out.println("<input style= 'margin-right: 16px'  type = 'submit' name = 'key' value = 'Update'>");
out.println("<input style= 'margin-right: 16px' type = 'submit' name = 'key' value = 'Delete'>");
out.println("</form>");

	out.println("</body>");
	out.println("</html>");
%>
</center>