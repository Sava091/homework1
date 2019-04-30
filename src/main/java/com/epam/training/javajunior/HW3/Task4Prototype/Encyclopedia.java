package com.epam.training.javajunior.HW3.Task4Prototype;

public interface Encyclopedia {
     void addArticle(Article article);
     Article getArticle(int id);
     void updateArticle(Article article);
     void printAll();
}
