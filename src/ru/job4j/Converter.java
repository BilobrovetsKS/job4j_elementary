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
            int dollar = Converter.rubleToDollar(140);
            System.out.println("140 rubles are " + dollar + " dollar.");
        int ruble = Converter.euroToRuble(2);
        System.out.println("2 euro are " + ruble + " ruble.");
        int ruble1 = Converter.dollarToRuble(2);
        System.out.println("2 dollar are " + ruble1 + " ruble.");
        }
    }