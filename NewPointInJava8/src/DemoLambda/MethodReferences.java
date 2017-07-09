/* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 *
 * @author Zhang
 */
public class MethodReferences {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        list.forEach(MethodReferences::printOddNumbers);// tham chieu den 1 static method
        System.out.println("------------------------------");
        List<String> listString = Arrays.asList("1", "2", "3", "4", "5", "6");
        List<Integer> convertToInteger = convertToInteger(Integer::new, list);// tham chieu den constructor
        convertToInteger.forEach(System.out::println);// tham chieu den 1 instance method cua 1 doi tuong cu the
        System.out.println("------------------------------");
        List<SinhVien> dsSinhVien = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            dsSinhVien.add(new SinhVien(i, "Nguyen Van " + i, "CN" + i));
        }
        List<Integer> allIDs = getAllIDs(dsSinhVien, SinhVien::getMaSV);// tham chieu den 1 instance method cua 1 doi tuong tuy y cua 1 kieu cu the
        System.out.println("Tat ca ma sinh vien co trong danh sach: ");
        allIDs.forEach(System.out::println);
    }

    public static void printOddNumbers(int number) {
        if (number % 2 == 0) {
            System.out.println(number);
        }
    }

    public static <T, R> List<R> convertToInteger(Function<T, R> function, List<T> source) {
        List<R> result = new ArrayList<>();
        for (T t : source) {
            R apply = function.apply(t);
            result.add(apply);
        }
//        source.stream().map((t) -> function.apply(t)).forEachOrdered((apply) -> {
//            result.add(apply);
//        });
        return result;
    }

    public static List<Integer> getAllIDs(List<SinhVien> dsSinhVien, Function<SinhVien, Integer> function) {
        List<Integer> result = new ArrayList<>();
        dsSinhVien.forEach(t -> result.add(function.apply(t)));
        return result;
    }
}
