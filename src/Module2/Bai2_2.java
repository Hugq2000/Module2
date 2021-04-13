/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Module2;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Stream;

/**
 * psvm +tab
 pa+crtl+space : ep kieu 
asdasff
 * @author Hung 
 */
public class Bai2_2 {
    public static void main(String[] args) {
        System.out.println("Danh sach 1: ");
        List<Integer> list1 = Arrays.asList(0, 1, 3, 4, 6, 7, 8, 9, 10, 6, 5, 11, 4, 1, 3);
        list1.forEach((element) -> {System.out.println(element);});
        System.out.println("Danh sach 2: ");
        List<Integer> list2 = Arrays.asList(0, 1, 9, 16, 36, 49, 64, 81, 100, 36, 25, 121, 16, 1, 9);
        list2.forEach(System.out::println);
        Integer maxNumber = list2.stream().mapToInt(p -> p).max().getAsInt();
        System.out.println("So lon nhat trong danh sach thu 2: " + maxNumber);
        Integer minNumber = list2.stream().mapToInt(p -> p).min().getAsInt();
        System.out.println("So nho nhat trong danh sach thu 2: " + minNumber);
        
        IntSummaryStatistics stats = list2.stream().mapToInt(p -> p).summaryStatistics();
        System.out.println("Tong cac so danh sach thu 1: " + stats.getSum());
        System.out.println("Trung binh cac so trong danh sach thu 2: " + stats.getAverage());
    }
}
