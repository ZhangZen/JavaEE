/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author Zhang
 */
public class UsingPredicate {

    public static void main(String[] args) {
        // let's start by using Java before 8
        ArrayList<SinhVien> dsSinhVien = new ArrayList<>();
        dsSinhVien.add(new SinhVien(100, "Bui Ba Truong", "CN1"));
        dsSinhVien.add(new SinhVien(101, "Nguyen Thi Thu Thuy", "CN2"));
        dsSinhVien.add(new SinhVien(102, "Dang Quang The An", "CN1"));
        dsSinhVien.add(new SinhVien(103, "Nguyen Duc Thanh", "AT1"));
        dsSinhVien.add(new SinhVien(104, "Pham Thua Dai", "CN3"));
        // we will do some fillter actions
        // take all student belongs to grade "CN1"
        ArrayList<SinhVien> dsLoc = (ArrayList<SinhVien>) belongToCN1(dsSinhVien);
        System.out.println("ALl students who belong to CN1: ");
        dsLoc.forEach(t -> {
            System.out.println(t);
        });
        System.out.println("-----------------------------");
        // another way we can using Predicate
        System.out.println("Prints all students: ");
        fillterUsingPredicate(dsLoc, t -> true);
        System.out.println("-----------------------------");
        System.out.println("Prints no student: ");
        fillterUsingPredicate(dsLoc, t -> false);
        System.out.println("-----------------------------");
        System.out.println("ALl students belonging to CN1: ");
        fillterUsingPredicate(dsLoc, t -> t.getLop().equals("CN1"));
//        fillterUsingPredicate(dsLoc, new Predicate<SinhVien>() {//using anonymous inner class
//            @Override
//            public boolean test(SinhVien t) {
//                return t.getLop().equals("CN1");
//            }
//        });
        System.out.println("-----------------------------");
        // but we usually use this following way: 
        // maybe this is a best manner to do
        // and it supports for multicore (multiStream)
        dsSinhVien.stream().filter(t -> t.getLop().equals("CN1")).forEach(n -> {
            System.out.println(n);
        });
        System.out.println("----------------------------------------");
        System.out.println("Using map in Stream API: ");
//        List<String> collect = dsSinhVien.stream().map(t->t.getTenSV().toUpperCase()).collect(Collectors.toList());
        dsSinhVien.stream().map(t -> t.getTenSV().toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);
        /*
        Nó có thể chuyển các phần tử trong collection từ loại object này sang 1 loại object khác. 
        Nói cách khác, đối với từng phần tử trong collection bạn sẽ tạo một đối tượng mới dựa trên đó
         */
    }

    private static List<SinhVien> belongToCN1(List<SinhVien> ds) {
        List<SinhVien> list = new ArrayList<>();
        for (SinhVien d : ds) {
            if (d.getLop().equals("CN1")) {
                list.add(d);
            }
        }
        // functional operation-----
//        ds.stream().filter((d) -> (d.getLop().equals("CN1"))).forEachOrdered((d) -> {
//            list.add(d);
//        });
        return list;
    }

    private static void fillterUsingPredicate(List<SinhVien> ds, Predicate<SinhVien> predicate) {
        ds.forEach(t -> {
            if (predicate.test(t)) {
                System.out.println(t);
            }
        });
    }

}
