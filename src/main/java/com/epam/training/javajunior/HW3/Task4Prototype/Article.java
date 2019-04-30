package com.epam.training.javajunior.HW3.Task4Prototype;

public class Article implements Copyable {
    private int id;
    private String title;
    private String text;

    public Article(int id, String title, String text) {
        this.id = id;
        this.title = title;
        this.text = text;
    }

    public Article(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setText(String text) {
        this.text = text;
    }
    public int getId() {
        return id;
    }
    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Article id= " + id + ", title= " + title + ", text= " + text;
    }

    public Article copy() {
        return new Article(id, title, text);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Article article = (Article) o;

        if (id != article.id) return false;
        if (title != null ? !title.equals(article.title) : article.title != null) {
            return false;
        }
        return text != null ? !text.equals(article.text) : article.text != null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (text != null ? text.hashCode() : 0);
        return result;
    }
}
