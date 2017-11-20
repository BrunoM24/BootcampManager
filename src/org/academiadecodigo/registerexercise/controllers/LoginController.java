package org.academiadecodigo.registerexercise.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.academiadecodigo.registerexercise.Navigation;
import org.academiadecodigo.registerexercise.service.Service;
import org.academiadecodigo.registerexercise.service.ServiceRegistry;
import org.academiadecodigo.registerexercise.service.UserService;

import java.io.IOException;

/**
 * RegisterExercise Created by BrunoM24 on 08/11/2017.
 */

public class LoginController {

    @FXML
    private TextField textFieldUser;
    @FXML
    private TextField textFieldPass;

    private UserService userService;

    @FXML
    void initialize() {
        this.userService = (UserService)ServiceRegistry.getInstance().getService("userService");
    }

    @FXML
    public void loginButtonPressed(){

        if(!this.textFieldUser.getText().matches("[a-zA-Z0-9]+")){
            return;
        }

        if(!this.userService.authenticate(this.textFieldUser.getText(), this.textFieldPass.getText())){
            System.out.println("who are you?");
            return;
        }

        //Navigation.getInstance().loadScreen("welcome_screen");
        Navigation.getInstance().loadScreen("bootcamp_list");
    }

    @FXML
    public void registerButtonPressed(){
        Navigation.getInstance().loadScreen("register_screen");
    }
}
