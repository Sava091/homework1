package com.epam.training.javajunior.HW4;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        strings.add("Hello world");
        strings.add("Hello Internet");
        strings.add("Hello java");

        strings.stream()
                .map(String::toUpperCase)
                .sorted(String::compareTo)
                .forEach(System.out::println);
    }
}


