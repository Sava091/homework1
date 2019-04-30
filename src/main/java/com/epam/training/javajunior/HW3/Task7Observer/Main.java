package com.epam.training.javajunior.HW3.Task7Observer;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        ShopSubscriber shop1 = new ShopSubscriber("Alex Nalivayko");
        ShopSubscriber shop2 = new ShopSubscriber("Sanya Mostipan");
        post.subscribe(shop1);
        post.subscribe(shop2);

        Publisher publisher = new Publisher(post);

        publisher.sendProduct(new Product(ProductType.MAGAZINE, "Programming on Java", "Epam courses"));
        post.unsubscribe(shop1);
        publisher.sendProduct(new Product(ProductType.NEWPAPPER, "Games&Entertainment", "PC games"));
    }
}
