package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double rsl = (a + b + c) / 2;
        return rsl;
    }

    public static double area1(double p, double a, double b, double c) {
        double rsl = Math.sqrt(p * ((p - a) * (p - b) * (p - c)));
        return rsl;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        double rsl1 = TrgArea.area1(rsl, 2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl1);

    }
}
