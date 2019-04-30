package com.epam.training.javajunior.HW3.Task8State.States;

import com.epam.training.javajunior.HW3.Task8State.Grant;

public class ViewedState implements State {
    @Override
    public String createGrant(Grant grant) {
        return "Can`t do this on current state";
    }

    @Override
    public String viewGrant(Grant grant) {
        return "Can`t do this on current state";
    }

    @Override
    public String delayGrant(Grant grant) {
        grant.changeState(new DelayedState());
        return "Grant " + grant.getName()+ "delayed";
    }

    @Override
    public String rejectGrant(Grant grant) {
        grant.changeState(new RejectedState());
        return "Grant " + grant.getName()+ "rejected";
    }

    @Override
    public String approveGrant(Grant grant) {
        grant.changeState(new ApprovedState());
        return "Grant " + grant.getName()+ "approved";
    }

    @Override
    public String recallGrant(Grant grant) {
        grant.changeState(new RecalledState());
        return "Grant " + grant.getName()+ "approved";
    }
}
