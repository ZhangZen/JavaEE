/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoSQL_JDBC_02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zhang
 */
public class SELECT_Using_PreparedStatement {

    public static void main(String[] args) {
        System.out.print("Nhap vao tu khoa muon tim kiem: ");
        String tuKhoa = new Scanner(System.in).nextLine();
        //----------------------------
        String url = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String pass = "";
        String driver = "com.mysql.jdbc.Driver";
        //
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        ArrayList<SinhVien> dsSinhVien = null;
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, pass);
            String sql = "SELECT * FROM `sinhvien` WHERE Name LIKE ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "%" + tuKhoa + "%");
            resultSet = preparedStatement.executeQuery();
            dsSinhVien = new ArrayList<>();
            while (resultSet.next()) {
                int maSV = resultSet.getInt(1);
                String ten = resultSet.getString(2);
                String lop = resultSet.getString(3);
                SinhVien sinhVien = new SinhVien(maSV, ten, lop);
                dsSinhVien.add(sinhVien);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SELECT_Using_PreparedStatement.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                resultSet.close();
            } catch (SQLException ex) {
                Logger.getLogger(SELECT_Using_PreparedStatement.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                preparedStatement.close();
            } catch (SQLException ex) {
                Logger.getLogger(SELECT_Using_PreparedStatement.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(SELECT_Using_PreparedStatement.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //
        dsSinhVien.forEach(t -> {
            System.out.println(t);
        });
    }
}
