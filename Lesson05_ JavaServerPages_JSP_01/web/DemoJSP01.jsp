<%-- 
    Document   : DemoJSP01
    Created on : Jan 11, 2017, 10:00:31 AM
    Author     : Zhang
--%>

<%@page import="model.SinhVien"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            // code nhu java
            int a = 10;
            int b = 20;
            int c = a + b;
            out.println(c + "<br>");
            SinhVien sinhVien = new SinhVien(100, "Nguyen Van A", "CN1");
            out.println(sinhVien);
            for (int i = 0; i < 10; i++) {
        %>
        <%=c%><br>
        <%}
        %>
        <%
            //Cach lay dy lieu ve tu dia chi
            String aString = request.getParameter("a");
            out.println("Bien a lay ve duoc la: " + aString + "<br>");
        %>
    </body>
</html>