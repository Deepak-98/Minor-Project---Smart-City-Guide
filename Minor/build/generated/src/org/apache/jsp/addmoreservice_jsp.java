package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import com.mysql.jdbc.Connection;

public final class addmoreservice_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/navigation.html");
    _jspx_dependants.add("/admin_nav.html");
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
      out.write("        <title>Add Your Service ...</title>\n");
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
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <script>\n");
      out.write("            function phonenumber(inputtxt)\n");
      out.write("            {\n");
      out.write("                var phoneno = /^\\d{10}$/;\n");
      out.write("                if (inputtxt.value.match(phoneno))\n");
      out.write("                {\n");
      out.write("                    return true;\n");
      out.write("                } else\n");
      out.write("                {\n");
      out.write("                    alert(\"Not a valid Phone Number\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        ");

            response.setHeader("cache-control", "no-cache,no-store,must-revalidate");
            String email = (String) session.getAttribute("email");
            if (email == null) {
                response.sendRedirect("login.jsp");
            }
            String usertype = (String) session.getAttribute("usertype");
            if (usertype != null) {
                if (usertype.equals("user")) {
        
      out.write("\n");
      out.write("        ");
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

        } else if (usertype.equals("admin")) {
        
      out.write("\n");
      out.write("        ");
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
      out.write("        <li class=\"dropdown\">\n");
      out.write("          <a href=\"javascript:void(0)\" class=\"dropbtn\">Admin Job</a>\n");
      out.write("          <div class=\"dropdown-content\">\n");
      out.write("            <a href=\"\">View/Update/Delete any local Service</a>\n");
      out.write("            <a href=\"addadmin.jsp\">Add more admins...</a>\n");
      out.write("            <a href=\"\">view/update/delete members</a>\n");
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

            }
        } else {
        
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

                    }
        
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <h1>Add your Business/Service in this website for FREE ...</h1><br/>\n");
      out.write("\n");
      out.write("        <form action=\"addmoreservice.jsp\" method=\"post\" name=\"form1\">\n");
      out.write("            <table cellspacing=\"20\">\n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"center\">Business Name :</td>\n");
      out.write("                    <td align=\"center\"><input type=\"text\" name=\"businessname\" required/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"center\"> Your Full name : </td>\n");
      out.write("                    <td align=\"center\"><input type=\"text\" name=\"fullname\" required/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"center\">Mobile Number : </td>\n");
      out.write("                    <td align=\"center\"><input type=\"text\" name=\"number\" maxlength=\"10\" required/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"center\">Address : </td>\n");
      out.write("                    <td align=\"center\"><input type=\"text\" name=\"address\" required/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"center\">Type of Business : \n");
      out.write("                    </td>\n");
      out.write("                    <td align=\"center\"><select name=\"typeofbusiness\" >\n");
      out.write("                            <option value=\"tenthouse\">Tent & Caters</option>\n");
      out.write("                            <option value=\"courier\">Courier & Shipping</option>\n");
      out.write("                        </select></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"center\" colspan=\"2\">\n");
      out.write("                        <input type=\"submit\" value=\"Add this Service\" onclick=\"phonenumber(document.form1.number)\"/>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>                                     \n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        ");

            String businessName = request.getParameter("businessname");
            String fullName = request.getParameter("fullname");
            String typeOfBusiness = request.getParameter("typeofbusiness");
            String contact = request.getParameter("number");
            String address = request.getParameter("address");
            if (businessName != null && fullName != null && typeOfBusiness != null && contact != null && address != null) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/minor", "root", "root");
                    Statement stmt = (Statement) con.createStatement();
                    String sql = "insert into " + typeOfBusiness + " values('" + businessName + "','" + address + "','" + contact + "','" + fullName + "')";
                    int rowsaffected = stmt.executeUpdate(sql);
                    if (rowsaffected > 0) {
                        out.print("<center>Your Service has been added...</center>");
                    } else {
                        out.print("<center>Something went wrong Please try after some time</center>");
                    }
                } catch (Exception e) {
                }
            }
        
      out.write("\n");
      out.write("    </center>\n");
      out.write("</body>\n");
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
