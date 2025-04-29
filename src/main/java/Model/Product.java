package Model;

public class Product {
    private double price;
    private String picture;
    private String name;

    public Product(double price, String picture, String name) {
        this.price = price;
        this.picture = picture;
        this.name = name;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
