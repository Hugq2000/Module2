/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;

/**
 * psvm +tab pa+crtl+space : ep kieu asdasff
 *
 * @author Hung
 */
public class Bai2_3 {

    public static void main(String[] args) {
        List<Bai2_3_Student> list = new ArrayList<Bai2_3_Student>();
        Bai2_3_Student a = new Bai2_3_Student("Hùng", 10, 5.6, 8.8);
        Bai2_3_Student b = new Bai2_3_Student("Duyên", 18, 10, 8.8);
        Bai2_3_Student c = new Bai2_3_Student("Nam", 16, 5.6, 9);
        Bai2_3_Student d = new Bai2_3_Student("Huy", 17, 6, 8);
        Bai2_3_Student e = new Bai2_3_Student("Quỳnh", 19, 6.5, 7);
        Bai2_3_Student f = new Bai2_3_Student("Tùng", 10, 1, 2);
        Bai2_3_Student g = new Bai2_3_Student("Việt", 19, 5, 8);
        Bai2_3_Student h = new Bai2_3_Student("Nhung", 20, 7, 8);
        Bai2_3_Student i = new Bai2_3_Student("Ly", 16, 5, 3);
        Bai2_3_Student j = new Bai2_3_Student("Rose", 17, 9, 9);
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        list.add(f);
        list.add(g);
        list.add(h);
        list.add(i);
        list.add(j);
        for (Bai2_3_Student p : list) {
            System.out.println(p.toString());
        }
        long q = list.stream().filter(element -> element.getAge() >= 18).count();
        System.out.println("Số học sinh có tuổi lớn hơn 18: " + q);

        long p = list.stream().filter(element -> element.getName().matches("^h")).count(); // ????
        System.out.println("Số học sinh có tên bắt đầu bằng H: " + p);
        
        Bai2_3_Student maxAvg = list.stream().max(Comparator.comparing(Bai2_3_Student :: getAverage)).get();
        System.out.println("Điểm trung bình lớn nhất: " + maxAvg);
        
        Bai2_3_Student minAvg = list.stream().min(Comparator.comparing(Bai2_3_Student :: getAverage)).get();
        System.out.println("Điểm trung binh nhỏ nhất: " + minAvg);
        
       
    }
}
