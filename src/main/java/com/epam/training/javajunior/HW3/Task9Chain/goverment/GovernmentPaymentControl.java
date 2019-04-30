package com.epam.training.javajunior.HW3.Task9Chain.goverment;

import com.epam.training.javajunior.HW3.Task9Chain.BaseHandler;
import com.epam.training.javajunior.HW3.Task9Chain.Handler;
import com.epam.training.javajunior.HW3.Task9Chain.Payment;

public class GovernmentPaymentControl extends BaseHandler {
    public GovernmentPaymentControl(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Payment payment) {
        System.out.println("Government payment is under control now");
        System.out.println(payment.getAccount().getBalance());
        super.handle(payment);
    }
}
