package ru.job4j.ru.job4j.conndition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rls = Math.sqrt(Math.pow((x2 - x1),2))- (Math.pow((y2-y1),2));
        return rls;


    }
    public static void main(String[] args) {
        double result = Point.distance(1, 1 , 7, 1);
        System.out.println("result1  (1, 1) to (7, 1) " + result);
        double result1 = Point.distance(1, 1 , 6, 1);
        System.out.println("result2 (1, 1) to (6, 1) " + result1);
        double result2 = Point.distance(1, 1 , 5, 1);
        System.out.println("result3 (1, 1) to (5, 1) " + result2);
    }
}
