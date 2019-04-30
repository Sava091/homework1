package com.epam.training.javajunior.HW3.Task2Composite;

public class AriphmethicValue implements Statement {
    private double value;

    public AriphmethicValue(double value) {
        this.value = value;
    }

    public double calculate() {
        return value;
    }
}
