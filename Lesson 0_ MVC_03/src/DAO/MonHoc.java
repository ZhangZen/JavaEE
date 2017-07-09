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
public class MonHoc {

    private int maMH;
    private String tenMH;
    private int tongSoTiet;

    public MonHoc() {
    }

    public MonHoc(int maMH, String tenMH, int tongSoTiet) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.tongSoTiet = tongSoTiet;
    }

    public int getMaMH() {
        return maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public int getTongSoTiet() {
        return tongSoTiet;
    }

}
