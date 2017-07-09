<%-- 
    Document   : DemoSession
    Created on : Jan 17, 2017, 8:23:36 PM
    Author     : Zhang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Demo before session</title>
    </head>
    <body>
        <p>Demo khi dung bien binh thuong</p>
        <%
            int n = 0;
            n++;
            out.print(n);
            // lam ntn se khong thay doi duoc gia tri cua n moi khi refresh lai page (do phai request lai)
        %>
        <hr>
        <p>Demo khi dung attribute</p>
        <%
            // neu su dung attribute cung khong the thay doi duoc gia tri cua n
            // do attribute la cua request
            int m = 0;
            Object mObject = request.getAttribute("m");
            if (mObject != null) {
                m = Integer.parseInt(mObject.toString());
            }
            m++;
            request.setAttribute("m", m);
        %>
        ${requestScope.m}
        <hr>
        <p>Demo khi dung session</p>
        <%
            // neu dung session, thi se luu duoc gia tri cua bien
            // vi moi bien se co 1 vung nho session rien danh cho no, khong bi mat di khi request lai page
            int k = 0;
            Object kObject = session.getAttribute("k");
            if (kObject != null) {
                k = Integer.parseInt(kObject.toString());
            }
            k++;
            session.setAttribute("k", k);
        %>
        Demo session: ${sessionScope.k}
        <hr>
        <p>Demo khi dung application (Servlet context)</p>
        <%
            // lon hon vung nho session do la application (Serlvlet context),
            //no la vung nho dung chung cho tat ca cac request khac nhau
            int t = 0;
            Object tObject = application.getAttribute("t");
            if (tObject != null) {
                t = Integer.parseInt(tObject.toString());
            }
            t++;
            application.setAttribute("t", t);
        %>
        Application: ${applicationScope.t}
        <hr>
        Session event: ${sessionScope.abc}
        <hr>
        Cookies: ${cookie.user.value}
    </body>
</html>
