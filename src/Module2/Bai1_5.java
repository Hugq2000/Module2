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
@FunctionalInterface
interface sortArray{
    void sortArrayy();
}

public class Bai1_5 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(new String[]{"aa", "cc", "bb", "ee", "qq", "yy", "ii"});
        list.sort((p1, p2) -> p1.compareTo(p2));
        list.forEach(System.out::println);
    }
}
