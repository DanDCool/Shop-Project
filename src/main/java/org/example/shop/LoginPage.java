package org.example.shop;

import Controller.UserController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginPage {
    @FXML
    private TextField name;

    @FXML
    private TextField password;

    public void login(ActionEvent actionEvent) throws IOException {
        UserController.getUserController().login(name.getText(),password.getText());
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("HomePage.fxml"));
        Scene mainScene = new Scene(fxmlLoader.load());
        HelloApplication.mainStage.setScene(mainScene);
    }
}
