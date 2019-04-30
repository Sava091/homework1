package com.epam.training.javajunior.HW3.Task2Composite;

public abstract class AriphmethicStatement implements Statement {
    private Statement operand1;
    private Statement operand2;

    public AriphmethicStatement(Statement operand1, Statement operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public Statement getOperand1() {
        return operand1;
    }

    public Statement getOperand2() {
        return operand2;
    }
}
