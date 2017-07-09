/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoLambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Zhang
 */
public class DemoSortCollections {

    public static void main(String[] args) {
        List<SinhVien> dsSinhVien = Arrays.asList(new SinhVien(100, "Nguyen Van A", "D14CN1"),
                new SinhVien(102, "Do Quoc Dung", "VT6"),
                new SinhVien(103, "Bui Ba Truong", "CN1"));
        Collections.sort(dsSinhVien, ((SinhVien o1, SinhVien o2) -> o1.getTenSV().compareTo(o2.getTenSV())));
        dsSinhVien.forEach(t -> {
            System.out.println(t);
        });
//        Runnable runnable=()->System.out.println("1111");
    }
}
