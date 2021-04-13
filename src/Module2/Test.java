/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Module2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * psvm +tab
 pa+crtl+space : ep kieu 
asdasff
 * @author Hung 
 */
@FunctionalInterface
interface Drawable{
    public void Draw();
}
interface Drawable1{
    public String Draw1();
}
interface Drawable2{
    public String Draw2(String a);
}
interface Drawable3{
    public int Draw3(int a, int b);
}
public class Test {
    public static void main(String[] args) {
        Drawable d = () -> {System.out.println("Demo lambda");};
        d.Draw();
        //Lambda ko tham so
        Drawable1 a = () -> {return "Demo lambda khong tham so";};
        System.out.println(a.Draw1());
        //Lambda 1 tham so duy nhat
        Drawable2 c = (word) -> {return word;};
        System.out.println(c.Draw2("Meow meow!"));
        //Lambda nhiu tham so
        Drawable3 p = (o1, o2) -> {return o1 + o2;};
        System.out.println("a + b = " + p.Draw3(13, 15));
        //Lambda su dung return hay ko return 
        Drawable3 q = (o1, o2) -> (o1 + o2);
        System.out.println("c + d = " + q.Draw3(1, 1));
        //Lambda su dung for each
        List<String> list = Arrays.asList("a", "b", "c");
        list.forEach((element) -> {System.out.println(element);});
        //Lambda voi thread
        Runnable r1 = new Runnable(){
            public void run(){
                System.out.println("Thread 1 is running...");
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();
        
        Runnable r2 = () -> {System.out.println("Thread 2 is running...");};
        Thread t2 = new Thread(r2);
        t2.start();
        //Lambda voi comparator 
        List<String> list1 = Arrays.asList("c", "h", "a");
        list1.sort((S1, S2) -> S1.compareTo(S2));
        list1.forEach(System.out::println);
        //Lambda voi Filter collection
         List<Integer> list2 = Arrays.asList(0, 2, 3, 5, 6, 8, 4);
         Stream<Integer> filter_Data = list2.stream().filter(p1 -> p1 > 5);
         filter_Data.forEach((element) -> {System.out.println(element);});
    }
}
