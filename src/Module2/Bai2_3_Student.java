/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module2;

/**
 * psvm +tab pa+crtl+space : ep kieu asdasff
 *
 * @author Hung
 */
public class Bai2_3_Student {

    private String name;
    private int age;
    private double mark1;
    private double mark2;
    private double average;

    public Bai2_3_Student() {
    }

    public Bai2_3_Student(String name, int age, double mark1, double mark2) {
        this.name = name;
        this.age = age;
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMark1() {
        return mark1;
    }

    public void setMark1(double mark1) {
        this.mark1 = mark1;
    }

    public double getMark2() {
        return mark2;
    }

    public void setMark2(double mark2) {
        this.mark2 = mark2;
    }

    public double getAverage() {
        return (mark1 + mark2) / 2;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return String.format("%-15s%15s%15s%15s%15s", name, age, mark1, mark2, getAverage());
    }
    
}
