<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

     <form action = "DocRegController" method = "post">
   ID      : <input type = "text" name = "id"></br></br>
   Name      : <input type = "text" name = "name"></br></br>
   Age       : <input type = "text" name = "age"></br></br>
   Gender    : </br>
    <input type = "radio" name = "gender" value = "Male"> Male </br>
    <input type = "radio" name = "gender" value = "Female"> Female </br></br>
   Mobile No : <input type = "text" name = "mobileno"></br></br>
   Specialization : <input type = "text" name = "specialization"></br></br>
   Username  : <input type = "text" name = "uname"></br></br>
   Password   : <input type = "password" name = "pid"></br></br>
   <input type = "submit" name = "submit" value = "Submit"></br>