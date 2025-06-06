package Controller;

import Model.*;

import java.time.LocalDate;

public class ProductController {
    public void addFoodProduct(double price, String picture, String name , LocalDate expirationDate, LocalDate productionDate, String constructiveMaterial) {
        Product product = new Food(price, picture, name, expirationDate, productionDate, constructiveMaterial);
        DataBaseController.getInstance().getProduct().add(product);
    }
    public void addElectronicProduct(double price, String picture, String name, String company, double power) {
        Product product = new ElectronicProduct(price, picture, name, company, power);
        DataBaseController.getInstance().getProduct().add(product);
    }
    public void addClothingProduct(double price, String picture, String name, String color, Size size, String brand, ClotheType clotheType) {
        Product product = new ClothingProduct(price, picture, name, color, size, brand, clotheType);
        DataBaseController.getInstance().getProduct().add(product);
    }
}
