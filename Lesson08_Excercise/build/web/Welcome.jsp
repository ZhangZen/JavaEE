<%-- 
    Document   : Welcome
    Created on : Feb 4, 2017, 10:33:13 AM
    Author     : Zhang
--%>

<%@page import="SessionEvent.SessionListener"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            // Cách này không hay lắm, tuy đếm được nhưng mỗi khi refresh lại trang thì nó sẽ tự tăng mặc dù chưa có người log in
            // Nên dùng SessionListener thì sẽ hay hơn
//            Integer hitsCount = (Integer) application.getAttribute("hitCounter");
//            if (hitsCount == null || hitsCount == 0) {
//                hitsCount = 1;
//                out.print("Welcome to my website<br>");
//            } else {
//                hitsCount++;
//                out.print("Welcome back to my website<br>");
//                if (hitsCount == 5) {
//                    out.print("soon!! You will receive a gift item<br>");
//                }
//            }
//            application.setAttribute("hitCounter", new Integer(hitsCount));
        %>
        <!--Total times user visits page: <%//= hitsCount%>-->
        <hr>
        <%
            SessionListener counter = (SessionListener) session.getAttribute("counter");
//            request.getRemoteAddr();
        %>
        Number of accessed times: <%=counter.getActiveSessionNumber()%>
    </body>
</html>
