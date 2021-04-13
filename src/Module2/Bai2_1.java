/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Module2;

import java.util.Arrays;
import java.util.List;

/**
 * psvm +tab
 pa+crtl+space : ep kieu 
asdasff
 * @author Hung 
 */
public class Bai2_1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aa", "", "cccccc", "bb", "happy", "ww", "happy", "oooooooo", "ee", "", "dd", "ff", "", "", "rrrrrrr");
        list.forEach(System.out::println);
        long count = list.stream().filter(element -> element.equals("")).count();
        long count1 = list.stream().filter(element -> element.length() > 5).count();
        long count2 = list.stream().filter(element -> element.matches(".*[a]")).count();
        long count3 = list.stream().filter(element -> element.equals("happy")).count();
        System.out.println("Count = " + count);
        System.out.println("Count1 = " + count1);
        System.out.println("Count2 = " + count2);
        System.out.println("Count3 = " + count3);
    }
}
