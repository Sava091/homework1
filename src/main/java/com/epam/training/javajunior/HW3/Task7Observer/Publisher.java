package com.epam.training.javajunior.HW3.Task7Observer;

public class Publisher {
    private Post post;

    public Publisher(Post post) {
        this.post = post;
    }

    public void sendProduct(Product product) {
        post.sendProductToSubscribers(product);
    }
}
