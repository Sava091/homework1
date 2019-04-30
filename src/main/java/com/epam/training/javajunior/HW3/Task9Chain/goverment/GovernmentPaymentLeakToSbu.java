package com.epam.training.javajunior.HW3.Task9Chain.goverment;

import com.epam.training.javajunior.HW3.Task9Chain.BaseHandler;
import com.epam.training.javajunior.HW3.Task9Chain.Handler;
import com.epam.training.javajunior.HW3.Task9Chain.Payment;

public class GovernmentPaymentLeakToSbu extends BaseHandler {
    public GovernmentPaymentLeakToSbu(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Payment payment) {
        System.out.println("Government Payment info is sent to SBU");
        super.handle(payment);
    }
}
