package com.epam.training.javajunior.HW3.Task7Observer;

public class Product {
    private ProductType type;
    private String name;
    private String content;

    public Product(ProductType type, String name, String content) {
        this.type = type;
        this.name = name;
        this.content = content;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
