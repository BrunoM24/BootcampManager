package org.academiadecodigo.registerexercise.service;

import org.academiadecodigo.registerexercise.ConnectionManager;
import org.academiadecodigo.registerexercise.model.User;

import java.sql.*;

/**
 * RegisterExercise Created by BrunoM24 on 17/11/2017.
 */

public class JDBCUserService implements UserService {

    private Connection connection;

    public JDBCUserService(Connection connection) {
        this.connection = connection;
    }

    @Override
    public boolean authenticate(String name, String password) {
        try {

            PreparedStatement statement =  this.connection.prepareStatement("SELECT COUNT(*) FROM Users WHERE Name LIKE ? AND Password LIKE ?");

            statement.setString(1, name);
            statement.setString(2, password);

            ResultSet result = statement.executeQuery();

            result.next();

            return (result.getInt(1) >= 1);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public void addUser(User user) {
        try {

            Statement statement = this.connection.createStatement();

            String query = "INSERT INTO Users (Name, Password, Email) VALUES ('" + user.getName() + "', '" + user.getPassword() + "', '" + user.getEmail() + "');";

            statement.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public User findByName(String name) {

        return null;
    }

    @Override
    public User findByEmail(String email){
        return null;
    }

    @Override
    public int count() {
        return 0;
    }
}
