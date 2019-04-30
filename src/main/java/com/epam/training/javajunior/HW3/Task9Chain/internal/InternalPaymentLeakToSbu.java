package com.epam.training.javajunior.HW3.Task9Chain.internal;

import com.epam.training.javajunior.HW3.Task9Chain.BaseHandler;
import com.epam.training.javajunior.HW3.Task9Chain.Handler;
import com.epam.training.javajunior.HW3.Task9Chain.Payment;

public class InternalPaymentLeakToSbu extends BaseHandler {
    public InternalPaymentLeakToSbu(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Payment payment) {
        System.out.println("Internal Payment info is sent to SBU");
        super.handle(payment);
    }
}
