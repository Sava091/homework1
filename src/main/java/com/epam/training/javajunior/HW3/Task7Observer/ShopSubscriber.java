package com.epam.training.javajunior.HW3.Task7Observer;

public class ShopSubscriber implements Subscriber {
    private String name;

    public ShopSubscriber(String name) {
        this.name = name;
    }

    public void update(Product product) {
        System.out.println("["+name+"]" + " Received product " + product.getName());
    }
}
