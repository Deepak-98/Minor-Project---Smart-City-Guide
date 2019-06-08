<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="com.mysql.jdbc.Statement"%>
<%@page import="com.mysql.jdbc.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Members</title>
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
    <center>
        <h1>Register new Admins for your Website here.....</h1><br/>
        
        <form action="addadmin.jsp" method="post">
            <table cellspacing="5" cellpadding="5" width="80%">
                <tr>
                    <td align="center">
                        Email : 
                    </td>
                    <td align="center">
                        <input type="email" placeholder="type email here" name="email" required/> 
                    </td>
                </tr>
                
                <tr>
                    <td align="center">
                        Password : 
                    </td>
                    <td align="center">
                        <input type="password" placeholder="type password here" name="password" required/> 
                    </td>
                </tr>
                
                <tr>
                    <td align="center">
                       Confirm Password :
                    </td>
                    <td align="center">
                        <input type="password" placeholder="retype password here" name="repass" required/> 
                    </td>
                </tr>
                <tr>
                    <td align="center">
                       User type :
                    </td>
                    <td align="center">
                        <select name="usertype" >
                                    <option value="user">User</option>
                                    <option value="admin">Admin</option>
                        </select> 
                    </td>
                </tr>
                
                <tr>
                    <td align="center" colspan="2">
                        <input type="submit" value="register" required/> 
                    </td>
                </tr>
            </table>
        </form>
    </center>
        
         <%
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String repass = request.getParameter("repass");
            String usertype = request.getParameter("usertype");
            if(email != null && password != null){
            if(!password.equals(repass)){
                out.print("<center>Your passwords do not match<br/>Please Try Again ..</center>");
            }
            else{
                    Class.forName("com.mysql.jdbc.Driver");  
                    Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/minor","root","root");
                    Statement stmt =  (Statement)con.createStatement();
                    String query = "select * from members where email = '"+email+"' and password='"+password+"'";
                    ResultSet rs =  stmt.executeQuery(query);
                    if(rs.isBeforeFirst()){
                        while(rs.next()){
                            if(rs.getString("email").equals(email)){
                                out.print("<center>Admin already Registered</center>");
                            }
                        }
                    }
                    else{   
                            Statement stmt2 = (Statement)con.createStatement();
                            String sql = "insert into members values('"+email+"','"+password+"','"+usertype+"');";
                            int rowsaffected = stmt2.executeUpdate(sql);
                            if(rowsaffected > 0){
                                out.print("<center>Registered Succesfull</center>");
                            }
                            else{
                                out.print("<center>Register failed</center><br/>");
                                out.print("<center>Something went wrong Please try after some time</center>"); 
                            }
                    }
                }
            }
        %>
        
    </body>
</html>
