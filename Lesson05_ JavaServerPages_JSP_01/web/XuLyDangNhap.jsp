<%-- 
    Document   : XuLyDangNhap
    Created on : Jan 11, 2017, 4:50:20 PM
    Author     : Zhang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String userName = request.getParameter("userName");
            String pass = request.getParameter("password");
            out.println("Welcome " + userName);
        %>
    </body>
</html>
