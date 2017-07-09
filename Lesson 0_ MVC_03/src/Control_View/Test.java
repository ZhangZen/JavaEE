/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control_View;

import DAO.IDAO;
import DAO.SinhVien;
import Model.SinhVienDAO;

/**
 *
 * @author Zhang
 */
public class Test {

    public IDAO<SinhVien> sinhVienDAO = null;

    public void menu() {
        sinhVienDAO = new SinhVienDAO();
//         hoac la sinhVienDAO=new SinhVienDAOFake();
        //...tu code
    }

    public static void main(String[] args) {
        new Test().menu();
    }
}
