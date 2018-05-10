<%@page  contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="java.security.MessageDigest"%>
<%@page import="java.security.NoSuchAlgorithmException"%>
<%
	ResultSet resultset = null;
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <%
        String enteredUsername=request.getParameter("username");
        String enteredPassword=request.getParameter("password");
	String UserName = null;
	String UserRole = null;
	String Password = null;
	try {
				String connectionURL = "jdbc:mysql://localhost:3306/robocode";
									Class.forName("com.mysql.jdbc.Driver").newInstance();
									Connection connection = DriverManager.getConnection(connectionURL, "root","root");

									Statement statement = connection.createStatement();
				String selectString="SELECT ID,UserName, Password, Role from User where UserName='"+enteredUsername+"'";
				
			 resultset = statement.executeQuery(selectString);
	}catch (Exception ex) { 
				 response.sendRedirect("Error.jsp");
				} 
					
		if(resultset.next()){
			 UserName = resultset.getString("UserName");
			UserRole = resultset.getString("Role");
			Password = resultset.getString("Password");
            int ID= resultset.getInt("ID");
		}
	else{
	response.sendRedirect("accessdenied.jsp");
	}

       
       
               
        if(enteredUsername.equals(UserName) && enteredPassword.equals(Password))
            {
            session.setAttribute("username",enteredUsername);
	    session.setAttribute("userrole",UserRole);
	    if (enteredUsername.equals("admin")){
<<<<<<< HEAD
		response.sendRedirect("AdminPage.jsp");
	    }
	    else {
            response.sendRedirect("welcome.jsp");
=======
	    	response.sendRedirect("AdminPage.jsp");
	    else {
            	response.sendRedirect("welcome.jsp");
	    }
>>>>>>> 1abdc2daf2597de6ca425e0614f4e8595814b302
            }
	  }
        else
            response.sendRedirect("Error.jsp");
        %>
    </body>
</html>

