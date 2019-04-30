package com.epam.training.javajunior.HW3.Task7Observer;

import java.util.ArrayList;
import java.util.List;

public class Post {
    private List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(ShopSubscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(ShopSubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void sendProductToSubscribers(Product product) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(product);
        }
    }
}
