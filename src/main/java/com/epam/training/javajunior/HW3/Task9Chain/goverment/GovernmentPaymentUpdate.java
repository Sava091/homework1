package com.epam.training.javajunior.HW3.Task9Chain.goverment;

import com.epam.training.javajunior.HW3.Task9Chain.BaseHandler;
import com.epam.training.javajunior.HW3.Task9Chain.Handler;
import com.epam.training.javajunior.HW3.Task9Chain.Payment;

public class GovernmentPaymentUpdate extends BaseHandler {
    public GovernmentPaymentUpdate(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Payment payment) {
        System.out.println("Government Payment is updated");
        payment.getAccount().setBalance(payment.getAccount().getBalance() - payment.getAccount().getBalance() * (payment.TAX * 2));
        System.out.println(payment.getAccount().getBalance());
        super.handle(payment);
    }
}
