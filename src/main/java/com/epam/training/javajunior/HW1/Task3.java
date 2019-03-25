package com.epam.training.javajunior.HW1;

public class Task3 {
    public static void main(String[] args) {
        char charNumber = 9;
        short positiveShort = 39;
        short negativeShort = -31100;
        int positiveInt = 69;
        int negativeInt = -108;
        long positiveLong = 75389598297L;
        long negativeLong = -985869586368L;

        System.out.println(counterOfBits(charNumber));
        System.out.println(counterOfBits(positiveShort));
        System.out.println(counterOfBits(negativeShort));
        System.out.println(counterOfBits(positiveInt));
        System.out.println(counterOfBits(negativeInt));
        System.out.println(counterOfBits(positiveLong));
        System.out.println(counterOfBits(negativeLong));
    }
    public static int counterOfBits(char value) {
        return countPositiveValueBits(value);
    }

    public static int counterOfBits(short value) {
        int bits = 0;
        if (value < 0) {
            value ^= Short.MIN_VALUE;
            bits++;
        }
        return bits + countPositiveValueBits(value);
    }

    public static int counterOfBits(int value) {
        int bits = 0;
        if (value < 0) {
            value ^= Integer.MIN_VALUE;
            bits++;
        }
        return bits + countPositiveValueBits(value);
    }

    public static int counterOfBits(long value) {
        int bits = 0;
        if (value < 0) {
            value ^= Long.MIN_VALUE;
            bits++;
        }
        return bits + countPositiveValueBits(value);
    }

    private static int countPositiveValueBits(long num) {
        int longBits = 64;
        if (num == 0) {
            return 0;
        }
        for (int i = 1; i <= longBits; i++) {
            if ((num >>= 1) == 0) {
                return i;
            }
        }
        return -1;
    }
}
