<%-- 
    Document   : Login
    Created on : Sep 14, 2017, 3:52:39 PM
    Author     : C2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<html> 
    <head> <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
        <title>Robocode Login</title> 
    </head> 
    <body> 
        <h1>Robocode Login Page</h1> 
    <center> 
        <h2>Signup Details</h2> 
        <form action="LoginCheck.jsp" method="post"> 
            <br/>Username:<input type="text" name="username"> 
            <br/>Password:<input type="password" name="password"> 
            <br/><input type="submit" value="Submit"> 
        </form> 
        <h2>Or Register...</h2>
        <form action="UserRegister.jsp" method="post">
            <br/>Username:<input type="text" name="username"> 
            <br/>Choose Password:<input type="password" name="password1">
            <br/>Confirm Password:<input type="password" name="password2">
            <br/>Email Address:<input type="text" name="email">
            <br/><input type="submit" value="Submit">
        </form>
    </center> 
    </body> 
</html>
