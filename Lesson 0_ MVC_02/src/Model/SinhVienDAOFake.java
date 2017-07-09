/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import InterfaceOfModel.SinhVien;
import InterfaceOfModel.ISinhVienDAO;
import java.util.ArrayList;

/**
 *
 * @author Zhang
 */
public class SinhVienDAOFake implements ISinhVienDAO {
    // khi nguoi lam tang V hoac C can DAO ma nguoi lam tang M chua xong thi co the dung tam class nay de test

    @Override
    public boolean themMoi(SinhVien sinhVien) {

        return true;
    }

    @Override
    public ArrayList<SinhVien> getAll() {
        ArrayList<SinhVien> ds = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ds.add(new SinhVien(i, "Nguyen Van " + i, "CN" + i));
        }
        return ds;
    }

    @Override
    public ArrayList<SinhVien> findByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
