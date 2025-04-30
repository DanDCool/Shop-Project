package Controller;

import Model.*;

import java.time.LocalDate;

public class AdminController {
    private static AdminController adminController;
    public static AdminController getAdminController(){
        if(adminController==null){
            adminController = new AdminController();
        }
        return adminController;
    }
    private AdminController(){
    }
    public String addFoodProduct(double price, String picture, String name , LocalDate expirationDate, LocalDate productionDate, String constructiveMaterial) {
        Product product = new Food(price, picture, name, expirationDate, productionDate, constructiveMaterial);
        DataBaseController.getInstance().getProduct().add(product);
        return "add Successfully";
    }
    public String addElectronicProduct(double price, String picture, String name, String company, double power) {
        Product product = new ElectronicProduct(price, picture, name, company, power);
        DataBaseController.getInstance().getProduct().add(product);
        return "add Successfully";
    }
    public String addClothingProduct(double price, String picture, String name, String color, Size size, String brand, ClotheType clotheType) {
        Product product = new ClothingProduct(price, picture, name, color, size, brand, clotheType);
        DataBaseController.getInstance().getProduct().add(product);
        return "add Successfully";
    }
    public String deleteProduct(Product product){
        DataBaseController.getInstance().getProduct().remove(product);
        return "delete Successfully";
    }


}
