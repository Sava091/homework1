package com.epam.training.javajunior.HW3.Task8State;

import com.epam.training.javajunior.HW3.Task8State.States.CreatedState;

public class Main {
    public static void main(String[] args) {
        Grant grant = new Grant("'New Programming language' ", 100000, new CreatedState());

        grant.create();
        grant.view();
        grant.delay();
        grant.view();
        grant.recall();
        grant.view();
        grant.approve();
        System.out.println("-------");
        grant.reject();
    }
}
