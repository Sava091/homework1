package com.epam.training.javajunior.HW3.Task11Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EurobacterialsFactory factory = new EurobacterialsFactory();
        List<Bacteria> colony = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            BacteriaType type = BacteriaType.values()[(int) (Math.random() * BacteriaType.values().length)];
            Bacteria bacteria = factory.createBacteris(type);
            colony.add(bacteria);
            bacteria.move();
        }
        System.out.println(colony);
    }
}
