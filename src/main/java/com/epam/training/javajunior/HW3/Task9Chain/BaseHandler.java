package com.epam.training.javajunior.HW3.Task9Chain;

public abstract class BaseHandler implements Handler {
    protected Handler nextHandler;

    public BaseHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(Payment payment) {
        if (nextHandler != null) {
            nextHandler.handle(payment);
        }
    }

    @Override
    public void setNext(Handler next) {
        this.nextHandler = next;
    }
}
