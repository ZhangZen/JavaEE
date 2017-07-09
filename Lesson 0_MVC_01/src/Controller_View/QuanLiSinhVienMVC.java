/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller_View;

import Model.SinhVien;
import Model.SinhVienDAO;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Zhang
 */
public class QuanLiSinhVienMVC {

    int choice = 0;
    SinhVienDAO sinhVienDAO = new SinhVienDAO();

    public void menu() {
        while (true) {
            System.out.println("\t\t\tDEMO QUAN LI SINH VIEN MVC");
            System.out.println("\t1. Lay danh sach sinh vien.");
            System.out.println("\t2. Them moi sinh vien.");
            System.out.println("\t3. Sua thong tin cho sinh vien.");
            System.out.println("\t4. Tim kiem theo ma sinh vien.");
            System.out.println("\t5. Tim kiem theo ten sinh vien.");
            System.out.println("\t6. Xoa sinh vien theo ma.");
            System.out.println("\t7. Thoat chuong trinh.");
            System.out.println("---------------------------------------");
            System.out.print("Chon chuc nang: ");
            do {
                int temp = new Scanner(System.in).nextInt();
                if (temp >= 1 && temp <= 7) {
                    choice = temp;
                    break;
                }
                System.out.print("Chuc nang chon sai, yeu cau chon lai: ");
            } while (true);
            switch (choice) {
                case 1:
                    ArrayList<SinhVien> dsSinhVien = sinhVienDAO.getAll();
                    System.out.println("Danh sach sinh vien co trong co so du lieu: ");
                    dsSinhVien.forEach(t -> {
                        System.out.println(t);
                    });
                    break;
                case 2:
                    System.out.println("Nhap thong tin cho sinh vien can them moi: ");
                    System.out.print("Nhap ma sinh vien: ");
                    int ma = new Scanner(System.in).nextInt();
                    System.out.println("Nhap ten sinh vien: ");
                    String ten = new Scanner(System.in).nextLine();
                    System.out.println("Nhap lop sinh vien: ");
                    String lop = new Scanner(System.in).nextLine();
                    SinhVien sinhVien = new SinhVien(ma, ten, lop);
                    if (sinhVienDAO.insert(sinhVien)) {
                        System.out.println("Them moi thanh cong");
                    } else {
                        System.out.println("Them moi that bai");
                    }
                    break;
                case 3:
                    System.out.println("Nhap thong tin cho sinh vien can sua: ");
                    System.out.print("Nhap ma sinh vien: ");
                    int maSua = new Scanner(System.in).nextInt();
                    System.out.println("Nhap ten sinh vien: ");
                    String tenSua = new Scanner(System.in).nextLine();
                    System.out.println("Nhap lop sinh vien: ");
                    String lopSua = new Scanner(System.in).nextLine();
                    if (sinhVienDAO.update(maSua, tenSua, lopSua)) {
                        System.out.println("Sua thong tin thanh cong");
                    } else {
                        System.out.println("Sua thong tin that bai");
                    }
                    break;
                case 4:
                    System.out.print("Nhap ma sinh vien muon tim: ");
                    int maTK = new Scanner(System.in).nextInt();
                    ArrayList<SinhVien> dsSinhVienTK = sinhVienDAO.findByID(maTK);
                    if (dsSinhVienTK != null) {
                        System.out.println("Sinh vien tim duoc: ");
                        dsSinhVienTK.forEach(t -> {
                            System.out.println(t);
                        });
                    } else {
                        System.out.println("Khong tim thay sinh vien co ma yeu cau.");
                    }
                    break;
                case 5:
                    System.out.print("Nhap ma sinh vien muon tim: ");
                    String tenTK = new Scanner(System.in).nextLine();
                    ArrayList<SinhVien> dsSinhViens = sinhVienDAO.findByName(tenTK);
                    if (dsSinhViens != null) {
                        System.out.println("Sinh vien tim duoc: ");
                        dsSinhViens.forEach(t -> {
                            System.out.println(t);
                        });
                    } else {
                        System.out.println("Khong tim thay sinh vien co ten yeu cau.");
                    }
                    break;
                case 6:
                    System.out.println("Nhap ma sinh vien muon xoa: ");
                    int maSVXoa = new Scanner(System.in).nextInt();
                    if (sinhVienDAO.deleteByID(maSVXoa)) {
                        System.out.println("Xoa thanh cong");
                    } else {
                        System.out.println("Xoa that bai");
                    }
                    break;
                case 7:
                    System.exit(0);
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new QuanLiSinhVienMVC().menu();
    }
}
