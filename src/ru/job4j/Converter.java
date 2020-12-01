package ru.job4j;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int euroToRuble(int value) {
        int rsl = value * 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static int dollarToRuble(int value) {
        int rsl = value * 60;
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 test : " + passed);
        int dollar = Converter.rubleToDollar(180);
            System.out.println("180 rubles are " + dollar + " dollar.");
        int in1 = 180;
        int expected1 = 3;
        int out1 = Converter.rubleToDollar(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("180 rubles are 3 test : " + passed1);
        int ruble = Converter.euroToRuble(2);
        System.out.println("2 euro are " + ruble + " ruble.");
        int in2 = 2;
        int expected2 = 140;
        int out2 = Converter.euroToRuble(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("2 euro are 140 test: " + passed2);
        int ruble1 = Converter.dollarToRuble(2);
        System.out.println("2 dollar are " + ruble1 + " ruble.");
        int in3 = 2;
        int expected3 = 120;
        int out3 = Converter.dollarToRuble(in3);
        boolean passed3 = expected3 == out3;
        System.out.println("2 dollars are 120 test: " + passed3);
        }
    }