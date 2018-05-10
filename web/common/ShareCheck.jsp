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
        String entereduName=request.getParameter("user");
	String selectedRobot = request.getParameter("robot");
	String permission = request.getParameter("permission");
	ResultSet userResultset= null;
	String connectionURL = null;
	 //selectString = null;
	Connection connection = null;
	String uName = null;
	Boolean found = false;
	//ResultSet robotResultset= null;
	String updatePerm = null;
	Boolean writeFlag = false;
	String writeUser = null;
	String uRole = null;
	String	 selectString1 = null;
	String	 selectString2 = null;
	String checkVar = null;
	try {
		connectionURL = "jdbc:mysql://localhost:3306/robocode";
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		connection = DriverManager.getConnection(connectionURL, "root","root");
checkVar="test1";

		Statement statement = connection.createStatement();
		selectString1 = "Select distinct UserName,Role from User";
				
		userResultset = statement.executeQuery(selectString1);
		while(userResultset.next()){
			uName = userResultset.getString("UserName");
			uRole = userResultset.getString("Role");
			if(uName.equals(entereduName) && uRole.equals("Developer")){
				found = true;
				break;
			}
		}
				
		if(found == true){
checkVar="test2";
				
			connection = DriverManager.getConnection(connectionURL, "root","root");
					Statement statement2 = connection.createStatement();
					selectString2="Select writeUser from robot where robotID='"+selectedRobot+"' AND writeUser IS NOT NULL";
			
					ResultSet  robotResultset = statement2.executeQuery(selectString2);

					if(robotResultset.next() != false){

						writeUser = robotResultset.getString("writeUser");
					}

					if(permission.equals("Share")){
						
						if(writeUser != null ){
							writeUser = writeUser+entereduName+"-";
							writeFlag = true;
						}else if(writeUser == null){
							checkVar="test3";

							writeUser = entereduName+"-";
							writeFlag = true;
						
						}
				
					}else if(permission.equals("Revoke")){
						if(writeUser != null){
							String[] words = writeUser.split("-");
							writeUser = Character.toString('\0');
							for(int i=0;i<words.length;i++){
									if(!words[i].equals(entereduName)){
										
										if(i<words.length-1){if(i==0){writeUser=words[0]+"-";}else{writeUser = writeUser+"-"+words[i];}}
										else {writeUser = writeUser+words[i];}
							
									}				
							}

						}else{
							response.sendRedirect("Error.jsp");
						}
					}
			
			
	
			updatePerm = "UPDATE robot SET writeUser='"+writeUser+"'WHERE robotID='"+selectedRobot+"'";
			//create a new file with the updated robot code
			checkVar=  updatePerm;
				PreparedStatement statement3 = connection.prepareStatement(updatePerm);
				 statement3.executeUpdate();
			
		}else{
			response.sendRedirect("Edit_Robot3.jsp");
			}
	}catch (Exception ex) { 
				ex.printStackTrace();
					 response.sendRedirect("Error.jsp");
						}

        %>
<h2><%=selectedRobot%>Robot sucessfully <%=permission%>d to/from <%=entereduName%></h2>
<a href="welcome.jsp">Welcome page</a>
    </body>
</html>

