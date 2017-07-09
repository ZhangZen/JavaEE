<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<%--
    This file is an entry point for JavaServer Faces application.
--%>
<f:view><!--tất cả các thành phần của trang JSP trong JavaServer Face sẽ được chứa trong thẻ này-->
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>JSP Page</title>
        </head>
        <body>
            <h1><h:outputText value="JavaServer Faces"/></h1>
            <!-- trong đây muốn sử dụng HTML thuần thì nó sẽ chứa trong các thẻ h:-->
            <!--Form này không cần có action hay method, do trang jsp này sẽ tự động hiểu và gửi request lên servlet (do nó được cấu hình sẵn rồi)-->
            <h:form>
                User name<br>
                <h:inputText value="#{logInBean.userName}"/><br><!--Kết nối với file LogInBean-->
                Password <br>
                <h:inputSecret value="#{logInBean.password}" /><br>
                <!--<h:commandButton value="Log in" action="#{logInBean.xuLyLogIn}"/>--> <!--Sự kiện sẽ được kết nối tới hàm xuLyLogIn bên Bean-->
                <h:commandButton value="Log in" action="#{logInBean.solveLogIn}"/> <!--Sự kiện sẽ được kết nối tới hàm solveLogIn bên Bean-->
            </h:form>
            <!--Muốn đẹp thì cho vào panelGrid, nó sẽ tạo bảng với số cột mong muốn và đổ sẵn các thuộc tính ta định nghĩa vào trong đó-->
            <hr>
            <h:form>
                <h:panelGrid columns="2">
                    <h:outputText value="User name"/>
                    <h:inputText value="#{logInBean.userName}"/><!--Kết nối với file LogInBean-->
                    <h:outputText value="Password"/>
                    <h:inputSecret value="#{logInBean.password}" />
                    <!--<h:commandButton value="Log in" action="#{logInBean.xuLyLogIn}"/>--> <!--Sự kiện sẽ được kết nối tới hàm xuLyLogIn bên Bean-->
                    <h:commandButton value="Log in" action="#{logInBean.solveLogIn}"/> <!--Sự kiện sẽ được kết nối tới hàm solveLogIn bên Bean-->
                </h:panelGrid>
            </h:form>
        </body>
    </html>
</f:view>
