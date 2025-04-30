package org.example.shop;

import Model.Database;
import Model.Product;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;

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
}
