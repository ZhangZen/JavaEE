/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zhang
 */
public class OpenCloseDatabase {

    public static String url = "jdbc:mysql://localhost:3306/student";
    public static String user = "root";
    public static String pass = "";
    public static String driver = "com.mysql.jdbc.Driver";

    public static Connection openDatabase() {
        Connection connection = null;
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(OpenCloseDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }

    public static void closeDatabase(ResultSet resultSet, PreparedStatement preparedStatement, Connection connection) {
        try {
            if (resultSet != null && !resultSet.isClosed()) {
                resultSet.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(OpenCloseDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(OpenCloseDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(OpenCloseDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
