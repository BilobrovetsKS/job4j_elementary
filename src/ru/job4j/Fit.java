package ru.job4j;

public class Fit {
    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womenWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }
    public static void main(String[] args) {
        short height = 185;
        double man = Fit.manWeight(height);
System.out.println ("Man 185 is" + man);
        short height1 = 168;
        double woman = Fit.womenWeight(height1);
        System.out.println ("Woman 168 is" + woman);
    }
}