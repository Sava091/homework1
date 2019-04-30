package com.epam.training.javajunior.HW3.Task9Chain.internal;

import com.epam.training.javajunior.HW3.Task9Chain.BaseHandler;
import com.epam.training.javajunior.HW3.Task9Chain.Handler;
import com.epam.training.javajunior.HW3.Task9Chain.Payment;

public class InternalPaymentTax extends BaseHandler {
    public InternalPaymentTax(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Payment payment) {
        System.out.println("Internal Withdraw interest from payment");
        System.out.println(payment.getAccount().getBalance() * payment.INTERNALTAX);
        super.handle(payment);
    }
}
