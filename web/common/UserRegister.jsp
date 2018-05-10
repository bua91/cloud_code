<%@page  contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="java.security.MessageDigest"%>
<%@page import="java.security.NoSuchAlgorithmException"%>
<%
	ResultSet resultset = null;
%>

<%
/*
 writing a sha1 function
    Public static String sha1(String input)  
	{
        MessageDigest mDigest = MessageDigest.getInstance("SHA1");
        byte[] result = mDigest.digest(input.getBytes());
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < result.length; i++) 
		{
            	sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
        	}         
        return sb.toString();
    	}
*/
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
