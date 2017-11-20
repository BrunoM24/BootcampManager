package org.academiadecodigo.registerexercise;

import javafx.application.Application;
import javafx.stage.Stage;
import org.academiadecodigo.registerexercise.service.*;

import java.time.LocalDate;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("<Academia de Código_>");
        Navigation.getInstance().setStage(primaryStage);
        Navigation.getInstance().loadScreen("login_screen");
    }

    @Override
    public void init(){

        BootcampService bootcampService = new MockBootcampService();

        bootcampService.createBootcamp("Lisbon", LocalDate.now(), LocalDate.now());
        bootcampService.createBootcamp("Lisbon", LocalDate.now(), LocalDate.now());
        bootcampService.createBootcamp("Fundão", LocalDate.now(), LocalDate.now());

        ServiceRegistry serviceRegistry = ServiceRegistry.getInstance();
        serviceRegistry.addService("userService", new JDBCUserService(new ConnectionManager().getConnection()));
        serviceRegistry.addService("bootcampService", bootcampService);

    }

    public static void main(String[] args) {
        launch(args);
    }

}
