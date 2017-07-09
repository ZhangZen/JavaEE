/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoLambda;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Zhang
 */
public class DuyetArrayListSuSungLambda {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        list.forEach(t -> {
            System.out.println(t);
        });
//        list.forEach(System.out::println);
    }
}
