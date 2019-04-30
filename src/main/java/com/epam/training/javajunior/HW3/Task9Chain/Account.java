package com.epam.training.javajunior.HW3.Task9Chain;

public class Account {
    private double balance;
    private String ownerName;

    public Account(double balance, String ownerName) {
        this.balance = balance;
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
