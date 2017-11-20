package org.academiadecodigo.registerexercise.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import org.academiadecodigo.registerexercise.Gender;
import org.academiadecodigo.registerexercise.model.CodeCadet;
import org.academiadecodigo.registerexercise.service.BootcampService;
import org.academiadecodigo.registerexercise.service.ServiceRegistry;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

/**
 * RegisterExercise Created by BrunoM24 on 14/11/2017.
 */

public class BootcampDetailsController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label idLabel;

    @FXML
    private Label locationLabel;

    @FXML
    private Label startLabel;

    @FXML
    private Label endLabel;

    @FXML
    private TableColumn<CodeCadet, String> nameField;

    @FXML
    private TableColumn<CodeCadet, String> emailField;

    @FXML
    private TableColumn<CodeCadet, String> phoneField;

    @FXML
    private TableColumn<CodeCadet, String> cityField;

    @FXML
    private TableColumn<CodeCadet, String> addressField;

    @FXML
    private TableColumn<CodeCadet, Gender> genderField;

    @FXML
    private TableColumn<CodeCadet, LocalDate> BirthdayField;

    private BootcampService bootcampService;

    @FXML
    void initialize() {
        this.bootcampService = (BootcampService) ServiceRegistry.getInstance().getService("bootcampService");
    }
}
