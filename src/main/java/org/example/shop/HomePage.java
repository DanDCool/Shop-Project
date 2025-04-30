package org.example.shop;

import Controller.UserController;
import Model.Database;
import Model.Product;
import Model.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomePage implements Initializable {
    public static Product currentProduct;
    @FXML
    private HBox hbox;

    @FXML
    private ListView<String> productList;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        for(Product x: Database.getDatabase().getAllProducts()){
            productList.getItems().add(x.toString());
        }
    }
    public void goToProfilePage(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ProfilePage.fxml"));
        Scene profileScene = new Scene(fxmlLoader.load());
        HelloApplication.mainStage.setScene(profileScene);
    }
    public void selectProduct(MouseEvent mouseEvent){
        String name = "";
        for(int i = 0;productList.getSelectionModel().getSelectedItem().toString().charAt(i)!=' ';i++){
            name += productList.getSelectionModel().getSelectedItem().toString().charAt(i);
        }
        for(Product x: Database.getDatabase().getAllProducts()){
            if(name.equals(x.getName())){
                currentProduct = x;
                break;
            }
        }
    }
    public void buyProduct(ActionEvent actionEvent){
        if(UserController.currentUser.getMoney()>=currentProduct.getPrice()) {
            UserController.currentUser.getBuyedProducts().add(currentProduct);
            UserController.currentUser.setMoney(UserController.currentUser.getMoney() - currentProduct.getPrice());
        }
    }
}
