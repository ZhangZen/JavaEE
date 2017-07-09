/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoSQL_JDBC_Basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zhang
 */
public class DemoSELECT {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String pass = "";
        String driver = "com.mysql.jdbc.Driver";
        Connection connection = null;
        Statement statement = null;
        ResultSet executeQuery = null;
        ArrayList<SinhVien> dsSinhVien = null;
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, pass);
            statement = connection.createStatement();
            String sql = "SELECT * FROM `sinhvien`";
            executeQuery = statement.executeQuery(sql);
            dsSinhVien = new ArrayList<>();
            while (executeQuery.next()) {
                int maSV = executeQuery.getInt(1);
                String tenSV = executeQuery.getString("Name");
                String lop = executeQuery.getString("Class");
                SinhVien sinhVien = new SinhVien(maSV, tenSV, lop);
                dsSinhVien.add(sinhVien);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DemoSELECT.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            executeQuery.close();
            statement.close();
            connection.close();
        }
        //----------------------------
        dsSinhVien.forEach(t -> {
            System.out.println(t);
        });
    }
}
