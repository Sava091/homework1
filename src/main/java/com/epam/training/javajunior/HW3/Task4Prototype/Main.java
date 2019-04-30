package com.epam.training.javajunior.HW3.Task4Prototype;

public class Main {
    public static void main(String[] args) {
        Encyclopedia wiki = new Wiki();
        wiki.addArticle(new Article("Ada Lovelace", "The first female programmer. " +
                "She owns the creation of a binary code."));
        wiki.addArticle(new Article("Bill Gates", "The well-known founder of Microsoft. " +
                "Included in the list of the richest people in the world."));
        wiki.addArticle(new Article("Mark Zuckerberg", "He is the author of the world famous Facebook " +
                "and the youngest billionaire in the world."));

        System.out.println("\nbefore editing :");
        wiki.printAll();

        Article articleFromWiki = wiki.getArticle(2);
        articleFromWiki.setText(articleFromWiki.getText().replace("a", "A"));

        System.out.println("\nEdited article :");
        System.out.println(articleFromWiki);

        System.out.println("\noriginal even after editing :");
        wiki.printAll();

        wiki.updateArticle(articleFromWiki);

        System.out.println("\nupdated edits :");
        wiki.printAll();
    }
}
