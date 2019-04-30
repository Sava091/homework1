package com.epam.training.javajunior.HW3.Task9Chain.concession;

import com.epam.training.javajunior.HW3.Task9Chain.BaseHandler;
import com.epam.training.javajunior.HW3.Task9Chain.Handler;
import com.epam.training.javajunior.HW3.Task9Chain.Payment;

public class ConcessionPaymentUpdate extends BaseHandler {
    public ConcessionPaymentUpdate(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Payment payment) {
        System.out.println("Concession Payment is updated");
        payment.getAccount().setBalance(payment.getAccount().getBalance() - payment.getAccount().getBalance() * payment.CONCESSIONTAX);
        System.out.println(payment.getAccount().getBalance());
        super.handle(payment);
    }
}
