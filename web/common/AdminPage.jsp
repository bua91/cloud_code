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
<<<<<<< HEAD
		body {
        		background-image: url("http://robocode.sourceforge.net/home/robocode_logo_white.jpg");
			background-repeat: no-repeat;
			background-position: 0 0;
			background-size: cover;
			color: blue;
       		}
=======
>>>>>>> 1abdc2daf2597de6ca425e0614f4e8595814b302
		h2 { color : black;
		     text-align:centre;
		     font-family: sans-serif;
		     font-size: 30px;
		   }
<<<<<<< HEAD
		input {
        		display: block;
        		width: 320px;
        		height: 40px;
        		padding: 5px;
        		font-size: 20px;
        		font-family : sans-serif;
        		color: blue;
        		outline: none;
        		border: 1px solid rgba(0,0,0,0.3);
        		border-radius: 5px;
        		margin-bottom: 2px;
        	}
=======
>>>>>>> 1abdc2daf2597de6ca425e0614f4e8595814b302
	</style>

</head>
<body>
<%
	String connectionURL = "jdbc:mysql://localhost:3306/robocode";
	Class.forName("com.mysql.jdbc.Driver").newInstance();
	Connection connection = DriverManager.getConnection(connectionURL, "root","root");
        Statement statement = connection.createStatement();
        resultset = statement.executeQuery("select * from User");
%>
	<center>
		<h2>User List</h2>
		<form action="changeRole.jsp" method="post">
		<select name= "user">
			<%  while(resultset.next()){ %>
			<option><%= resultset.getString(4)%></option>
			<%}%>
		</select>
<<<<<<< HEAD
                <br/><h2>Role<h2>
                <select name= "userrole">
                        <option>Developer</option>
                        <option>Tester</option>
                        <option>Player</option>
                </select>
		<!--<br/><input type="text" name="userrole" placeholder="userrole">-->
		<br/><input type="submit" value="ChangeRole">
		</form>
		<br><br><br><input type="button" style="height:50px;width:200px" value="Logout" onclick="window.location='Logout.jsp'" >
	</center>
=======
		<br/><input type="text" name="userrole" placeholder="userrole">
                <br/><input type="submit" value="Change Role">
		</form>
		<br><br><br><br><br><input type="button" style="height:50px;width:200px" value="Welcome page" onclick="window.location='welcome.jsp'">
	</center>
	<script>
		function change_role(){
			
	</script>
>>>>>>> 1abdc2daf2597de6ca425e0614f4e8595814b302
</body>
