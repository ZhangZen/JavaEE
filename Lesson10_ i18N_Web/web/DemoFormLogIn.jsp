<%-- 
    Document   : DemoFormLogIn
    Created on : Jan 22, 2017, 9:00:45 AM
    Author     : Zhang
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Log in</title>
    </head>
    <body>
        <form action="SolveLogIn">
            <fieldset style="width: 30%">
                <fmt:setLocale value="${param.lang}"/>
                <fmt:setBundle basename="resources.label" var="bundle"/>
                <legend><fmt:message bundle="${bundle}" key="lTitle"/></legend>
                <fmt:message bundle="${bundle}" key="lUserName"/><br>
                <input type="text" name="userName" value=""><br>
                <fmt:message bundle="${bundle}" key="lPassword"/><br>
                <input type="password" name="password" value=""><br>
                <input type="radio" name="language" value="en_US" onclick="this.form.submit()" 
                       <c:if test="${param.lang=='en_US'}">checked="true"</c:if>
                           >English
                       <input type="radio" name="language" value="vi_VN" onclick="this.form.submit()"
                       <c:if test="${param.lang=='vi_VN'}">checked="true"</c:if>
                           >Tiếng Việt<br>
                       <input type="submit" name="logIn" value="<fmt:message bundle="${bundle}" key="bLogIn"/>"><br>
            </fieldset>
        </form>
    </body>
</html>
