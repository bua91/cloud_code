<%@page  contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%
	ResultSet resultset = null;
%>
<html> 
<head> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
        <title>Register user</title> 
</head> 
<body> 
<%
    String user= request.getParameter("name"); 
    String username=request.getParameter("username"); 
    String password1=request.getParameter("password"); 
    String password2=request.getParameter("confirm_password");
    String email=request.getParameter("email");
    String role=request.getParameter("role"); 
    //Check if password matches.
    if( password1.equals(password2) ) { 
        //TODO create the user in the database and continue to app

	try {
		String connectionURL = "jdbc:mysql://localhost:3306/robocode";
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection connection = DriverManager.getConnection(connectionURL, "root","root");

		Statement statement = connection.createStatement();
		String InsertString="INSERT INTO User (Name, UserName, Password, Email, Role) VALUES ('"+user+"','"+username+"','"+password1+"','"+email+"','"+role+"')";
		statement.executeUpdate(InsertString);
	}
	catch (Exception se) { 
		//		 response.sendRedirect("Error.jsp")
		se.printStackTrace();		 
				} 
	
//	if(resultset.next()){
//		UserName = resultset.getString("UserName");
//		UserRole = resultset.getString("Role");
//		Password = resultset.getString("Password");
//           	int ID= resultset.getInt("ID");
//		}


            session.setAttribute("username",username);
	    session.setAttribute("userrole",role);
            response.sendRedirect("welcome.jsp");

    } else
        response.sendRedirect("Login.jsp"); 
%>
</body></html>
