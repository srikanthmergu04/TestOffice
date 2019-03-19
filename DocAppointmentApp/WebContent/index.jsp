<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "javax.servlet.RequestDispatcher" %>
 <center><h3>Registration Successfull></h3></center>
<%
     RequestDispatcher rd = request.getRequestDispatcher("PatDisplayController");
    // request.setAttribute("msg","HI Welcome");
     rd.forward(request, response);
%>