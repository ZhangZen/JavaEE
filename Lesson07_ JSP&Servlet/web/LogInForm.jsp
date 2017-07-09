<%-- 
    Document   : LogInForm
    Created on : Jan 15, 2017, 9:17:31 PM
    Author     : Zhang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Log in page</title>
    </head>
    <body>
        <%
            // Cach 1(tuong ung voi cach 1 trong servlet)
//            String emptyUerName = request.getParameter("emptyUserName");
//            if (emptyUerName != null && emptyUerName.equals("1")) {
//                out.println("<p style='color: red'> Empty user name! <p>");
//            }
//            String emptyPass = request.getParameter("emptyPassword");
//            if (emptyPass != null && emptyPass.equals("1")) {
//                out.println("<p style='color: red'> Empty password! <p>");
//            }
            //---------------
            // Cach 2(tuong ung voi cach 2 trong servlet), dung Attribute
            String emptyUserName = (String) request.getAttribute("emptyUserName");
            if (emptyUserName != null && !emptyUserName.isEmpty()) {
                out.println(emptyUserName);
            }
//            String pass = request.getParameter("password");
//            if (pass == null) {
//                pass = "";
//            }
        %>
        <form action="SolveLogIn" method="post">
            <fieldset style="width: 40%">
                <legend>Personal Information</legend>
                User name: <br>
                <input type="text"  onfocus="this.style.backgroundColor = 'white'" name="userName" value="${param.userName}"
                       <%
//                           if (emptyUserName != null && !emptyUserName.isEmpty()) {
//                               out.print("style='background-color: red'");
//                           }
                       %>
                       ><br>
                Password: <br>
                <!--<input type="password" name="password" value="<//%=pass%>"><br>-->
                <input type="text" name="password" value="${param.password}"><br>
                <br>
                <input type="submit" name="logIn" value="Log in">
            </fieldset>
        </form>
        <!--Cach 3: Nen dung vi khong phai kiem tra attribute lay ve co khac null hay khong-->
        <h4>${requestScope.emptyUserName}</h4>
        <h4>${requestScope.emptyPassword}</h4>
        <h4>${requestScope.notAdmin}</h4>
    </body>
</html>
