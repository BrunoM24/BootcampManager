package org.academiadecodigo.registerexercise.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import org.academiadecodigo.registerexercise.Navigation;
import org.academiadecodigo.registerexercise.model.User;
import org.academiadecodigo.registerexercise.service.ServiceRegistry;
import org.academiadecodigo.registerexercise.service.UserService;

import java.io.IOException;

/**
 * RegisterExercise Created by BrunoM24 on 08/11/2017.
 */

public class RegisterController {

    @FXML
    private TextField username;
    @FXML
    private TextField password;
    @FXML
    private TextField email;
    @FXML
    private Label errorLabel;

    private UserService userService;

    @FXML
    void initialize(){
        this.userService = (UserService)ServiceRegistry.getInstance().getService("userService");
    }

    @FXML
    public void registry(){

        if(this.username.getText().equals("") || this.password.getText().equals("") || this.email.getText().equals("")){
            displayError("Tens de preencher todos os campos!");
            return;
        }

        if(this.userService.findByName(this.username.getText()) != null){
            displayError("Esse utilizador já existe!");
            return;
        }

        if(this.userService.findByEmail(this.email.getText()) != null){
            displayError("Esse email já se encontra em uso!");
            return;
        }

        this.errorLabel.setVisible(false);
        System.out.println(username.getText());
        System.out.println(password.getText());
        System.out.println(email.getText());
        this.userService.addUser(new User(this.username.getText(), this.password.getText(), this.email.getText()));
    }

    @FXML
    public void cancelButton() {
        Navigation.getInstance().goBack();
    }

    private void displayError(String error){
        this.errorLabel.setText(error);
        this.errorLabel.setTextFill(Paint.valueOf("#FF0000"));
        this.errorLabel.setVisible(true);
    }

}
