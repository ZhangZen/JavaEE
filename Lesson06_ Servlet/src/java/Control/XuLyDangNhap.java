/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Zhang
 */
public class XuLyDangNhap extends HttpServlet {
    // co 2 ham can chu y, doGet va doPost
    // day la 2 ham server se chay khi co request tu client gui len

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("userName");// lấy về giá trị của parameter
        String passWord = req.getParameter("Pass");
        if (userName.trim().equals("admin")) {
            resp.sendRedirect("index.html");
        } else {
            if (userName.isEmpty() || passWord.isEmpty()) {
                resp.sendRedirect("logIn.html");
            } else {
                PrintWriter output = resp.getWriter();
//                ServletOutputStream outputStream = resp.getOutputStream();//ngoài ra còn có thể getOuputStream, dùng tương tự Writer
                output.print("<html>");
                output.print("<body>");
                output.print("<h1>" + userName + "</h1>");
                output.print("</body>");
                output.print("</html>");
                //----------------------------------------------------
                // Các tham số có thể lấy về từ request
                Object userNameAtt = req.getAttribute("userName");
                System.out.println(req.getRequestURI());
                Cookie[] cookies = req.getCookies();// trả về cookies 
                System.out.println("Danh sách cookies: ");
                for (Cookie cooky : cookies) {
                    System.out.println(cooky);
                }
                System.out.println("Danh sách headers: ");
                Enumeration<String> headerNames = req.getHeaderNames();
                while (headerNames.hasMoreElements()) {
                    String header = headerNames.nextElement();
                    System.out.println(header + ": " + req.getHeader(header));
                }
                System.out.println("Method = " + req.getMethod());// trả về meothd get hoặc post...
                System.out.println("Request URL: " + req.getRequestURL());// trả về URL được request tới
                System.out.println("Requested session ID: " + req.getRequestedSessionId());
                HttpSession session = req.getSession();// lấy về session (sẽ học sau) để thực hiện tác vụ cần thiết
                System.out.println("Địa chỉ truy vấn: " + req.getQueryString());
                //-----------------------------------------------------
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

}
