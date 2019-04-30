package com.epam.training.javajunior.HW3.Task9Chain;

public class Payment {
    public static double TAX = 0.05;
    public static double CONCESSIONTAX = 0.005;
    public static double INTERNALTAX = 0.0;
    private Account account;
    private PaymentType type;

    public Payment(Account account, PaymentType type) {
        this.account = account;
        this.type = type;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public PaymentType getType() {
        return type;
    }

    public void setType(PaymentType type) {
        this.type = type;
    }
}
