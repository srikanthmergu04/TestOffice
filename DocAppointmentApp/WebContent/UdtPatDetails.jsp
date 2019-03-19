<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<%@ page import="java.util.ArrayList" %>
<%@page import="java.io.PrintWriter"%>
<%
ArrayList  list = new ArrayList();
Object result = session.getAttribute("PatList"); 
list = (ArrayList) result;
String str = list.get(3).toString();
String s1 = "";
String s2 = "";
if(str.equals("Male"))
{
	s1 = "checked";
}
else
{
	s2 = "checked";
}


%>
<form action = "UpdatePatientDetailsController" method = "post"> 
   ID      : <input type = "text" name = "id" value = "<%=list.get(0) %>"></br></br>
   Name      : <input type = "text" name = "name" value = "<%=list.get(1) %>"></br></br>
   Age       : <input type = "text" name = "age" value = "<%=list.get(2) %>"></br></br>
   Gender    : </br>
    <input type = "radio" name = "gender" value = "Male" <%= s1 %> > Male </br>
    <input type = "radio" name = "gender" value = "Female"  <%= s2 %>> Female </br></br>
   Mobile No : <input type = "text" name = "mobileno" value ="<%=list.get(4) %>" ></br></br>
   Mail Id   : <input type = "text" name = "mailid" value = "<%=list.get(5) %>"></br></br>
   Username  : <input type = "text" name = "uname" value = "<%=list.get(6) %>"></br></br>
   Password   : <input type = "password" name = "pid" value = "<%=list.get(7) %>"></br></br>
   <input type="hidden" name="key" value="<%=list.get(0) %>">
   <input type = "submit" name = "submit" value = "Update Details"></br>

</form>