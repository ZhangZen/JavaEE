/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Zhang
 */
public class SinhVien {

    private int maSV;
    private String tenSV;
    private String lop;

    public SinhVien() {
    }

    public SinhVien(int maSV, String tenSV, String lop) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.lop = lop;
    }

    public int getMaSV() {
        return maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public String getLop() {
        return lop;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSV=" + maSV + ", tenSV=" + tenSV + ", lop=" + lop + '}';
    }

}
