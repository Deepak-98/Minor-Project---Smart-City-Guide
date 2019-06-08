<%@page import="com.mysql.jdbc.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="com.mysql.jdbc.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Your Service ...</title>
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
        <script>
            function phonenumber(inputtxt)
            {
                var phoneno = /^\d{10}$/;
                if (inputtxt.value.match(phoneno))
                {
                    return true;
                } else
                {
                    alert("Not a valid Phone Number");
                    return false;
                }
            }
        </script>
        <%
            response.setHeader("cache-control", "no-cache,no-store,must-revalidate");
            String email = (String) session.getAttribute("email");
            if (email == null) {
                response.sendRedirect("login.jsp");
            }
            String usertype = (String) session.getAttribute("usertype");
            if (usertype != null) {
                if (usertype.equals("user")) {
        %>
        <%@include  file="navigation.html" %>
        <%
        } else if (usertype.equals("admin")) {
        %>
        <%@include  file="admin_nav.html" %>
        <%
            }
        } else {
        %><%@include  file="navigation.html" %><%
                    }
        %>
    <center>
        <h1>Add your Business/Service in this website for FREE ...</h1><br/>

        <form action="addmoreservice.jsp" method="post" name="form1">
            <table cellspacing="20">
                <tr>
                    <td align="center">Business Name :</td>
                    <td align="center"><input type="text" name="businessname" required/></td>
                </tr>
                <tr>
                    <td align="center"> Your Full name : </td>
                    <td align="center"><input type="text" name="fullname" required/></td>
                </tr>
                <tr>
                    <td align="center">Mobile Number : </td>
                    <td align="center"><input type="text" name="number" maxlength="10" required/></td>
                </tr>
                <tr>
                    <td align="center">Address : </td>
                    <td align="center"><input type="text" name="address" required/></td>
                </tr>
                <tr>
                    <td align="center">Type of Business : 
                    </td>
                    <td align="center"><select name="typeofbusiness" >
                            <option value="tenthouse">Tent & Caters</option>
                            <option value="courier">Courier & Shipping</option>
                        </select></td>
                </tr>
                <tr>
                    <td align="center" colspan="2">
                        <input type="submit" value="Add this Service" onclick="phonenumber(document.form1.number)"/>
                    </td>
                </tr>
            </table>                                     
        </form>

        <%
            String businessName = request.getParameter("businessname");
            String fullName = request.getParameter("fullname");
            String typeOfBusiness = request.getParameter("typeofbusiness");
            String contact = request.getParameter("number");
            String address = request.getParameter("address");
            if (businessName != null && fullName != null && typeOfBusiness != null && contact != null && address != null) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/minor", "root", "root");
                    Statement stmt = (Statement) con.createStatement();
                    String sql = "insert into " + typeOfBusiness + " values('" + businessName + "','" + address + "','" + contact + "','" + fullName + "')";
                    int rowsaffected = stmt.executeUpdate(sql);
                    if (rowsaffected > 0) {
                        out.print("<center>Your Service has been added...</center>");
                    } else {
                        out.print("<center>Something went wrong Please try after some time</center>");
                    }
                } catch (Exception e) {
                }
            }
        %>
    </center>
</body>
</html>
