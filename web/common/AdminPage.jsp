<%@page  contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%
        ResultSet resultset = null;
%>
<html>
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin user</title>
	<style>
		h2 { color : black;
		     text-align:centre;
		     font-family: sans-serif;
		     font-size: 30px;
		   }
	</style>

</head>
<body>
<%
	String connectionURL = "jdbc:mysql://localhost:3306/robocode";
	Class.forName("com.mysql.jdbc.Driver").newInstance();
	Connection connection = DriverManager.getConnection(connectionURL, "root","root");
        Statement statement = connection.createStatement();
        resultset = statement.executeQuery(select * from User);
%>
	<center>
		<h2>User List</h2>
		<select>
			<%  while(resultset.next()){ %>
			<option><%= resultset.getString(4)%></option>
			<%}%>
		</select>
		<br/><input type="text" name="userrole" placeholder="userrole">
		<br/><input type="submit" value="ChangeRole">
		<br/><br/><br/><br/><input type = "submit" value= "Go to welcome page">
	</center>
</body>
