package Model;

public class ClothingProduct extends Product{
    private String color;
    private Size size;
    private String brand;
    private ClotheType clotheType;

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
