package org.example.kafka.producer.dto;

public class ProductDTO {

    private String title;
    private String description;
    private String color;
    private int price;
    private boolean isInStock;

    public ProductDTO() {
    }

    public ProductDTO(String title, String description, String color, int price, boolean isInStock) {
        this.title = title;
        this.description = description;
        this.color = color;
        this.price = price;
        this.isInStock = isInStock;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }
}
