package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;
                for (int i = index; i < array.length; i++) {
                    if (array[i] != null) {
                        String point1 = array[index];
                        array[index] = array[i];
                        array[i] = point1;
                        break;
                    }
                }
                System.out.print(array[index] + " ");
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
