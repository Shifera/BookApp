package com.company;

public class Book {
    private String title;
    private String author;
    private String description;
    private double price;
    private int isInStock;

    public Book() {

    }

    public Book(String title, String author, String description, double price, int isInStock) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.isInStock = isInStock;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setIsInStock(int isInStock) {
        this.isInStock = isInStock;
    }

    public int getIsInStock() {
        return isInStock;
    }

    public void getDisplayText() {

        this.author=getAuthor();
        this.title = getTitle();
       this.description=getDescription();
        System.out.println(author + " " + title +" " +" " +description);
    }
}