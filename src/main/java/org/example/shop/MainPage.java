package org.example.shop;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;

public class MainPage {
    public void goToSignUpPage(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MainPage.fxml"));
        Scene mainScene = new Scene(fxmlLoader.load());
        HelloApplication.mainStage.setScene(mainScene);
    }
    public void goToLoginpage(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("LoginPage.fxml"));
        Scene mainScene = new Scene(fxmlLoader.load());
        HelloApplication.mainStage.setScene(mainScene);
    }
}
