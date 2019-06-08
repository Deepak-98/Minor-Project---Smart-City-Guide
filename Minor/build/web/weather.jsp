<%@page import="java.net.UnknownHostException"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.simple.parser.JSONParser"%>
<%@page import="java.io.InputStream"%>
<%@page import="java.net.URLConnection"%>
<%@page import="java.util.Scanner"%>
<%@page import="java.util.Scanner"%>
<%@page import="java.net.URL"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Weather Info</title>
        <style>
            body{
                background-color: #fff1f6;
                font-family:sans-serif;
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
        <%
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
        %>
    <center>
        <h1>Welcome to Jabalpur the current weather is</h1><br/>
        <table cellpadding="10" cellspacing="20">
            <tr>
                <td>Temperature in Celcius</td>
                <td><% out.print(pageContext.findAttribute("temprature")); %></td>
            </tr>
            <tr>
                <td>Last Updated On :</td>
                <td> <% out.print(pageContext.findAttribute("last_updated")); %></td>
            </tr>
            <tr>
                <td>Condition now :</td>
                <td><% out.print(pageContext.findAttribute("text")); %></td>
            </tr>
        </table>
    </center>
    </body>
</html>
