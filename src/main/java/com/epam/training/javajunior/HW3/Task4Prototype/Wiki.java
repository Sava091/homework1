package com.epam.training.javajunior.HW3.Task4Prototype;

import java.util.HashMap;

public class Wiki implements Encyclopedia {
    private HashMap<Integer, Article> articles = new HashMap<>();
    private int counter = 0;

    public void addArticle(Article article) {
        if (article == null) {
            throw new IllegalArgumentException("cannot add null");
        }
        article.setId(counter);
        articles.put(counter, article);
        counter ++;
    }

    public Article getArticle(int id) {
        return articles.get(id).copy();
    }

    public void updateArticle(Article article) {
        if (article == null || article.getId() > counter) {
            throw new IllegalArgumentException("cannot update article:" + article);
        }
        articles.remove(article.getId());
        articles.put(article.getId(), article);
    }

    public void printAll() {
        for (Article article : articles.values()) {
            System.out.println(article);
        }
    }
}
