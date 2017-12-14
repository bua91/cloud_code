<%@page  contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
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
	}
	catch (Exception ex) { 
				 response.sendRedirect("Viewrobot.jsp");
				} 
					
		if(resultset.next()){
			 UserName = resultset.getString("UserName");
			UserRole = resultset.getString("Role");
			Password = resultset.getString("Password");
            int ID= resultset.getInt("ID");
		}
       
       
               
        if(enteredUsername.equals(UserName) && enteredPassword.equals(Password))
            {
	
            session.setAttribute("username",enteredUsername);
	    session.setAttribute("userrole",UserRole);
            response.sendRedirect("welcome.jsp");
            }
        else
            response.sendRedirect("Error.jsp");
        %>
    </body>
</html>

