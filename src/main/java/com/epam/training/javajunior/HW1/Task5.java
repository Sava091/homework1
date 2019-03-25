package com.epam.training.javajunior.HW1;

public class Task5 {
    public static void main(String[] args) {
        int number = 7;
        int position = 2;
        System.out.println(Integer.toBinaryString(number));
        System.out.println(Integer.toBinaryString(inverse(number, position)));
    }

    private static int inverse(int number, int position) {
        int mask = 1;
        mask <<= position - 1;
        return number^mask;
    }
}
