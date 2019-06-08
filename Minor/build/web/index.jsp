<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Jabalpur Guide</title>
        <style>
            body{
                background-color: #fff1f6;
                font-family:sans-serif;
            }
        </style>
    </head>
    <body>
            <%
                String email = (String) session.getAttribute("email");
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
                if (email != null) {
                    out.print("<br/><center>Hello " + email + "</center>");
                    }
            %>
    <center>
        <h1>Jabalpur City<br/>
            Your City at your finger tips ...</h1>
    </center>
    <h1>Welcome to Jabalpur Guide</h1><hr/>
    <p> Me, a local resident of Jabalpur will introduce you to the best of everything here in this wonderful city.</p>
    <p>  My website is a complete collection of photos, maps, videos and up-to-date information on life in Jabalpur.</p>
    <p>  The city in all aspects has something in it for everyone. I would like to invite you to share my piece of paradise through the pictures, videos and visitor information throughout this web site.</p>
    <p> I promise you that you will love reading this website as much as I loved working on it. </p>
    <h1>About Jabalpur</h1>
    <hr/>
    Jabalpur is a tier 2 city in the state of Madhya Pradesh, India. It is one of the major cities of Madhya Pradesh. According to the 2011 census, it is the third-largest 
    urban agglomeration in Madhya Pradesh, and the country's 30th-largest urban agglomeration.
</body>
</html>
