import Controller.AdminController;
import Model.*;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.concurrent.TimeoutException;

public class AdminControllerTest {
    @Test
    public void addFoodTest(){
        double price = 199;
        String picture = "food.png";
        String name = "food";
        LocalDate expirationDate = LocalDate.now();
        LocalDate productionDate = LocalDate.now();
        String constructiveMaterial = "fabric";
        String expected = "add Successfully";
        Assert.assertEquals(expected,
                AdminController.getAdminController().addFoodProduct
                        (price,picture,name,expirationDate,productionDate,constructiveMaterial));
    }
    @Test
    public void addElectronicProductTest(){
        double price = 199;
        String picture = "camera.png";
        String name = "camera";
        String company = "canon";
        double power = 29.2;
        String expected = "add Successfully";
        Assert.assertEquals(expected,
                AdminController.getAdminController().addElectronicProduct
                        (price,picture,name,company,power));
    }
    @Test
    public void addClothingProductTest(){
        double price = 199;
        String picture = "camera.png";
        String name = "camera";
        String color = "Purple";
        String brand = "Louie";
        Size size = Size.small;
        ClotheType clotheType = ClotheType.open;
        String expected = "add Successfully";
        Assert.assertEquals(expected,
                AdminController.getAdminController().addClothingProduct
                        (price,picture,name,color,size,brand,clotheType));
    }
    @Test
    public void deleteProductTest(){
        Product test = new ClothingProduct(2,"a","a","a",Size.small,"a",ClotheType.closed);
        String expected = "delete Successfully";
        Assert.assertEquals(expected,AdminController.getAdminController().deleteProduct(test));
    }
}
