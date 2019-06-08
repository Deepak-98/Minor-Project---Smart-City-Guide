<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>General Facts</title>
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
        <h1>General Facts</h1>
        <p>Jabalpur was the <strong>325th largest city </strong>or urban area in the world in 2006.</p>
        <p>Jabalpur Collectorate is the first Collectorate in India who has been obtained the comprehensive <strong>ISO-9001 certificate</strong>. This has come into force from April 1, 2007</p>
        <p>As of 2001 India census, Jabalpur had a <strong>population of 1276853</strong>. Males constitute 52% of the population and females 48%.</p>
        <p>Jabalpur has an average <strong>literacy rate of 75%, </strong>higher than the national average of 59.5%.</p>
        <p>Jabalpur Engineering College has the distinction of being the <strong>Second Engineering College </strong>to be set up in India.</p>
    </body>
</html>
