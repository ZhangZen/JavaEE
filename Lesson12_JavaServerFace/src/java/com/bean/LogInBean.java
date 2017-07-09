/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;

/**
 *
 * @author Zhang
 */
public class LogInBean {

    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Creates a new instance of LogInBean
     */
    public LogInBean() {
        userName = "Tên đăng nhập";
    }

    public void xuLyLogIn() {// hàm này sẽ làm nhiệm vụ xử lí đăng nhập (giả sử thế) thì tao phải viết ở Bean sau đó kết nối sang trang JSP
        System.out.println(userName);
        System.out.println(password);
        if (userName.equals("admin")) {
            System.out.println("Log in OK");
        }
    }

    public String solveLogIn() {// log in OK sẽ chuyển tới trang LogInOK.jsp, còn không nó sẽ quay về chính trang đăng nhập
        System.out.println(userName);
        System.out.println(password);
        if (userName.equals("admin")) {
            System.out.println("Log in OK");
            return "OK";
        }
        return "notOK";
    }

}
