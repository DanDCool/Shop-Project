package org.example.shop;

import Controller.UserController;
import Model.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ProfilePage implements Initializable {
    @FXML
    private TextField credit;

    @FXML
    private HBox hbox;

    @FXML
    private Label information;

    public void goToHomePage(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("HomePage.fxml"));
        Scene profileScene = new Scene(fxmlLoader.load());
        HelloApplication.mainStage.setScene(profileScene);
    }
    public void logOut(ActionEvent actionEvent) throws IOException {
        UserController.getUserController().logout();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SignUpPage.fxml"));
        Scene profileScene = new Scene(fxmlLoader.load());
        HelloApplication.mainStage.setScene(profileScene);
    }
    public void buyCredit(ActionEvent actionEvent){
        UserController.getUserController().increaseMoney(Double.parseDouble(credit.getText()));
        information.setText("Your information\nYour name: " + UserController.currentUser.getName() +"\n"
                + "Your password: " + UserController.currentUser.getPassword() + "\n" +
                "Your credit: " + UserController.currentUser.getMoney());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        information.setText("Your information\nYour name: " + UserController.currentUser.getName() +"\n"
        + "Your password: " + UserController.currentUser.getPassword() + "\n" +
                "Your credit: " + UserController.currentUser.getMoney());
    }
}
