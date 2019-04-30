package com.epam.training.javajunior.HW3.Task8State.States;

import com.epam.training.javajunior.HW3.Task8State.Grant;

public interface State {
    String createGrant(Grant grant);
    String viewGrant(Grant grant);
    String delayGrant(Grant grant);
    String rejectGrant(Grant grant);
    String approveGrant(Grant grant);
    String recallGrant(Grant grant);

//    String createGrant(Grant grant);
}
