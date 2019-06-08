<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.mysql.jdbc.Statement"%>
<%@page import="com.mysql.jdbc.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Members</title>
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
        <%@include  file="admin_nav.html" %>
        <%
            response.setHeader("cache-control","no-cache,no-store,must-revalidate");
            if(session.getAttribute("email") == null){
                response.sendRedirect("login.jsp");
            }
            if(session.getAttribute("usertype").equals("user")){
                response.sendRedirect("#");
            }
        %>
        
        <%
          Class.forName("com.mysql.jdbc.Driver");  
          Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/minor","root","root");
          Statement stmt =  (Statement)con.createStatement();
          String sql = "select * from members order by type;";
          ResultSet rs = stmt.executeQuery(sql); 
        %>
        
    <center>
        <h1>All members of your website are listed here</h1><br/>
        <table cellspacing="5" cellpadding="5" width="80%">
              <tr>
              <th>Email</th>
              <th>User Type</th>
              <th>Action</th>
              </tr>
              <%
                while(rs.next()){ 
              %>
              <tr>
                  <td align="center">
                      <% out.print(rs.getString("email")); %>
                  </td>
                  <td align="center">
                      <% out.print(rs.getString("type"));%>
                  </td>
                  <td align="center">
                      <form action="viewmembers.jsp">
                          <button>Update</button> / <button>Delete</button>(Developement)
                      </form>
                  </td>
              </tr>
        <%}%>
        </table>
    </center>
    </body>
</html>
