<%@page  contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%
        ResultSet resultset = null;
%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Role change Page</title>
</head>
<body>
	<%
	   String user = request.getParameter("user");
	   String user_role= request.getParameter("userrole");
	   try {
	   String connectionURL = "jdbc:mysql://localhost:3306/robocode";
	   Class.forName("com.mysql.jdbc.Driver").newInstance();
	   Connection connection = DriverManager.getConnection(connectionURL, "root","root");
	   Statement statement = connection.createStatement();
	   String query_string = "UPDATE User SET Role = '"+user_role+"' where UserName = '"+user+"'";  
	   statement.executeUpdate(query_string);
	   }
	   catch (Exception se){
	   	se.printStackTrace();
	   }
	   response.sendRedirect("AdminPage.jsp");
	%>
<h2><%=user%> and <%=user_role%></h2>
</body>
</html>

