package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double rls = p / (2 * (k + 1));
        return rls;
    }
    public static double square1(int h, int k) {
        double rls = h * k;
        return rls;
    }
    public static double square2(int L, int h) {
        double rls = L * h;
        return rls;
    }
     public static void main(String[] args) {
        double result1 = SqArea.square(6,2);
        double result2 = SqArea.square1((int) result1, 2);
         double result3 = SqArea.square1((int) result1, (int) result2);
        System.out.println("p=6, k=2, s=2, real =" + result3);
    }
}
