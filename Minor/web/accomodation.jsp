<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.simple.parser.JSONParser"%>
<%@page import="java.io.InputStream"%>
<%@page import="java.net.URLConnection"%>
<%@page import="java.net.URL"%>
<%@page import="java.net.UnknownHostException"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Accomodation Search</title>
        <style>
            body{
                background-color: #fff1f6;
                font-family:sans-serif;
            }
            table{
                width: 50%;
                border-collapse: collapse;
            }
            td{
                padding: 5px;
            }
            th{
                padding: 10px;
                background-color: #678bf1;
                color: white;
                font-size: 30px;
            }
            tr:nth-child(even){
                background-color: white;
            }
            tr:nth-child(odd){
                background-color: #fff1d4 ;
            }
        </style>
    </head>
    <body>
        <%
                String usertype = (String) session.getAttribute("usertype");
                if(usertype != null){
                     if (usertype.equals("user")) {
            %>
                    <%@include  file="navigation.html" %>
            <%
                    } else if(usertype.equals("admin")){
            %>
                    <%@include  file="admin_nav.html" %>
            <%
                    }
                }
                else{
                    %><%@include  file="navigation.html" %><%
                }
        %>
        <center>
        <form action="accomodation.jsp">
            <h4>What do you want to search ?</h4><select name="typeofacc" >
                            <option value="restaurants">Restraunts</option>
                            <option value="hospitals">Hospitals</option>
                            <option value="hotels">Hotels</option>
                        </select>
            <input type="submit" value="Search"/>
        </form>
        </center>
        <%
            String nextpage = null;
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
                    session.setAttribute("nextpagetoken", nextpage);
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
        %>
        <% if(nextpage != null){%>
        <center>
        <form action="nextpage.jsp">
            <input type="submit" value="Next Page"/>
        </form>
        </center>
            <%}%>
    </body>
</html>
