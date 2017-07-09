package DemoSQL_JDBC_02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Zhang
 */
public class DemoINSERT {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String pass = "";
        String driver = "com.mysql.jdbc.Driver";
        //-----------------------------------
        System.out.print("Nhap vao ma sinh vien: ");
        int maSV = new Scanner(System.in).nextInt();
        System.out.print("Nhap vao ten sinh vien: ");
        String tenSV = new Scanner(System.in).nextLine();
        System.out.print("Nhap vao lop cua sinh vien: ");
        String lopSV = new Scanner(System.in).nextLine();
        //----------------------------------------------------
        Connection connection = null;
        Statement statement = null;

        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, pass);
            statement = connection.createStatement();
            String sql = "INSERT INTO `sinhvien` VALUES (" + maSV + ",'" + tenSV + "',  '" + lopSV + "')";
            int soDongBiThayDoi = statement.executeUpdate(sql);
            if (soDongBiThayDoi > 0) {
                System.out.println("Them moi thanh cong");
            } else {
                System.out.println("Them moi that bai");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DemoINSERT.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(DemoINSERT.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(DemoINSERT.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
