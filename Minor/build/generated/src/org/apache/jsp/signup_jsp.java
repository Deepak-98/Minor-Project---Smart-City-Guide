package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import com.mysql.jdbc.Statement;
import com.mysql.jdbc.Connection;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/navigation.html");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Sign Up</title>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-color: #fff1f6;\n");
      out.write("                font-family:sans-serif;\n");
      out.write("            }\n");
      out.write("            table{\n");
      out.write("                width: 50%;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("            }\n");
      out.write("            td{\n");
      out.write("                padding: 5px;\n");
      out.write("            }\n");
      out.write("            th{\n");
      out.write("                padding: 10px;\n");
      out.write("                background-color: #678bf1;\n");
      out.write("                color: white;\n");
      out.write("                font-size: 30px;\n");
      out.write("            }\n");
      out.write("            tr:nth-child(even){\n");
      out.write("                background-color: white;\n");
      out.write("            }\n");
      out.write("            tr:nth-child(odd){\n");
      out.write("                background-color: #fff1d4 ;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/navbar.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <ul>\n");
      out.write("        <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("        \n");
      out.write("        <li class=\"dropdown\">\n");
      out.write("          <a href=\"javascript:void(0)\" class=\"dropbtn\">My City</a>\n");
      out.write("          <div class=\"dropdown-content\">\n");
      out.write("            <a href=\"general.jsp\">General Facts</a>\n");
      out.write("            <a href=\"history.jsp\">History</a>\n");
      out.write("            <a href=\"weather.jsp\">Weather</a>\n");
      out.write("          </div>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("        <li class=\"dropdown\">\n");
      out.write("          <a href=\"javascript:void(0)\" class=\"dropbtn\">Local Services</a>\n");
      out.write("          <div class=\"dropdown-content\">\n");
      out.write("            <a href=\"tent.jsp\">Tent House</a>\n");
      out.write("            <a href=\"courier.jsp\">Courier & Shipping</a>\n");
      out.write("            <a href=\"addmoreservice.jsp\">Add Your Local Business..</a>\n");
      out.write("          </div>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("        <li class=\"dropdown\" style=\"float:right;margin-right: 20px\">\n");
      out.write("          <strong><a href=\"javascript:void(0)\" class=\"dropbtn\">Login/SignUp</a></strong>\n");
      out.write("          <div class=\"dropdown-content\">\n");
      out.write("            <a href=\"login.jsp\">Login</a>\n");
      out.write("            <a href=\"signup.jsp\">SignUp</a>\n");
      out.write("            <a href=\"logout.jsp\">Logout</a>\n");
      out.write("          </div>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        ");

            if(session.getAttribute("email") != null){
                response.sendRedirect("login.jsp");
            }
        
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <h1>Sign Up</h1>\n");
      out.write("        <form action=\"signup.jsp\">\n");
      out.write("            <table cellspacing=\"5\" cellpadding=\"5\" width=\"80%\">\n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"center\">\n");
      out.write("                        Email : \n");
      out.write("                    </td>\n");
      out.write("                    <td align=\"center\">\n");
      out.write("                        <input type=\"email\" placeholder=\"type email here\" name=\"email\" required/> \n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"center\">\n");
      out.write("                        Password : \n");
      out.write("                    </td>\n");
      out.write("                    <td align=\"center\">\n");
      out.write("                        <input type=\"password\" placeholder=\"type password here\" name=\"password\" required/> \n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"center\">\n");
      out.write("                       Confirm Password :\n");
      out.write("                    </td>\n");
      out.write("                    <td align=\"center\">\n");
      out.write("                        <input type=\"password\" placeholder=\"retype password here\" name=\"repass\" required/> \n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"center\"colspan=\"2\">\n");
      out.write("                        <input type=\"submit\" value=\"register\" required/> \n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("        ");

            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String repass = request.getParameter("repass");
            if(email != null && password != null){
            if(!password.equals(repass)){
                out.print("<center>Your passwords do not match<br/>Please Try Again ..</center>");
            }
            else{
                    Class.forName("com.mysql.jdbc.Driver");  
                    Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/minor","root","root");
                    Statement stmt =  (Statement)con.createStatement();
                    String sql = "insert into members values('"+email+"','"+password+"','user');";
                    int rowsaffected = stmt.executeUpdate(sql);
                    if(rowsaffected > 0){
                        out.print("<center>Registered Succesfull</center>");
                        response.sendRedirect("login.jsp");
                    }
                    else{
                        out.print("<center>Register failed</center><br/>");
                        out.print("<center>Something went wrong Please try after some time</center>");
                    } 
                }
            }
        
      out.write("\n");
      out.write("    </center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
