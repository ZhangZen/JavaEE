/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceOfModel;

import java.util.ArrayList;

/**
 *
 * @author Zhang
 */
public interface ISinhVienDAO {

    boolean themMoi(SinhVien sinhVien);

    ArrayList<SinhVien> getAll();

    ArrayList<SinhVien> findByName(String name);

}
