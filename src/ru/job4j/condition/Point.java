package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2)) - (Math.pow((y2 - y1), 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(1, 1, 7, 1);
        System.out.println("result1  (1, 1) to (7, 1) " + result);
        double result1 = Point.distance(1, 1, 7, 1);
        System.out.println("result2  (1, 1) to (7, 1) " + result1);
    }
}

