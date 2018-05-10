<!-- 
    Document   : Login
    Author     : Arunabha
    Group      : C2 
-->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="DTO.RobotDTO"%>

<html>
    <head> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Share code Page</title>
        <style>
        	body {
        		background-image: url("http://robocode.sourceforge.net/home/robocode_logo_white.jpg");
			background-repeat: no-repeat;
			background-position: 0 0;
			background-size: cover;
			color: blue;
       		}
        	div {
        		position : absolute;
        		top : 50%;
        		left:90%;
        		transform:translate(-50%,-50%);
       		}
       		h1.serif {
        		color : MediumSeaGreen;
        		text-align : left;
        		font-size: 50px;
        		font-family:"Times New Roman", Times, serif;
        	}
        	h2 {
        		color : black;
        		text-align:centre;
        		font-family: sans-serif;
        		font-size: 30px;
        	}
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
        </style>
    </head>
    <body>
    	<h1 class= "serif">Share/Revoke Robot Code </h1> 
<% String uRole  =null;
	uRole= (String)session.getAttribute("userrole");
	if(uRole.equals("Player")||uRole.equals("Tester")){
		response.sendRedirect("accessdenied.jsp");
	}%>
	<%String sessionUName=null;
	sessionUName = (String)session.getAttribute("username");
	String robotName=null;
	//RobotDTO robotAccessDTO = new RobotDTO();
	robotName= request.getParameter("share");
	//robotName= request.getParameter("displayrobots");
	ResultSet resultset = null;
		try {
					String connectionURL = "jdbc:mysql://localhost:3306/robocode";
					Class.forName("com.mysql.jdbc.Driver").newInstance();
					Connection connection = DriverManager.getConnection(connectionURL, "root","root");

					Statement statement = connection.createStatement();
					String selectString="SELECT userID from robot where RobotId='"+robotName+"'";
				
				 	resultset = statement.executeQuery(selectString);
		}catch (Exception ex) { 
					 response.sendRedirect("Error.jsp");
					} 
	if(resultset.next()){
		String robotOwner = resultset.getString("userID");
	if(!robotOwner.equals(sessionUName)){
	response.sendRedirect("accessdenied.jsp");

	}
	}
		%>
<div>ROBOT CHECK<%=robotName%></div>
	    	<div id="login">
        	<h2>Share/Revoke</h2> 
        	<form action="ShareCheck.jsp" method="post">
        	Input Developer Name:<input type="text" name= "user" placeholder= "username" value="">
<input type ="hidden" name="robot" value="<%=robotName%>">
            	<br/><output type="text" size="200px" ><%=robotName%></output>
		
		<br/><select name="permission">
			<option value="Share">Share</option>
  			<option value="Revoke">Revoke</option>
		</select>
            	<br/><input type="submit" value="Submit"> 
        	</form> 
        	<br/>
        	
        	
        </div>
    </body> 
</html>

