/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Zhang
 */
public class SinhVienDAO {

    public List<SinhVien> getAll() {
        List<SinhVien> dsSinhVien = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            dsSinhVien.add(new SinhVien(100 + i, "Nguyen Van " + i, "CN" + i));
        }
        return dsSinhVien;
    }
}
