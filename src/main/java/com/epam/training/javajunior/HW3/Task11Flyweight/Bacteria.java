package com.epam.training.javajunior.HW3.Task11Flyweight;

public class Bacteria {
    private String name;
    private double weight;

    public Bacteria(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public void move() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Bacteria{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
