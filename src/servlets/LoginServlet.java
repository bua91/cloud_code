package servlets;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import javax.xml.parsers.*;
import javax.xml.transform.*;

import org.w3c.dom.*;

import java.io.*;

import javax.xml.transform.stream.*;
import javax.xml.transform.dom.*;
import javax.xml.xpath.*;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;

//import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;

import DAO.LoginDAO;
import DTO.UserDTO;
import Service.LoginRestClientService;

//@WebServlet(name="login",urlPatterns={"/loginServlet"})
public class LoginServlet extends HttpServlet {
	HttpSession session = null;

	public void doPost(
			HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.out.println("check for servlet....");
		
		 Statement statement = null;
		 String enteredUname=request.getParameter("username");
	        String enteredPwd=request.getParameter("password");
		 String searchQuery = "select * from User where UserName='" + enteredUname + "' AND Password='" + enteredPwd + "'";
		 // "System.out.println" prints in the console; Normally used to trace the process 
		 System.out.println("Your user name is " + enteredUname); 
		 System.out.println("Your password is " + enteredPwd);
		 System.out.println("Query: "+searchQuery); 
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/robocode";
			String user = "root";
                
			String password = "root";
		 try { 
				//Class.forName("com.mysql.jdbc.Driver").newInstance();

				 conn = DriverManager.getConnection(url, user, password);
	
			//	System.out.println("Hi");
				 statement = (Statement) conn.createStatement();
				 //connect to DB 
			//String connectionURL = "jdbc:mysql://localhost:3306/robocode";
				
				 
				ResultSet rs = statement.executeQuery(searchQuery);
				 boolean more = rs.next(); 
				 // if user does not exist set the isValid variable to false
				 if (!more){ 
					 response.sendRedirect("register.jsp");
				 	} 
				 //if user exists set the isValid variable to true 
				 else if (more) {
					 String uName = rs.getString("UserName"); 
					 System.out.println("Welcome " + uName);
					 session.setAttribute("userName",uName); 
					 response.sendRedirect("welcome.jsp");
				conn.close();	 }
			 } catch (Exception ex) { 
				 response.sendRedirect("Error.jsp");
				} //some exception handling 
		 		 
		 		 
		 		
		 }
}
