/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionEvent;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Web application life cycle listener.
 *
 * @author Zhang
 */
public class SessionEvent implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("Co nguoi truy cap trang web");
        ServletContext servletContext = se.getSession().getServletContext();// lay ve application
        se.getSession().setAttribute("abc", se.getSession().getId());// set attribute
        
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("Co nguoi thoat khoi trang web");
    }
}
