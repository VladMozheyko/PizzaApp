package com.example.pizzaapp;

public class Pizza {                  // Модель
    private int img;
    private String title;
    private String description;

    private int price;

    public Pizza(int img, String title, String description, int price){
        this.img = img;
        this.title = title;
        this.description = description;
        this.price = price;
    }


    public int getImg() {
        return img;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "img=" + img +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price;
    }
}
