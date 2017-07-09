/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Zhang
 */
public class SolveLogIn extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // lay thong tin cua admin
        String rootUser = getInitParameter("rootUser");
        String rootPass = getInitParameter("rootPassword");
        // lay thong tin dang nhap tu web
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");
        // kiem tra tinh dung dan cua du lieu
//        // Cach 1: don gian, nhung ton tai nguyen do client gui request 2 lan toi server
//        if (userName == null || userName.trim().isEmpty()) {
//            resp.sendRedirect("LogInForm.jsp?emptyUserName=1");
//        }
//        if (password == null || password.trim().isEmpty()) {
//            resp.sendRedirect("LogInForm.jsp?emptyPassword=1");
//        }
        // Cach 2: thuong duoc dung, client gui request 1 lan toi server
        if (userName == null || userName.trim().isEmpty()) {
            req.setAttribute("emptyUserName", "Empty user name!");// gui thong diep chua dien ten dang nhap
            req.getRequestDispatcher("LogInForm.jsp").forward(req, resp);// chuyen trang sang logInForm
        }
        if (password == null || password.trim().isEmpty()) {
            req.setAttribute("emptyPassword", "Empty password!");// gui thong diep chua dien ten dang nhap
            req.getRequestDispatcher("LogInForm.jsp").forward(req, resp);// chuyen trang sang logInForm
        }
        //--------------------------------
        if (userName.equals(rootUser) && password.equals(rootPass)) {
            resp.sendRedirect("DSSinhVien.jsp");
        } else {
//            if (!userName.equals(rootUser) || !password.equals(rootPass)) {
//                req.setAttribute("notAdmin", "You're not admin!");// gui thong diep chua dien ten dang nhap
//                req.getRequestDispatcher("LogInForm.jsp").forward(req, resp);// chuyen trang sang logInForm
//                return;
//            }
            PrintWriter writer = resp.getWriter();
            writer.print("Welcome " + userName);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("LogInForm.jsp");
    }

}
