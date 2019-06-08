package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.InputStream;
import java.net.URLConnection;
import java.net.URL;
import java.net.UnknownHostException;

public final class accomodation_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Accomodation Search</title>\n");
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

                String usertype = (String) session.getAttribute("usertype");
                if(usertype != null){
                     if (usertype.equals("user")) {
            
      out.write("\n");
      out.write("                    ");
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
      out.write("        <li><a href=\"accomodation.jsp\">Accomodations</a></li>\n");
      out.write("        \n");
      out.write("        <li><a href=\"attractions.jsp\">Attractions</a></li>\n");
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
      out.write("            ");

                    } else if(usertype.equals("admin")){
            
      out.write("\n");
      out.write("                    ");
      out.write("<html>\n");
      out.write("    <head>\n");
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
      out.write("            <a href=\"\">View/Update/Delete any local Service (Developement)</a>\n");
      out.write("            <a href=\"addadmin.jsp\">Add more admins...</a>\n");
      out.write("            <a href=\"viewmembers.jsp\">view/update/delete members</a>\n");
      out.write("          </div>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("        <li><a href=\"accomodation.jsp\">Accomodations</a></li>\n");
      out.write("        \n");
      out.write("        <li><a href=\"attractions.jsp\">Attractions</a></li>\n");
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
      out.write("            ");

                    }
                }
                else{
                    
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
      out.write("        <li><a href=\"accomodation.jsp\">Accomodations</a></li>\n");
      out.write("        \n");
      out.write("        <li><a href=\"attractions.jsp\">Attractions</a></li>\n");
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
      out.write("        <center>\n");
      out.write("        <form action=\"accomodation.jsp\">\n");
      out.write("            <h4>What do you want to search ?</h4><select name=\"typeofacc\" >\n");
      out.write("                            <option value=\"restaurants\">Restraunts</option>\n");
      out.write("                            <option value=\"hospitals\">Hospitals</option>\n");
      out.write("                            <option value=\"hotels\">Hotels</option>\n");
      out.write("                        </select>\n");
      out.write("            <input type=\"submit\" value=\"Search\"/>\n");
      out.write("        </form>\n");
      out.write("        </center>\n");
      out.write("        ");

            String nextpage;
            String typeofacc = request.getParameter("typeofacc");
            if(typeofacc != null){
                try{
                    URL url=new URL("https://maps.googleapis.com/maps/api/place/textsearch/json?query="+typeofacc+"+in+jabalpur&fields=formatted_address,name,opening_hours&key=AIzaSyDOltxIbBRRIWo48MxITOgSWl0Swl9L3xk"); 
                    URLConnection urlcon=url.openConnection();  
                    InputStream stream=urlcon.getInputStream(); 
                    int i;
                    String s="";
                    while((i=stream.read())!=-1){  
                          s+=(char)i;
                    }
                    JSONParser parser = new JSONParser();
                    JSONObject json = (JSONObject) parser.parse(s);
                    nextpage = (String)json.get("next_page_token");
                    pageContext.setAttribute("nextpagetoken", nextpage);
                    String status = (String) json.get("status");
                    if(status.equals("OK")) {
                        JSONArray results = (JSONArray) json.get("results");
                        for(int m=0 ;m<results.size();m++) {
                                JSONObject hotel = (JSONObject) results.get(m);
                                String name = (String) hotel.get("name");
                                String address = (String) hotel.get("formatted_address");
                                String rating = String.valueOf(hotel.get("rating"));
                                out.println("<center><h3>"+name+"</h3></center>");
                                out.println("<center>"+address+"</center><br/>");
                                out.println("<center>Rating :"+rating +"</center><br/><br/>");
                    }
                     
                }
                }catch(UnknownHostException e){
                     out.print("<br/><center>Something went Wrong<br/>Please check your internet connection</center>");
                }
            }
        
      out.write("\n");
      out.write("        <center>\n");
      out.write("        <form action=\"nextpage.jsp\">\n");
      out.write("            <input type=\"hidden\" value=\"");
 pageContext.findAttribute("nextpagetoken"); 
      out.write("\" name=\"nextpagetoken\"/>\n");
      out.write("            <input type=\"submit\" value=\"Next Page\"/>\n");
      out.write("        </form>\n");
      out.write("        </center>\n");
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
