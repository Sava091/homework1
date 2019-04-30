package com.epam.training.javajunior.HW3.Task9Chain.concession;

import com.epam.training.javajunior.HW3.Task9Chain.BaseHandler;
import com.epam.training.javajunior.HW3.Task9Chain.Handler;
import com.epam.training.javajunior.HW3.Task9Chain.Payment;

public class ConcessionPaymentLeakToSbu extends BaseHandler {
    public ConcessionPaymentLeakToSbu(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Payment payment) {
        System.out.println("Concession Payment info is sent to SBU");
        super.handle(payment);
    }
}
