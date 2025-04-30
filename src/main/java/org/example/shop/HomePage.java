package org.example.shop;

import Model.Database;
import Model.Product;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomePage implements Initializable {
    @FXML
    private HBox hbox;

    @FXML
    private ListView<String> productList;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        for(Product x: Database.getDatabase().getAllProducts()){
            productList.getItems().add(x.getName() + " | " + x.getPrice());
        }
    }
    public void goToProfilePage(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ProfilePage.fxml"));
        Scene profileScene = new Scene(fxmlLoader.load());
        HelloApplication.mainStage.setScene(profileScene);
    }
}
