package org.example.shop;

import Controller.UserController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;

import java.io.IOException;

public class SignUpPage {
    @FXML
    private TextField money;

    @FXML
    private TextField name;

    @FXML
    private TextField password;
    public void signUp(ActionEvent actionEvent) throws IOException {
        UserController.getUserController().addUser(name.getText(),password.getText(),Double.parseDouble(money.getText()));
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SignUpPage.fxml"));
        Scene mainScene = new Scene(fxmlLoader.load());
        HelloApplication.mainStage.setScene(mainScene);
    }
}
