package Selenium;
public class Item {
    private String title;
    private double price;
    private String description;

    //Category (Page) Item
    public Item(String title, double price, String description) {
        this.title = title;
        this.price = price;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}