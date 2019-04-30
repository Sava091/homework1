package com.epam.training.javajunior.HW3.Task9Chain.concession;

import com.epam.training.javajunior.HW3.Task9Chain.BaseHandler;
import com.epam.training.javajunior.HW3.Task9Chain.Handler;
import com.epam.training.javajunior.HW3.Task9Chain.Payment;

public class ConcessionPaymentTax extends BaseHandler {
    public ConcessionPaymentTax(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Payment payment) {
        System.out.println("Concession withdraw percent from payment");
        System.out.println(payment.getAccount().getBalance() * payment.CONCESSIONTAX);
        super.handle(payment);
    }
}
