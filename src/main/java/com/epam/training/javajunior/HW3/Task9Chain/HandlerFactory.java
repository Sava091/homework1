package com.epam.training.javajunior.HW3.Task9Chain;

import com.epam.training.javajunior.HW3.Task9Chain.common.CommonPaymentControl;
import com.epam.training.javajunior.HW3.Task9Chain.common.CommonPaymentUpdate;
import com.epam.training.javajunior.HW3.Task9Chain.common.CommonPaymentLeakToSbu;
import com.epam.training.javajunior.HW3.Task9Chain.common.CommonPaymentTax;
import com.epam.training.javajunior.HW3.Task9Chain.concession.ConcessionPaymentControl;
import com.epam.training.javajunior.HW3.Task9Chain.concession.ConcessionPaymentUpdate;
import com.epam.training.javajunior.HW3.Task9Chain.concession.ConcessionPaymentLeakToSbu;
import com.epam.training.javajunior.HW3.Task9Chain.concession.ConcessionPaymentTax;
import com.epam.training.javajunior.HW3.Task9Chain.goverment.GovernmentPaymentControl;
import com.epam.training.javajunior.HW3.Task9Chain.goverment.GovernmentPaymentUpdate;
import com.epam.training.javajunior.HW3.Task9Chain.goverment.GovernmentPaymentLeakToSbu;
import com.epam.training.javajunior.HW3.Task9Chain.goverment.GovernmentPaymentTax;
import com.epam.training.javajunior.HW3.Task9Chain.internal.InternalPaymentControl;
import com.epam.training.javajunior.HW3.Task9Chain.internal.InternalPaymentUpdate;
import com.epam.training.javajunior.HW3.Task9Chain.internal.InternalPaymentLeakToSbu;
import com.epam.training.javajunior.HW3.Task9Chain.internal.InternalPaymentTax;

public class HandlerFactory {
    public Handler createHandler(Payment payment) {
        switch(payment.getType()) {
            case COMMON:
                return createCommonChain(payment);
            case CONCESSION:
                return createConcessionChain(payment);
            case GOVERNMENT:
                return createGovernmentChain(payment);
            case INTERNAL:
                return createInternalChain(payment);
        }
        return createCommonChain(payment);
    }

    private Handler createInternalChain(Payment payment) {
        Handler leakHandler = new InternalPaymentLeakToSbu(null);
        Handler updateHandler = new InternalPaymentUpdate(leakHandler);
        Handler taxHandler = new InternalPaymentTax(updateHandler);
        Handler controlHandler = new InternalPaymentControl(taxHandler);
        return controlHandler;
    }

    private Handler createGovernmentChain(Payment payment) {
        Handler leakHandler = new GovernmentPaymentLeakToSbu(null);
        Handler updateHandler = new GovernmentPaymentUpdate(leakHandler);
        Handler taxHandler = new GovernmentPaymentTax(updateHandler);
        Handler controlHandler = new GovernmentPaymentControl(taxHandler);
        return controlHandler;
    }

    private Handler createConcessionChain(Payment payment) {
        Handler leakHandler = new ConcessionPaymentLeakToSbu(null);
        Handler updateHandler = new ConcessionPaymentUpdate(leakHandler);
        Handler taxHandler = new ConcessionPaymentTax(updateHandler);
        Handler controlHandler = new ConcessionPaymentControl(taxHandler);
        return controlHandler;
    }

    private Handler createCommonChain(Payment payment) {
        Handler leakHandler = new CommonPaymentLeakToSbu(null);
        Handler updateHandler = new CommonPaymentUpdate(leakHandler);
        Handler taxHandler = new CommonPaymentTax(updateHandler);
        Handler controlHandler = new CommonPaymentControl(taxHandler);
        return controlHandler;
    }
}
