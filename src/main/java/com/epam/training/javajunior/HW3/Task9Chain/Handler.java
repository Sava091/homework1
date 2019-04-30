package com.epam.training.javajunior.HW3.Task9Chain;

public interface Handler {
    void handle(Payment payment);
    void setNext(Handler next);
}
