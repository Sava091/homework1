package com.epam.training.javajunior.HW3.Task11Flyweight;

public class Clostridium extends Bacteria {
    public Clostridium(String name, double weight) {
        super(name, weight);
    }

    @Override
    public void move() {
        System.out.println(this.getName() + " Twitching");
    }
}
