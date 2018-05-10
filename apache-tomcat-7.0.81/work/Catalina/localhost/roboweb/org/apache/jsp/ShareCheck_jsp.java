/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.81
 * Generated at: 2017-12-19 21:43:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class ShareCheck_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write('\n');

	ResultSet resultset = null;

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

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

        
      out.write("\n");
      out.write("<h2>");
      out.print(selectedRobot);
      out.write("Robot sucessfully ");
      out.print(permission);
      out.write("d to/from ");
      out.print(entereduName);
      out.write("</h2>\n");
      out.write("<a href=\"welcome.jsp\">Welcome page</a>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}