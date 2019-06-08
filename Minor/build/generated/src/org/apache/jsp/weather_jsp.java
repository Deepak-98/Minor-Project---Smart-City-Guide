package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.net.UnknownHostException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.Scanner;
import java.util.Scanner;
import java.net.URL;

public final class weather_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Weather Info</title>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-color: #fff1f6;\n");
      out.write("                font-family:sans-serif;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/navbar.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <ul>\n");
      out.write("            <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("\n");
      out.write("            <li class=\"dropdown\">\n");
      out.write("                <a href=\"javascript:void(0)\" class=\"dropbtn\">My City</a>\n");
      out.write("                <div class=\"dropdown-content\">\n");
      out.write("                    <a href=\"general.jsp\">General Facts</a>\n");
      out.write("                    <a href=\"history.jsp\">History</a>\n");
      out.write("                    <a href=\"weather.jsp\">Current Weather</a>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"dropdown\">\n");
      out.write("                <a href=\"javascript:void(0)\" class=\"dropbtn\">Local Services</a>\n");
      out.write("                <div class=\"dropdown-content\">\n");
      out.write("                    <a href=\"tent.jsp\">Tent House</a>\n");
      out.write("                    <a href=\"courier.jsp\">Courier & Shipping</a>\n");
      out.write("                    <a href=\"addmoreservice.jsp\">Add Your Local Business..</a>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"dropdown\" style=\"float:right;margin-right: 20px\">\n");
      out.write("                <strong><a href=\"javascript:void(0)\" class=\"dropbtn\">Login/SignUp</a></strong>\n");
      out.write("                <div class=\"dropdown-content\">\n");
      out.write("                    <a href=\"login.jsp\">Login</a>\n");
      out.write("                    <a href=\"signup.jsp\">SignUp</a>\n");
      out.write("                    <!--<a href=\"logout.jsp\">Logout</a>-->\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("        ");

            try{
                String location ="jabalpur";
                URL url=new URL("https://api.apixu.com/v1/current.json?key=52e5e7f2e4c24c4ebe8110217190603&q="+location);  
                URLConnection urlcon=url.openConnection();  
                InputStream stream=urlcon.getInputStream(); 
                int i;
                String s="";
                while((i=stream.read())!=-1){  
                      s+=(char)i;
                }
                    JSONParser parser = new JSONParser();
                    JSONObject obj = (JSONObject) parser.parse(s);
                    JSONObject current = (JSONObject) obj.get("current");
                    double temprature = (double) current.get("temp_c");
                        pageContext.setAttribute("temprature", temprature);
                    String last_updated = (String)current.get("last_updated");
                        pageContext.setAttribute("last_updated", last_updated);
                    JSONObject condition = (JSONObject)current.get("condition");  
                    String text = (String)condition.get("text");
                        pageContext.setAttribute("text", text);
        }
        catch(UnknownHostException e){
            out.print("<br/><center>Something went Wrong<br/>Please check your internet connection</center>");
        }
        catch(Exception e){
            out.println(e);
        }  
        
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <h1>Welcome to Jabalpur the current weather is</h1><br/>\n");
      out.write("        <table cellpadding=\"10\" cellspacing=\"20\">\n");
      out.write("            <tr>\n");
      out.write("                <td>Temperature in Celcius</td>\n");
      out.write("                <td>");
 out.print(pageContext.findAttribute("temprature")); 
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Last Updated On :</td>\n");
      out.write("                <td> ");
 out.print(pageContext.findAttribute("last_updated")); 
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Condition now :</td>\n");
      out.write("                <td>");
 out.print(pageContext.findAttribute("text")); 
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
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
