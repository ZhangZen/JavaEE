<%-- 
    Document   : LogInForm
    Created on : Feb 4, 2017, 9:31:28 AM
    Author     : Zhang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
        String emptyUserName = (String) request.getAttribute("emptyUser");
        String emptyPassword = (String) request.getAttribute("emptyPass");
    %>
    <body>
        <form action="SolveLogIn" method="post">
            <fieldset style="width: 30%">
                <legend>Personal information</legend>
                User name<br/>
                <input type="text" value="${param.userName}" name="userName" onfocus="this.style.backgroundColor = 'white'" <%
                    if (emptyUserName != null && !emptyUserName.isEmpty()) {
                        out.print("style='background-color: red'");
                    }
                       %>>${requestScope.emptyUser}<br/>
                Password<br/>
                <input type="password" value="${param.password}" name="password" onfocus="this.style.backgroundColor = 'white'" <%
                    if (emptyPassword != null && !emptyPassword.isEmpty()) {
                        out.print("style='background-color: red'");
                    }
                       %>/>${requestScope.emptyPass}<br/><br/>
                <input type="submit" value="Log in" name="logIn"/>
            </fieldset>
        </form>
    </body>
</html>
