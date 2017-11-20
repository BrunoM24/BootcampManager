package org.academiadecodigo.registerexercise.service;

import org.academiadecodigo.registerexercise.model.User;

import java.util.ArrayList;

/**
 * RegisterExercise Created by BrunoM24 on 10/11/2017.
 */

public class MockUserService implements UserService {

    ArrayList<User> users = new ArrayList<>();

    @Override
    public boolean authenticate(String name, String password) {
        for (User user : users){
            if(user.getName().equals(name) && user.getPassword().equals(password)){
                return true;
            }
        }

        return false;
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public User findByName(String name) {
        for(User user : users){
            if(user.getName().equals(name)) {
                return user;
            }
        }

        return null;
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public User findByEmail(String text) {
        return null;
    }
}
