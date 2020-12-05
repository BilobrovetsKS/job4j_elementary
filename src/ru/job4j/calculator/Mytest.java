package ru.job4j.calculator;

public class Mytest {
    public static void main(String[] args) {
        int a = 8;
        int b = 9;
        int c = 7;
        if (a > b) {
            if (a > c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else {
            if (b > c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }
    }
}