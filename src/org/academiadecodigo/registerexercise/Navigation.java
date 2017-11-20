package org.academiadecodigo.registerexercise;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.academiadecodigo.registerexercise.controllers.Controller;

import java.io.IOException;
import java.util.*;

/**
 * RegisterExercise Created by BrunoM24 on 10/11/2017.
 */

public final class Navigation {

    private static Navigation instance = null;

    private Navigation() {
    }

    public static synchronized Navigation getInstance() {

        if (instance == null) {
            instance = new Navigation();
        }

        return instance;
    }

    private Stage stage;
    private Stack<Scene> scenesHistory = new Stack<>();
    private Map<String, Controller> controllers = new Hashtable<>();

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void loadScreen(String view) {

        try {

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/layout/" + view + ".fxml"));

            Parent root = fxmlLoader.load();

            //TO Understand
            //controllers.put(view, fxmlLoader.<Controller>getController());

            Scene scene = new Scene(root);
            this.scenesHistory.add(scene);

            setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void goBack() {

        if (this.scenesHistory.size() < 2) {
            return;
        }

        this.scenesHistory.pop();

        Scene scene = this.scenesHistory.peek();

        setScene(scene);
    }

    private void setScene(Scene scene) {
        this.stage.setScene(scene);
        this.stage.show();
    }
}
