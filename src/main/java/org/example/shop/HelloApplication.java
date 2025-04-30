package org.example.shop;

import Model.Database;
import Model.ElectronicProduct;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public static Stage mainStage;
    public static Scene mainScene;
    @Override
    public void start(Stage stage) throws IOException {
        ElectronicProduct a = new ElectronicProduct(23,"a","a","a",2);
        Database.getDatabase().getAllProducts().add(a);
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SignUpPage.fxml"));
        Scene mainScene = new Scene(fxmlLoader.load(), 320, 240);
        mainStage = new Stage();
        mainStage.setTitle("Hello!");
        mainStage.setScene(mainScene);
        mainStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}