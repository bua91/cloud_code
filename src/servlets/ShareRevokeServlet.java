package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.codehaus.jackson.map.ObjectMapper;

import DAO.RegistrationDAO;
import DTO.RobotDTO;
import DTO.UserDTO;
import Service.LoginRestClientService;
import Service.RegistrationRestClientService;
import Service.SaveRobotRestClientService;
import java.sql.*;

public class ShareRevokeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShareRevokeServlet() {
        super();
        System.out.println("Inside Registration Servlet");
        
        // TODO Auto-generated constructor stub
    }

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	/*share or revoke robot code.

	 * 
	 */
	String entereduName=request.getParameter("user");
	String selectedRobot = request.getParameter("robot");
	String permission = request.getParameter("permission");
	ResultSet userResultset= null;
	String connectionURL = null;
	 //selectString = null;
	Connection connection = null;
	String uName = null;
	Boolean found = false;
	ResultSet robotResultset= null;
	String updatePerm = null;
	Boolean writeFlag = false;
	String writeUser = null;
	try {
					 connectionURL = "jdbc:mysql://localhost:3306/robocode";
										Class.forName("com.mysql.jdbc.Driver").newInstance();
										 connection = DriverManager.getConnection(connectionURL, "root","root");

										Statement statement = connection.createStatement();
				String	 selectString="Select distinct UserName from User;";
				
				 userResultset = statement.executeQuery(selectString);
				while(userResultset.next()){
					uName = userResultset.getString("UserName");
					if(uName.equals(entereduName)){
						found = true;
						break;
					}
				}
		}catch (Exception ex) { 
					 response.sendRedirect("Error.jsp");
						}
		
	
		
		
		if(found == true){
		
			try {
					Statement statement = connection.createStatement();
					String selectString="Select writeUser from robot where robotID='"+selectedRobot+"'";
					robotResultset = statement.executeQuery(selectString);
					writeUser = robotResultset.getString("writeUser");
			
					if(permission.equals("Share")){
						if(writeUser != null){
							writeUser = writeUser+"-"+entereduName;
							writeFlag = true;
						}else{
							writeUser = entereduName;
							writeFlag = true;
						}
		
				
					}else if(permission.equals("Revoke")){
						if(writeUser != null){
							String[] words = writeUser.split("-");
							writeUser = null;
							for(int i=0;i<words.length;i++){
									if(!words[i].equals(entereduName)){
										if(i<words.length-1){writeUser = writeUser+"-"+words[i];}
										else {writeUser = writeUser+words[i];}
								
									}				
							}
						}else{
							response.sendRedirect("Error.jsp");
						}
					}
			}catch (Exception ex) { 
							 response.sendRedirect("Error.jsp");
							} 

			
	
			updatePerm = "UPDATE robot SET writeUser='"+writeUser+"'WHERE robotID='"+selectedRobot+"'";
			//create a new file with the updated robot code
			try {
				PreparedStatement statement = connection.prepareStatement(updatePerm);
				 statement.executeUpdate();
			}catch(Exception ex) { 
							 response.sendRedirect("Error.jsp");
							} 
		}else{
			response.sendRedirect("Edit_Robot3.jsp");
			}

	
	  }
 }
