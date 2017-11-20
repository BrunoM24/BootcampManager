package org.academiadecodigo.registerexercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * RegisterExercise Created by BrunoM24 on 17/11/2017.
 */

public class ConnectionManager {

    private Connection connection;

    public Connection getConnection() {

        try {
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Academia", "root", "");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    public void close(){
        try {
            this.connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
