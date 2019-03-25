package com.epam.training.javajunior.HW1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter binary number: ");
        String stringNumber = new Scanner(System.in).nextLine();

        //Method 1 (chars)
        char[] chars = stringNumber.toCharArray();
        int charResult = 0;
        for (int i = chars.length -1; i >= 0 ; i--) {
            if (chars[i] == '1') {
                charResult += Math.pow(2, (chars.length - 1) - i);
            }
        }
        System.out.println(stringNumber + " -> " + charResult);

        //Method 2 (%)
        int intNumb = Integer.parseInt(stringNumber);
        int intResult = 0;
        for (int i = 0; intNumb > 0; intNumb /= 10, i++) {
            int last = intNumb % 10;
            if (last == 1) {
                intResult += Math.pow(2, i);
            }
        }
        System.out.println(stringNumber + " -> " + intResult);

        //Method 3 (simple)
        int number = Integer.parseInt(stringNumber, 2);
        System.out.println(stringNumber + " -> " + number);
    }
}
