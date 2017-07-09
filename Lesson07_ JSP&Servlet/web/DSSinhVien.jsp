<%-- 
    Document   : DSSinhVien
    Created on : Jan 15, 2017, 10:36:48 PM
    Author     : Zhang
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List"%>
<%@page import="Model.SinhVien"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student list</title>
    </head>
    <body>
        <%
//            List<SinhVien> dsSinhVien = (List<SinhVien>) request.getAttribute("ListSinhVien");
//            if (dsSinhVien != null) {
//                if (dsSinhVien.size() == 0) {
//                    out.print("Chua co sinh vien nao trong danh sach");
//                } else {
//                    // dung the table hien ra danh sach sinh vien
//                    for (SinhVien sinhVien : dsSinhVien) {
//                        out.print(sinhVien + "<br>");
//                    }
//                }
//            } else {
//                request.getRequestDispatcher("SinhVienController").forward(request, response);
//            }
%>
        <c:if test="${requestScope.dsSinhVien==null}">
            <c:redirect url="SinhVienController"/>
        </c:if>
        <c:if test="${requestScope.dsSinhVien!=null}">
            <table>
                <tr>
                    <th>Student ID</th>
                    <th>Student name</th>
                    <th>Grade</th>
                </tr>
                <c:forEach items="${requestScope.dsSinhVien}" var="sinhVien">
                    <tr>
                    <td>${sinhVien.maSV}</td>
                    <td>${sinhVien.tenSV}</td>
                    <td>${sinhVien.lop}</td>
                    </tr>
                </c:forEach>
            </table>
        </c:if>
    </body>
</html>
