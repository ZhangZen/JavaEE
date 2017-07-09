/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionEvent;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Web application lifecycle listener.
 *
 * @author Zhang
 */
public class SessionListener implements HttpSessionListener {

    List<String> count = new ArrayList<>();

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        HttpSession session = se.getSession();
        count.add(session.getId());
        session.setAttribute("counter", this);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        HttpSession session = se.getSession();
        count.remove(session.getId());
        session.setAttribute("counter", this);
    }

    public int getActiveSessionNumber() {
        return count.size();
    }
}
