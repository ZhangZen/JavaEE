/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoSQL_JDBC_Basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zhang
 */
public class DemoINSERT {

    /*
        - b1: Load driver len bo nho va tao ket noi
        - b2: tao doi tuong thuc thi
        - b3: Viet cau lenh SQL, xu li ket qua tra ve
        - b4: Dong ket noi
     */
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String pass = "";
        String driver = "com.mysql.jdbc.Driver";
        Connection connection = null;
        Statement createStatement = null;
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, pass);
            createStatement = connection.createStatement();
            String sql = "INSERT INTO `sinhvien` (`ID`, `Name`, `Class`) VALUES (107, 'Nguyen Van AAAA', 'CN5')";
            int soDongBiThayDoi = createStatement.executeUpdate(sql);
            if (soDongBiThayDoi > 0) {
                System.out.println("Insert thanh cong");
            } else {
                System.out.println("Insert that bai");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DemoINSERT.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                createStatement.close();
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
