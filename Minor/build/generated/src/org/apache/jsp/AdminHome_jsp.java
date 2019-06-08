package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminHome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
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
      out.write("            <a href=\"\">Add more admins...</a>\n");
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

            response.setHeader("cache-control","no-cache,no-store,must-revalidate");
            String email = (String)session.getAttribute("email");
            if(session.getAttribute("email") == null){
                response.sendRedirect("login.jsp");
            }
            if(email != null){
                out.print("<br/><center>Hello "+email +"</center>" );
            }
        
      out.write("\n");
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
