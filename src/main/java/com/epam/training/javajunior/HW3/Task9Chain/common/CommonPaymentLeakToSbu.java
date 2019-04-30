package com.epam.training.javajunior.HW3.Task9Chain.common;

import com.epam.training.javajunior.HW3.Task9Chain.BaseHandler;
import com.epam.training.javajunior.HW3.Task9Chain.Handler;
import com.epam.training.javajunior.HW3.Task9Chain.Payment;

public class CommonPaymentLeakToSbu extends BaseHandler {
    public CommonPaymentLeakToSbu(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Payment payment) {
        System.out.println("Common Payment info is sent to SBU");
        super.handle(payment);
    }
}
