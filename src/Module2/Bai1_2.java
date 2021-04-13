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
public class Bai1_2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(new Integer[]{2, 3, 4, 5, 6, 7});
        int donGia = 2000;
        list.forEach(element -> {System.out.println("Thanh tien " + donGia * element + " vnd");});
    }
}
