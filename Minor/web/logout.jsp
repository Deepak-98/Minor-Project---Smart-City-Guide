<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logout</title>
        <style>
            body{
                background-color: #fff1f6;
                font-family:sans-serif;
            }
        </style>
    </head>
    <body>
        <%@include  file="navigation.html" %>
        <%
            if(session.getAttribute("email") == null){
                response.sendRedirect("login.jsp");
            }
            else{
                session.invalidate();
            }
        %>
    <center><h1>Logout Successfull</h1>
        <a href="login.jsp">click here</a> to login.
    </center>
    </body>
</html>
