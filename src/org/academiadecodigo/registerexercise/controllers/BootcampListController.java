package org.academiadecodigo.registerexercise.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import org.academiadecodigo.registerexercise.Navigation;
import org.academiadecodigo.registerexercise.model.Bootcamp;
import org.academiadecodigo.registerexercise.service.BootcampService;
import org.academiadecodigo.registerexercise.service.ServiceRegistry;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

/**
 * RegisterExercise Created by BrunoM24 on 14/11/2017.
 */

public class BootcampListController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Bootcamp> bootcampsListView;

    @FXML
    private TableColumn<Bootcamp, Integer> idColumn;

    @FXML
    private TableColumn<Bootcamp, String> nameColumn;

    @FXML
    private TableColumn<Bootcamp, String> locationColumn;

    @FXML
    private TableColumn<Bootcamp, LocalDate> startColumn;

    @FXML
    private TableColumn<Bootcamp, LocalDate> endColumn;

    private BootcampService bootcampService;

    @FXML
    void initialize() {
        this.bootcampService = (BootcampService) ServiceRegistry.getInstance().getService("bootcampService");

        ObservableList<Bootcamp> bootcamps = FXCollections.observableArrayList(this.bootcampService.listBootcamps()).sorted();

        this.bootcampsListView.setItems(bootcamps);

        this.idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        this.nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        this.locationColumn.setCellValueFactory(new PropertyValueFactory<>("cityLocation"));
        this.startColumn.setCellValueFactory(new PropertyValueFactory<>("start"));
        this.endColumn.setCellValueFactory(new PropertyValueFactory<>("end"));
    }

    @FXML
    void click(MouseEvent event) {
        System.out.println(this.bootcampsListView.getSelectionModel().getSelectedItem().getId());

        Navigation.getInstance().loadScreen("bootcamp_details");

    }
}
