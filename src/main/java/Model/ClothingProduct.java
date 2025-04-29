package Model;

public class ClothingProduct extends Product{
    private String color;
    private Size size;
    private String brand;
    private ClotheType clotheType;

    public ClothingProduct(double price, String picture, String name, String color, Size size, String brand, ClotheType clotheType) {
        super(price, picture, name);
        this.color = color;
        this.size = size;
        this.brand = brand;
        this.clotheType = clotheType;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public ClotheType getClotheType() {
        return clotheType;
    }

    public void setClotheType(ClotheType clotheType) {
        this.clotheType = clotheType;
    }
}
