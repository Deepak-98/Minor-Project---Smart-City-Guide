<%@page import="java.sql.ResultSet"%>
<%@page import="com.mysql.jdbc.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="com.mysql.jdbc.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Courier & Shipping</title>
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
        
        <%
          Class.forName("com.mysql.jdbc.Driver");  
          Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/minor","root","root");
          Statement stmt =  (Statement)con.createStatement();
          String sql = "select * from courier;";
          ResultSet rs = stmt.executeQuery(sql); 
        %>
    <center>
        <h1>Local Services - Courier & Shipping</h1>
        <table cellspacing="5" cellpadding="5" width="80%">
              <tr>
              <th>Name</th>
              <th>Address</th>
              <th>Contact</th>
              </tr>
              <%
                while(rs.next()){ 
              %>
              <tr>
                  <td align="center">
                      <% out.print(rs.getString("name")); %>
                  </td>
                  <td align="center">
                      <% out.print(rs.getString("address"));%>
                  </td>
                  <td align="center">
                      <% out.print(rs.getString("contact"));%>
                  </td>
              </tr>
        <%}%>
        </table>
        </center>
    </body>
</html>
