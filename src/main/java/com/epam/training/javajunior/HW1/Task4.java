package com.epam.training.javajunior.HW1;

public class Task4 {
    public static void main(String[] args) {
        int a = 5; // 1071
        int b = 10; // 462
        int result = nod(a, b);
        System.out.println(result);
    }
    public static int nod(int first, int second) {
        if (first == 0)
            return second;
        if (second == 0)
            return first;
        if (first == second)
            return first;
        if (first == 1 || second == 1)
            return 1;

        int counter;
        for (counter = 0; ((first | second) & 1) == 0; counter++) {
            first >>= 1;
            second >>= 1;
        }
        do {
            while ((first & 1) == 0) {
                first >>= 1;
            }
            while ((second & 1) == 0) {
                second >>= 1;
            }
            if (first > second) {
                first -= second;
            } else {
                second -= first;
            }
        } while (first != 0 && second != 0);
        return first == 0 ? second << counter : first << counter;
    }
}

