package com.epam.training.javajunior.HW3.Task9Chain;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(2000, "Grygorovych");
        Payment payment = new Payment(account, PaymentType.CONCESSION);
        HandlerFactory handlerFactory = new HandlerFactory();
        Handler commonHandler = handlerFactory.createHandler(payment);
        commonHandler.handle(payment);
    }
}
