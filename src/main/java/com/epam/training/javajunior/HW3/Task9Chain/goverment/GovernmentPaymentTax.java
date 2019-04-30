package com.epam.training.javajunior.HW3.Task9Chain.goverment;

import com.epam.training.javajunior.HW3.Task9Chain.BaseHandler;
import com.epam.training.javajunior.HW3.Task9Chain.Handler;
import com.epam.training.javajunior.HW3.Task9Chain.Payment;

public class GovernmentPaymentTax extends BaseHandler {
    public GovernmentPaymentTax(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Payment payment) {
        System.out.println("Doubled tax for government payment. Cause i don`t like our government");
        System.out.println(payment.getAccount().getBalance() * (payment.TAX * 2));
        super.handle(payment);
    }
}
