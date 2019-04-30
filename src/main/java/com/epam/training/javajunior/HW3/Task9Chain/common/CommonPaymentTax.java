package com.epam.training.javajunior.HW3.Task9Chain.common;

import com.epam.training.javajunior.HW3.Task9Chain.BaseHandler;
import com.epam.training.javajunior.HW3.Task9Chain.Handler;
import com.epam.training.javajunior.HW3.Task9Chain.Payment;

public class CommonPaymentTax extends BaseHandler {
    public CommonPaymentTax(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Payment payment) {
        System.out.println("Common Withdraw percent from payment");
        System.out.println(payment.getAccount().getBalance() * payment.TAX);
        super.handle(payment);
    }
}
