package com.epam.training.javajunior.HW3.Task9Chain.internal;

import com.epam.training.javajunior.HW3.Task9Chain.BaseHandler;
import com.epam.training.javajunior.HW3.Task9Chain.Handler;
import com.epam.training.javajunior.HW3.Task9Chain.Payment;

public class InternalPaymentControl extends BaseHandler {
    public InternalPaymentControl(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Payment payment) {
        System.out.println("Internal Payment is under control now");
        System.out.println(payment.getAccount().getBalance());
        super.handle(payment);
    }
}
