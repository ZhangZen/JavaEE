/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoSQL_JDBC_02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zhang
 */
public class Demo_INSERT_Using_PreparedStatement {

    public static void main(String[] args) {
        System.out.print("Nhap ma sinh vien: ");
        int maSV = new Scanner(System.in).nextInt();
        System.out.print("Nhap ten cua sinh vien: ");
        String tenSV = new Scanner(System.in).nextLine();
        System.out.print("Nhap lop cua sinh vien: ");
        String lopSV = new Scanner(System.in).nextLine();
        //---------------------------------------
        String url = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String pass = "";
        String driver = "com.mysql.jdbc.Driver";
        //
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, pass);
            String sql = "INSERT INTO `sinhvien` VALUES (" + maSV + ",'" + tenSV + "',  '" + lopSV + "')";
            preparedStatement = connection.prepareStatement(sql);
            int soDongBiThayDoi = preparedStatement.executeUpdate();
            if (soDongBiThayDoi > 0) {
                System.out.println("Insert thanh cong");
            } else {
                System.out.println("Insert that bai");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Demo_INSERT_Using_PreparedStatement.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException ex) {
                Logger.getLogger(Demo_INSERT_Using_PreparedStatement.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(Demo_INSERT_Using_PreparedStatement.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
