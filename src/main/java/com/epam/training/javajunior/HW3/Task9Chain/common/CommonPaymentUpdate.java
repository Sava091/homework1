package com.epam.training.javajunior.HW3.Task9Chain.common;

import com.epam.training.javajunior.HW3.Task9Chain.BaseHandler;
import com.epam.training.javajunior.HW3.Task9Chain.Handler;
import com.epam.training.javajunior.HW3.Task9Chain.Payment;

public class CommonPaymentUpdate extends BaseHandler {
    public CommonPaymentUpdate(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Payment payment) {
        System.out.println("Common Payment is updated");
        payment.getAccount().setBalance(payment.getAccount().getBalance() - payment.getAccount().getBalance() * payment.TAX);
        System.out.println(payment.getAccount().getBalance());
        super.handle(payment);
    }
}
