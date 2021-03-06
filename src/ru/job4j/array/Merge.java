package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0, j = 0, y = 0;
        while (i + j < rsl.length) {
            if (i < left.length && j < right.length) {
                rsl[y++] = left[i] < right[j] ? left[i++] : right[j++];
            } else if (i < left.length) {
                rsl[y++] = left[i++];
            } else {
                rsl[y++] = right[j++];
            }
        }
        return rsl;
    }
}