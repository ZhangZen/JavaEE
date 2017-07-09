/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author Zhang
 */
public class SinhVien {

    private int maSV;
    private String tenSV;
    private String lopSV;

    public SinhVien() {
    }

    public SinhVien(int maSV, String tenSV, String lopSV) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.lopSV = lopSV;
    }

    public int getMaSV() {
        return maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public String getLopSV() {
        return lopSV;
    }

}
