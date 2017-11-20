package org.academiadecodigo.registerexercise.model;

/**
 * RegisterExercise Created by BrunoM24 on 08/11/2017.
 */

public class User {

    private String name;
    private String password;
    private String email;

    public User(String name, String password, String email){
        this.name = name;
        this.password = password;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}
