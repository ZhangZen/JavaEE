/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

/**
 *
 * @author Zhang
 */
public class MyRequest extends HttpServletRequestWrapper {

    public MyRequest(HttpServletRequest request) {
        super(request);
    }

    @Override
    public String getParameter(String name) {// cai de ham nay de chuyen gia tri cua parameter thanh chu hoa
        String parameter = super.getParameter(name);
        if (parameter != null && name != null && name.contains("ten")) {
            return parameter.toUpperCase();
        }
        return super.getParameter(name); //To change body of generated methods, choose Tools | Templates.
    }
}
