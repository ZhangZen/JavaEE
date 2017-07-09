package DemoLambda;

import java.util.Arrays;
import java.util.Comparator;

public class DemoComparingString {

    public static void main(String[] args) {
        //using normal way to sort the String list (using anonymous inner class)
        String[] data = {"ABC", "Nguyen Van A", "D14CQCN01-B"};
        Comparator<String> numericStringSorter = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                Integer value1 = Integer.valueOf(o1);
                Integer value2 = Integer.valueOf(o2);
                int compare = Integer.compare(value1, value2);
                return compare;
            }
        };
        Arrays.sort(data);
        for (String string : data) {
            System.out.println(string);
        }
        System.out.println("----------------------------------------");
        String[] data1 = {"ABC", "Nguyen Van A", "D14CQCN01-B"};
        String[] sortedList = sortStringList(data);
        for (String string : sortedList) {
            System.out.println(string);
        }
        System.out.println("----------------------------------------");
        //another way to sort (using lambda expression) but using less code than all others manner
        String[] data2 = {"ABC", "Nguyen Van A", "D14CQCN01-B"};
        Arrays.sort(data2, (String o1, String o2) -> {
            return o1.compareTo(o2);
        });
        for (String string : data2) {
            System.out.println(string);
        }
        // more radical :P
        System.out.println("----------------------------------------");
        String[] data3 = {"ABC", "Nguyen Van A", "D14CQCN01-B"};
        Arrays.sort(data3, (o1, o2) -> {
            return o1.compareTo(o2);
        });
        for (String string : data3) {
            System.out.println(string);
        }
    }

    //if you using lambda expression
    private static String[] sortStringList(String[] data) {
        Comparator<String> comparator = (String o1, String o2) -> {
            return o1.compareTo(o2);
        };
        Arrays.sort(data);
        return data;
    }
}
