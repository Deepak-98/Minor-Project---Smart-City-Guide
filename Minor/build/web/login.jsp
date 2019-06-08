<%@page import="java.sql.ResultSet"%>
<%@page import="com.mysql.jdbc.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="com.mysql.jdbc.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login here</title>
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
            if(session.getAttribute("email") != null){
                out.print("<center><h3>You are already logged in</h3></center>");
            }else{
        %>
    <center>
        <h1>Login</h1>
        <form action="login.jsp" method="post">
            <table cellspacing="5" cellpadding="5" width="80%">
                <tr>
                    <td align="center">
                        Email:
                    </td>
                    <td align="center">
                        <input type="email" name = "email" id="email" placeholder="type email here" required>
                    </td>
                </tr>
                
                <tr>
                    <td align="center">
                        Password:
                    </td>
                    <td align="center">
                        <input type="password" name = "password" placeholder="type password here" required>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="Login"/>
                    </td>
                </tr>
            </table>
        </form>
                
                <%
                try{    
                            String email = request.getParameter("email");
                            String password = request.getParameter("password");
                            if(!email.isEmpty() && !password.isEmpty()){
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/minor","root","root");
                                Statement stmt = (Statement)con.createStatement();
                                String query = "select * from members where email='"+email+"' and password='"+password+"';";
                                ResultSet rs = stmt.executeQuery(query);
                                if(!rs.isBeforeFirst()){
                                    out.print("<center>Some credentials are Wrong</center>");
                                }
                                else{
                                    while(rs.next()){
                                        String usertype3 = rs.getString("type");
                                        session.setAttribute("email",email);
                                        session.setAttribute("usertype",usertype3);
                                        response.sendRedirect("index.jsp");
                                        
                                        
//                                        session.setAttribute("email",email);
//                                        session.setAttribute("usertype",usertype3);
//                                        if(usertype.equals("admin")){
//                                            response.sendRedirect("index.jsp");
//                                        }
//                                        else if(usertype.equals("user")){
//                                            response.sendRedirect("index.jsp");
//                                        }
                                    }
                            }
                            }
                }
              catch(NullPointerException ne){}
              catch(Exception e){
                    out.println(e);
                }
                }
            %>
    </center>
    </body>
</html>
