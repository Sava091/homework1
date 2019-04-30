package com.epam.training.javajunior.HW3.Task9Chain.concession;

import com.epam.training.javajunior.HW3.Task9Chain.BaseHandler;
import com.epam.training.javajunior.HW3.Task9Chain.Handler;
import com.epam.training.javajunior.HW3.Task9Chain.Payment;

public class ConcessionPaymentControl extends BaseHandler {
    public ConcessionPaymentControl(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Payment payment) {
        System.out.println("Concession Payment is under control now");
        System.out.println(payment.getAccount().getBalance());
        super.handle(payment);
    }
}
