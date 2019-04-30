package com.epam.training.javajunior.HW3.Task2Composite;

public class DivOperation extends AriphmethicStatement {
    public DivOperation(Statement operand1, Statement operand2) {
        super(operand1, operand2);
    }

    @Override
    public double calculate() {
        return getOperand1().calculate() / getOperand2().calculate();
    }
}
