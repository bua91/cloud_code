/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.81
 * Generated at: 2017-12-19 21:40:55 UTC
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

public final class PlayBattle_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/includes/header.jsp", Long.valueOf(1513662098000L));
  }

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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");

	ResultSet resultset = null;

      out.write("\n");
      out.write("<title>New Battle</title>\n");
      out.write("<span>");
 String check =null;
check= (String)session.getAttribute("username");
if(check == null )
response.sendRedirect("Login.jsp");
      out.write("</span>\n");
      out.write("\n");
      out.write("\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("<link\n");
      out.write("\thref=\"//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css\"\n");
      out.write("\trel=\"stylesheet\">\n");
      out.write("<link href=\"css/style_header.css\" rel=\"stylesheet\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("<script\n");
      out.write("\tsrc=\"http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("<script\n");
      out.write("\tsrc=\"http://netdna.bootstrapcdn.com/bootstrap/3.0.3/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Bootstrap Core CSS - Uses Bootswatch Flatly Theme: http://bootswatch.com/flatly/ -->\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Custom CSS -->\n");
      out.write("<link href=\"css/freelancer.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Custom Fonts -->\n");
      out.write("<link href=\"font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\"\n");
      out.write("\ttype=\"text/css\">\n");
      out.write("<link\n");
      out.write("\thref='https://fonts.googleapis.com/css?family=Righteous|Fredoka+One'\n");
      out.write("\trel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("<link\n");
      out.write("\thref=\"http://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic\"\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("<script src=\"http://code.jquery.com/jquery.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body id=\"page-top\" class=\"index\">\n");
      out.write("\t<!-- Navigation -->\n");
      out.write("\t<nav class=\"navbar navbar-default navbar-fixed-top\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("\t\t<div class=\"navbar-header page-scroll\">\n");
      out.write("\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\n");
      out.write("\t\t\t\tdata-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("\t\t\t\t<span class=\"sr-only\">Toggle navigation</span> <span\n");
      out.write("\t\t\t\t\tclass=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\n");
      out.write("\t\t\t\t\tclass=\"icon-bar\"></span>\n");
      out.write("\t\t\t</button>\n");
      out.write("\t\t\t<a class=\"navbar-brand\" href=\"welcome.jsp\">Robocode</a>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("\t\t<div class=\"collapse navbar-collapse\"\n");
      out.write("\t\t\tid=\"bs-example-navbar-collapse-1\">\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\t\t\t\t<li class=\"hidden\"><a href=\"#page-top\"></a></li>\n");
      out.write("\t\t\t\t<li class=\"dropdown\"><a href=\"#new\">New</a>\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"NewRobot.jsp\">Robot</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#CUser\">User</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#CDomain\">Domain</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#CRole\">Role</a></li>\n");
      out.write("\t\t\t\t\t</ul></li>\n");
      out.write("\n");
      out.write("\t\t\t\t<li class=\"dropdown\"><a href=\"#edit\">Edit</a>\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"Edit_Robot3.jsp\">Robot</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#EUser\">User</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#EDomain\">Domain</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#ERole\">Role</a></li>\n");
      out.write("\t\t\t\t\t</ul></li>\n");
      out.write("\t\t\t\t\t<li class=\"dropdown\"><a href=\"#view\">View</a>\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"ViewRobot.jsp\">Robot</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#VUser\">User</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#VDomain\">Domain</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#VRole\">Role</a></li>\n");
      out.write("\t\t\t\t\t</ul></li>\n");
      out.write("\t\t\t\t<li class=\"page-scroll\"><a href=\"PlayBattle.jsp\">Play Battle!</a></li>\n");
      out.write("\t\t\t\t<li class=\"page-scroll\"><a href=\"#view\">Settings</a></li>\n");
      out.write("\t\t\t\t<li class=\"page-scroll\"><a href=\"Logout.jsp\"><img\n");
      out.write("\t\t\t\t\t\tclass=\"img-responsive\" src=\"img/power button.png\" alt=\"\"\n");
      out.write("\t\t\t\t\t\tALIGN=\"RIGHT\" hspace=\"1\">Logout</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- /.navbar-collapse -->\n");
      out.write("\t</div>\n");
      out.write("\t</nav>\n");
      out.write("\t</body>\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("function submit() {\n");
      out.write("\t$(\"#role\").submit();\n");
      out.write("}\n");
      out.write("\n");
      out.write("function submit1() {\n");
      out.write("\t$(\"#heirarchy\").submit();\n");
      out.write("}\n");
      out.write("function submit2() {\n");
      out.write("\t$(\"#heirarchyc\").submit();\n");
      out.write("}\n");
      out.write("function submit3() {\n");
      out.write("\t$(\"#editrole\").submit();\n");
      out.write("}\n");
      out.write("function submit4() {\n");
      out.write("\t$(\"#heirarchyEdit\").submit();\n");
      out.write("}\n");
      out.write("function submit5() {\n");
      out.write("\t$(\"#packageEdit\").submit();\n");
      out.write("}\n");
      out.write("function submit6() {\n");
      out.write("\t$(\"#maph\").submit();\n");
      out.write("}\n");
      out.write("function submit8() {\n");
      out.write("\t$(\"#Ppermissionedit\").submit();\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</html>");
      out.write("\n");
      out.write("<script src=\"http://code.jquery.com/jquery.min.js\"></script>\n");
      out.write("  <script src=\"//code.jquery.com/jquery-1.10.2.js\"></script>\n");
      out.write("  <script src=\"//code.jquery.com/ui/1.11.4/jquery-ui.js\"></script>\n");
      out.write("   <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"/resources/demos/style.css\">\n");
      out.write("  <!-- Custom CSS -->\n");
      out.write("<link href=\"css/freelancer.css\" rel=\"stylesheet\"type=\"text/css\">\n");
      out.write("\n");
      out.write("<!-- Custom Fonts -->\n");
      out.write("<link href=\"font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\"\n");
      out.write("\ttype=\"text/css\">\n");
      out.write("\n");
      out.write("<link\n");
      out.write("\thref=\"http://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic\"\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\">\n");
      out.write("  <script>\n");
      out.write("  $(function() {\n");
      out.write("    $( \"#tabs\" ).tabs();\n");
      out.write("  });\n");
      out.write("  </script>\n");
      out.write("  <script type=\"text/javascript\">\n");
      out.write("    function gunCool(){\n");
      out.write("    \tvar num=document.getElementById(\"gunCool\").value;\n");
      out.write("    \tvar floatNum=parseFloat(num);\n");
      out.write("    \tif(isNaN(floatNum)){\n");
      out.write("    \t\talert(\"'Gun Cooling Rate' must be a floating point number >0 and <=0.7\\nDefault value is 0.1\");\n");
      out.write("    \t\tdocument.getElementById(\"gunCool\").value=0.1;\n");
      out.write("    \t}\n");
      out.write("    \telse if((floatNum<=0)||(floatNum>0.7)){\n");
      out.write("    \t\talert(\"'Gun Cooling Rate' must be a floating point number >0 and <=0.7\\nDefault value is 0.1\");\n");
      out.write("    \t\tdocument.getElementById(\"gunCool\").value=0.1;\n");
      out.write("    \t}\n");
      out.write("    \telse;\n");
      out.write("    \t\t\n");
      out.write("}\n");
      out.write("    function sentryBorder(){\n");
      out.write("    \tvar num=document.getElementById(\"sentryBorder\").value;\n");
      out.write("    \tvar intNum=parseInt(num);\n");
      out.write("    \tif(isNaN(intNum)){\n");
      out.write("    \t\talert(\"'Sentry Border Size' must be an integer value >= 50.\\nDefault value is 100\");\n");
      out.write("    \t\tdocument.getElementById(\"sentryBorder\").value=100;\n");
      out.write("    \t\t\n");
      out.write("    \t}\n");
      out.write("    \telse if(intNum<50){\n");
      out.write("    \t\talert(\"'Sentry Border Size' must be an integer value >= 50.\\nDefault value is 100\");\n");
      out.write("    \t\tdocument.getElementById(\"sentryBorder\").value=100;\n");
      out.write("    \t\n");
      out.write("    \t}\n");
      out.write("    \telse{\n");
      out.write("    \t\tdocument.getElementById(\"sentryBorder\").value=intNum;\n");
      out.write("    \t\t\n");
      out.write("    \t}\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<SCRIPT>\n");
      out.write("function getValueFromApplet(){\n");
      out.write("   var value;\n");
      out.write("\tdocument.myForm.q.value = document.myApplet.getResult();\n");
      out.write("\tvalue = document.myApplet.getResult();\n");
      out.write("\tvar RobotRankingsInfo = value.split(\" \"); \n");
      out.write("\tfor (i = 0; i < RobotRankingsInfo.length; i++) { \n");
      out.write("\t    var each_robot_info = RobotRankingsInfo[i].split(\":\");\n");
      out.write("\t    \n");
      out.write("\t}\n");
      out.write("   if(value.length > 1)\n");
      out.write("\t   {s\n");
      out.write("\t   \n");
      out.write("\t   \tdocument.forms[0].submit();\n");
      out.write("\t   }\n");
      out.write("   else\n");
      out.write("\t   {\n");
      out.write("\t   \n");
      out.write("\t   }\n");
      out.write("   \n");
      out.write("   }\n");
      out.write("</SCRIPT>\n");
      out.write("</head>\n");
      out.write("<body onload=\"selectAll();getDomains();selectAll();getRobots();selectAll()\">\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\tfunction Play(){\n");
      out.write("\t\twindow.location = \"PlayBattle2.jsp\";\n");
      out.write(" \t}\n");
      out.write("\tfunction selectAll(){\n");
      out.write("\t\t//document.getElementById(\"all\").selected=true;\n");
      out.write("\t\t$('select option:first-child').attr(\"selected\", \"selected\");\n");
      out.write("\t}\n");
      out.write("\t</script>\n");
      out.write("\t\n");
      out.write("\t<br><br><br><br><br><br><br><br><br>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("<div id=\"tabs\">\n");
      out.write("<ul>\n");
      out.write("\t<li onclick=\"gunCool();sentryBorder();\"><a href=\"#tabs-1\">Robots</a></li>\n");
      out.write("\t<li><a href=\"#tabs-2\">Rules</a></li>\n");
      out.write("</ul>\n");
      out.write("<div id=\"tabs-1\" >\n");
      out.write("<div class=\"form-group\">\n");
      out.write("\t<div class=\"input-group\">\n");
      out.write("\t\t");

			Set<String> list_of_tenants = new HashSet<String>();
			Set<String> list_of_domains = new HashSet<String>();
			Set<String> list_of_robots = new HashSet<String>();
			HashMap<String, List<String>> map = new HashMap<String, List<String>>();
			HashMap<String, List<String>> domain_robot_map = new HashMap<String, List<String>>();							
				try {
					String connectionURL = "jdbc:mysql://localhost:3306/robocode";
					Class.forName("com.mysql.jdbc.Driver").newInstance();
					Connection connection = DriverManager.getConnection(connectionURL, "root",
							"root");

					Statement statement = connection.createStatement();
					String selectString="SELECT userID, packageID, robotID from robot";
					resultset = statement
							.executeQuery(selectString);
					
							
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t\tfunction getDomains() {\n");
      out.write("\n");
      out.write("\t\t\tvar x = document.getElementById(\"domain_name\").value;\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\turl : \"GetrobotDomain2\",\n");
      out.write("\t\t\t\tdata : \"tenant_name=\" + x + \"\",\n");
      out.write("\t\t\t\ttype : 'POST',\n");
      out.write("\t\t\t\tasync : false,\n");
      out.write("\t\t\t\tsuccess : function(html) {\n");
      out.write("\t\t\t\t\tconsole.log(\"html:\" + html);\n");
      out.write("\t\t\t\t\t$(\"#package\").html(html);\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\terror : function(html) {\n");
      out.write("\t\t\t\t\tconsole.log(\"error html:\" + html);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t}\t\n");
      out.write("\t\t\n");
      out.write("\t\t</script>\n");
      out.write("\t\t<br>\t\n");
      out.write("\t\t<table>\n");
      out.write("    <tr>\n");
      out.write("        <td width=\"250px\"> \n");
      out.write("        &nbsp;&nbsp;User\n");
      out.write("\t<select multiple name=\"domain_name\" id=\"domain_name\" class=\"form-control\" onchange=\"getDomains()\">\n");
      out.write("\t\n");
      out.write("\t\t\t");

				while (resultset.next()) {
					list_of_tenants.add(resultset.getString(1));
					list_of_domains.add(resultset.getString(2));
					list_of_robots.add(resultset.getString(3));
					String value1 = resultset.getString(1);
					String value2 = resultset.getString(2);
					String value3 = resultset.getString(3);
					List<String> value = map.get(value1);
					if (value == null) {
						map.put(value1, new ArrayList<String>());
						map.get(value1).add(value2);
					} else {
						value = map.get(value1);
						if (!value.contains(value2)) {
							map.get(value1).add(value2);
						}

					}
					value = domain_robot_map.get(value2);
					if (value == null) {
						domain_robot_map.put(value2, new ArrayList<String>());
						domain_robot_map.get(value2).add(value3);
					} else {
						value = domain_robot_map.get(value2);
						if (!value.contains(value3)) {
							domain_robot_map.get(value2).add(value3);
						}

					}
				}
			
			Iterator iterator = list_of_tenants.iterator();
			while (iterator.hasNext()) {
				String key = (String) iterator.next();										
			
      out.write("\n");
      out.write("\n");
      out.write("\t\t<option value=\"");
      out.print(key);
      out.write('"');
      out.write('>');
      out.print(key);
      out.write("</option>\n");
      out.write("\t\t");

			}
		session.setAttribute("tenantMap", map);
		session.setAttribute("DomainMap", domain_robot_map);
			
      out.write("\n");
      out.write("\t</select>\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\tfunction getRobots() {\n");
      out.write("\n");
      out.write("\t\t\tvar x = document.getElementById(\"package\").value;\n");
      out.write("\t\t\t//alert(\"x value:\"+x);\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\turl : \"Getrobots2\",\n");
      out.write("\t\t\t\tdata : \"domain_name=\" + x + \"\",\n");
      out.write("\t\t\t\ttype : 'POST',\n");
      out.write("\t\t\t\tasync : false,\n");
      out.write("\t\t\t\tsuccess : function(html) {\n");
      out.write("\t\t\t\t\tconsole.log(\"html:\" + html);\n");
      out.write("\t\t\t\t\t$(\"#displayrobots\").html(html);\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\terror : function(html) {\n");
      out.write("\t\t\t\t\tconsole.log(\"error html:\" + html);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t}\t\n");
      out.write("\t\t</script></td>\n");
      out.write("        <td width=\"250px\"> \n");
      out.write("&nbsp;&nbsp;Package\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<select multiple name=\"package\" id=\"package\" class=\"form-control\"\n");
      out.write("\t\t\t\t\t\t\tonchange=\"getRobots()\" ></select> <br > \n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<script  type=\"text/javascript\">\n");
      out.write("\t\t\t\t\t\t\tfunction BattleButton(){\n");
      out.write("\t\t\t\t\t\t\t\tif (!$('selectrobots').val()){\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument.getElementById(\"battlebutton\").disabled = false;\n");
      out.write("\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\telse\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument.getElementById(\"battlebutton\").disabled = true;\n");
      out.write("\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t</script></td>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("         <td width=\"250px\"> \n");
      out.write("         &nbsp;&nbsp;Robots\n");
      out.write("\t\t\t\t\t\t<select multiple name=\"displayrobots\" id=\"displayrobots\"\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control\" >\n");
      out.write("\t\t\t\t\t\t</select>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t");

								} catch (Exception e) {
									out.println("wrong entry" + e);
								}
							
      out.write("\n");
      out.write("\t\t\t\t\t\n");
      out.write("         </td>\n");
      out.write("         <td width=\"100px\" align=\"center\"><button onclick=\"AddtoChosen()\">Add</button >\n");
      out.write("         </td>\n");
      out.write("         <td width=\"250px\"><script  type=\"text/javascript\">\n");
      out.write("\t\t\t\t\t\t\tfunction AddtoChosen(){\n");
      out.write("\t\t\t\t\t\t\t\t    $('#displayrobots option:selected').appendTo('#selectrobots');\n");
      out.write("\t\t\t\t\t\t\t\t    BattleButton();\n");
      out.write("\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t</script>\n");
      out.write("\t\t\t&nbsp;&nbsp;Selected Robots<select multiple name=\"selectrobots\" id=\"selectrobots\" class=\"form-control\" onchange=\"BattleButton()\">\n");
      out.write("\t\t\t</select>\n");
      out.write("\t\t\t</td>\n");
      out.write("    </tr>\n");
      out.write("</table>\t\t\n");
      out.write("\t</div>\n");
      out.write("\t\t\n");
      out.write("</div>\t\t\n");
      out.write("<!-- /.col-lg-6 (nested) -->\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div id=\"tabs-2\">\n");
      out.write("\t\t\t<table>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t<td>\n");
      out.write("\tNumber of Rounds: <br> (integer > 0)</td><td>\n");
      out.write("\t<input type=\"text\" name=\"numRounds\" onkeypress=\"return isNumberKey(event)\" value=\"10\"></td></tr>\n");
      out.write("\t<tr>\n");
      out.write("\t<td width=\"200px\">Gun Cooling Rate: <br> (>0 and <=0.7)</td><td>\n");
      out.write("\t<input type=\"text\" name=\"gunCool\" id=\"gunCool\" value=\"0.1\"></td></tr>\n");
      out.write("\t<tr>\n");
      out.write("\t<td>\n");
      out.write("\tInactivity Time: <br> (integer >= 0)</td>\n");
      out.write("\t<td><input type=\"text\" name=\"inactivity\" onkeypress=\"return isNumberKey(event)\" value=\"450\"></td></tr>\n");
      out.write("\t<tr><td>\n");
      out.write("\tSentry Border Size: <br> (integer >= 50)</td>\n");
      out.write("\t<td><input type=\"text\" name=\"sentryBorder\" id=\"sentryBorder\" value=\"100\"></td></tr>\n");
      out.write("\t<tr><td>\n");
      out.write("\tHide Enemy Names: </td><td><input type=\"checkbox\" name=\"enemy\" value=\"enemy\">  </td></tr>\n");
      out.write("\t</table>\n");
      out.write("\t</div>\t\t\t\n");
      out.write("\t\t\t<!-- /.row (nested) -->\n");
      out.write("\t\t</div>\n");
      out.write("<script language=Javascript>\n");
      out.write("function isNumberKey(evt)\n");
      out.write("{\n");
      out.write("   var charCode = (evt.which) ? evt.which : event.keyCode\n");
      out.write("   if (charCode > 31 && ((charCode < 48) || charCode > 57))\n");
      out.write("      return false;\n");
      out.write("\n");
      out.write("   return true;\n");
      out.write("}\n");
      out.write("function fifty(evt)\n");
      out.write("{\n");
      out.write("\tvar numbers = /^[0]\\.[0-9]+$/; \n");
      out.write("   if (charCode > 31 && ((charCode < 48) || charCode > 57))\n");
      out.write("      return false;\n");
      out.write("\n");
      out.write("   return true;\n");
      out.write("}\n");
      out.write("</script>\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write(" <div class=\"container\">\n");
      out.write("\t\t<div id=\"page-wrapper\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-lg-12\">\n");
      out.write("\t\t\t\t\t<h1 class=\"page-header\">\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-play\"></i><button disabled name=\"battlebutton\" id=\"battlebutton\" onclick=\"Play()\"> Play Battle</button>\n");
      out.write("\t\t\t</h1>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- /.col-lg-12 -->\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- /.row -->\n");
      out.write("\t\t\t<!--  <div class=\"row\">\n");
      out.write("\t\t <applet \n");
      out.write("    code=\"robocode.Robocode\"\n");
      out.write("    name=\"myApplet\"\n");
      out.write("\tcodebase = \"jar\"\n");
      out.write("\twidth = 800\n");
      out.write("    height = 600\n");
      out.write("\tarchive=\"robocode.jar\">\t\n");
      out.write("\t<param name=Robots value=\"");
      out.print(session.getAttribute("robots_name"));
      out.write("\">\n");
      out.write("\t<param name=numberofrounds value=\"");
      out.print(session.getAttribute("numberofrounds"));
      out.write("\">\n");
      out.write("\t\n");
      out.write("</applet>-->\n");
      out.write(" <FORM ACTION=\"scoreUpdate\" \n");
      out.write("     NAME=\"myForm\" \n");
      out.write("     onSubmit=\"return getValueFromApplet()\"\n");
      out.write("     method=\"post\">\n");
      out.write("   <INPUT TYPE=\"hidden\" VALUE=\"\" NAME=\"q\">\n");
      out.write("   <INPUT TYPE=\"submit\" VALUE=\"Check robots ranking\" >\n");
      out.write(" </FORM>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<br />\n");
      out.write("\t\t<br />\n");
      out.write("\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t&nbsp;&nbsp;\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\n");
      out.write("</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t<!-- /.panel-body -->\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
