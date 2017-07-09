/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DAO.IDAO;
import DAO.SinhVien;
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
public class SinhVienDAO implements IDAO<SinhVien> {

    @Override
    public ArrayList<SinhVien> getAll() {
        ArrayList<SinhVien> dsSinhVien = null;
        Connection connnection = DatabaseConnection.openDatabase();
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
                DatabaseConnection.closeDatabase(resultSet, preparedStatement, connnection);
            }
        }
        return dsSinhVien;
    }

    @Override
    public ArrayList<SinhVien> findByID(int ID) {
        ArrayList<SinhVien> dsSinhVien = null;
        Connection connnection = DatabaseConnection.openDatabase();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        if (connnection != null) {
            String sql = "SELECT * FROM `sinhvien` WHERE ID = ?";
            try {
                preparedStatement = connnection.prepareStatement(sql);
                preparedStatement.setInt(1, ID);
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
                DatabaseConnection.closeDatabase(resultSet, preparedStatement, connnection);
            }
        }
        return dsSinhVien;
    }

    @Override
    public ArrayList<SinhVien> findByName(String name) {
        ArrayList<SinhVien> dsSinhVien = null;
        Connection connnection = DatabaseConnection.openDatabase();
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
                DatabaseConnection.closeDatabase(resultSet, preparedStatement, connnection);
            }
        }
        return dsSinhVien;
    }

    @Override
    public boolean insert(SinhVien sinhVien) {
        Connection connection = DatabaseConnection.openDatabase();
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
            } finally {
                DatabaseConnection.closeDatabase(null, preparedStatement, connection);
            }
        }
        return false;
    }

    @Override
    public boolean update(SinhVien t) {
        Connection connection = DatabaseConnection.openDatabase();
        PreparedStatement preparedStatement = null;
        while (connection != null) {
            String sql = "UPDATE `sinhvien` SET `Name` = ?,`Class` = ? WHERE ID = ?";
            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, t.getTenSV());
                preparedStatement.setString(2, t.getLopSV());
                preparedStatement.setInt(3, t.getMaSV());
                int changedRows = preparedStatement.executeUpdate();
                if (changedRows > 0) {
                    return true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DatabaseConnection.closeDatabase(null, preparedStatement, connection);
            }
        }
        return false;
    }

    @Override
    public boolean deleteByID(int ID) {
        Connection connnection = DatabaseConnection.openDatabase();
        PreparedStatement preparedStatement = null;
        if (connnection != null) {
            String sql = "DELETE FROM `sinhvien` WHERE ID = ? ";
            try {
                preparedStatement = connnection.prepareStatement(sql);
                preparedStatement.setInt(1, ID);
                int changedRows = preparedStatement.executeUpdate();
                if (changedRows > 0) {
                    return true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DatabaseConnection.closeDatabase(null, preparedStatement, connnection);
            }
        }
        return false;
    }

    @Override
    public boolean deleteAll() {
        Connection connnection = DatabaseConnection.openDatabase();
        PreparedStatement preparedStatement = null;
        if (connnection != null) {
            String sql = "DELETE FROM `sinhvien`";
            try {
                preparedStatement = connnection.prepareStatement(sql);
                int changedRows = preparedStatement.executeUpdate();
                if (changedRows > 0) {
                    return true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DatabaseConnection.closeDatabase(null, preparedStatement, connnection);
            }
        }
        return false;
    }

}
