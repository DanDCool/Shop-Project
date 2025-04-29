package Model;

import java.time.LocalDate;

public class Food extends Product{
    private LocalDate expirationDate;
    private LocalDate productionDate;
    private String constructiveMaterial;

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
