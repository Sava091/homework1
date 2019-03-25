package com.epam.training.javajunior.HW1;

public class Task2 {
    public static void main(String[] args) {
        int positiveInt = 37;
        int negativeInt = -92;

        System.out.println(changeSign(positiveInt));
        System.out.println(changeSign(negativeInt));
    }
    public static int changeSign(int variable) {
        return (~variable) + 1;
    }
}
