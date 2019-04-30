package com.epam.training.javajunior.HW3.Task9Chain.common;

import com.epam.training.javajunior.HW3.Task9Chain.BaseHandler;
import com.epam.training.javajunior.HW3.Task9Chain.Handler;
import com.epam.training.javajunior.HW3.Task9Chain.Payment;

public class CommonPaymentControl extends BaseHandler {
    public CommonPaymentControl(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Payment payment) {
        System.out.println("Common Payment is under control now");
        System.out.println(payment.getAccount().getBalance());
        super.handle(payment);
    }
}
