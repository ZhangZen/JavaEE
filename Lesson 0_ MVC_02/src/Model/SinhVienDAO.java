/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import InterfaceOfModel.SinhVien;
import InterfaceOfModel.ISinhVienDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zhang
 */
public class SinhVienDAO implements ISinhVienDAO {// la DAO hoan chinh do nguoi lam tang M phu trach

    @Override
    public boolean themMoi(SinhVien sinhVien) {
        Connection connection = OpenCloseDatabase.openDatabase();
        PreparedStatement preparedStatement = null;
        if (connection != null) {
            String sql = "INSERT INTO `sinhvien` VALUES (?, ? , ?)";
            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, sinhVien.getMaSV());
                preparedStatement.setString(2, sinhVien.getTenSV());
                preparedStatement.setString(3, sinhVien.getLopSV());
                int changedRows = preparedStatement.executeUpdate();
                if (changedRows > 0) {
                    return true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    @Override
    public ArrayList<SinhVien> getAll() {
        ArrayList<SinhVien> dsSinhVien = null;
        Connection connnection = OpenCloseDatabase.openDatabase();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        if (connnection != null) {
            String sql = "SELECT * FROM `sinhvien`";
            try {
                preparedStatement = connnection.prepareStatement(sql);
                resultSet = preparedStatement.executeQuery();
                dsSinhVien = new ArrayList<>();
                while (resultSet.next()) {
                    int maSV = resultSet.getInt(1);
                    String tenSV = resultSet.getString(2);
                    String lop = resultSet.getString(3);
                    SinhVien sinhVien = new SinhVien(maSV, tenSV, lop);
                    dsSinhVien.add(sinhVien);
                }
            } catch (SQLException ex) {
                Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                OpenCloseDatabase.closeDatabase(resultSet, preparedStatement, connnection);
            }
        }
        return dsSinhVien;
    }

    @Override
    public ArrayList<SinhVien> findByName(String name) {
        ArrayList<SinhVien> dsSinhVien = null;
        Connection connnection = OpenCloseDatabase.openDatabase();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        if (connnection != null) {
            String sql = "SELECT * FROM `sinhvien` WHERE Name LIKE ?";
            try {
                preparedStatement = connnection.prepareStatement(sql);
                preparedStatement.setString(1, "%" + name + "%");
                resultSet = preparedStatement.executeQuery();
                dsSinhVien = new ArrayList<>();
                while (resultSet.next()) {
                    int maSV = resultSet.getInt(1);
                    String tenSV = resultSet.getString(2);
                    String lopSV = resultSet.getString(3);
                    SinhVien sinhVien = new SinhVien(maSV, tenSV, lopSV);
                    dsSinhVien.add(sinhVien);
                }
            } catch (SQLException ex) {
                Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                OpenCloseDatabase.closeDatabase(resultSet, preparedStatement, connnection);
            }
        }
        return dsSinhVien;
    }
}
