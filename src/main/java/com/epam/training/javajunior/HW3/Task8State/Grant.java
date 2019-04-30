package com.epam.training.javajunior.HW3.Task8State;

import com.epam.training.javajunior.HW3.Task8State.States.State;

public class Grant {
    private String name;
    private double cost;
    private State state;

    public Grant(String name, double cost, State state) {
        this.name = name;
        this.cost = cost;
        this.state = state;
    }

    public void changeState(State state) {
        this.state = state;
    }

    public void create() {
        System.out.println(state.createGrant(this));
    }

    public void view() {
        System.out.println(state.viewGrant(this));
    }

    public void delay() {
        System.out.println(state.delayGrant(this));
    }

    public void reject() {
        System.out.println(state.rejectGrant(this));
    }

    public void approve() {
        System.out.println(state.approveGrant(this));
    }

    public void recall() {
        System.out.println(state.recallGrant(this));
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
