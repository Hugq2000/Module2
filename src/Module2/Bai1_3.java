/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * psvm +tab pa+crtl+space : ep kieu asdasff
 *
 * @author Hung
 */
public class Bai1_3 implements Bai1_3_Interface {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Nhap ban kinh = ");
        double r = Double.parseDouble(input.readLine());
        Bai1_3_Interface circle = (Double x1, Double x2) -> x1 * Math.pow(x2, 2);
        System.out.println("S = PI * (r*r) = " + circle.calArea(Math.PI, r));
        System.out.print("Nhap chieu dai = ");
        double H = Double.parseDouble(input.readLine());
        System.out.println("Nhap chieu rong = ");
        double W = Double.parseDouble(input.readLine());
        Bai1_3_Interface rectangle = (Double x1, Double x2) -> x1 * x2;
        System.out.println("S = H * W " + rectangle.calArea(W, H));
    }

    @Override
    public double calArea(Double x1, Double x2) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
