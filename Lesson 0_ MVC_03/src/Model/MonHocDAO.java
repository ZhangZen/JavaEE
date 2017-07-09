/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DAO.IDAO;
import DAO.MonHoc;
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
public class MonHocDAO implements IDAO<MonHoc> {

    @Override
    public ArrayList<MonHoc> getAll() {
        ArrayList<MonHoc> dsMonHoc = null;
        Connection connnection = DatabaseConnection.openDatabase();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        if (connnection != null) {
            String sql = "SELECT * FROM `monhoc`";
            try {
                preparedStatement = connnection.prepareStatement(sql);
                resultSet = preparedStatement.executeQuery();
                dsMonHoc = new ArrayList<>();
                while (resultSet.next()) {
//....
                }
            } catch (SQLException ex) {
                Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DatabaseConnection.closeDatabase(resultSet, preparedStatement, connnection);
            }
        }
        return dsMonHoc;
    }

    @Override
    public ArrayList<MonHoc> findByID(int ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<MonHoc> findByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insert(MonHoc t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(MonHoc t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteByID(int ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
