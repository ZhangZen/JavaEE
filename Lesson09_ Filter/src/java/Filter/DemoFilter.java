/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Zhang
 */
public class DemoFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // khoi tao cac parameters
        System.out.println("Khoi tao parameters.....");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Co gang vuot qua filter...");
        HttpServletRequest servletRequest = (HttpServletRequest) request;
//        Object attribute = servletRequest.getSession().getAttribute("admin"); ==> vi du ve viec kiem tra xem admin da dang nhap chua: 
//                                                                              lay ve attribute de kiem tra xem acc da log in chua
//        chain.doFilter(request, response);// cho request vuot qua filter
//        String parameter = request.getParameter("ten");
        // Demo voi class MyRequest
        MyRequest myRequest = new MyRequest(servletRequest);
        chain.doFilter(myRequest, response);
        System.out.println("Da vuot qua filter!");
    }

    @Override
    public void destroy() {
        System.out.println("Ket thuc filter......");
    }
}
