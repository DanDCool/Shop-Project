package Model;

import java.time.LocalDate;

public class Food extends Product{
    private LocalDate expirationDate;
    private LocalDate productionDate;
    private String constructiveMaterial;
    public Food(double price, String picture, String name, LocalDate expirationDate, LocalDate productionDate, String constructiveMaterial) {
        super(price, picture, name);
        this.expirationDate = expirationDate;
        this.productionDate = productionDate;
        this.constructiveMaterial = constructiveMaterial;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }

    public String getConstructiveMaterial() {
        return constructiveMaterial;
    }

    public void setConstructiveMaterial(String constructiveMaterial) {
        this.constructiveMaterial = constructiveMaterial;
    }
}
