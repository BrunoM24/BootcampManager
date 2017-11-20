package org.academiadecodigo.registerexercise.service;

import org.academiadecodigo.registerexercise.model.User;

/**
 * RegisterExercise Created by BrunoM24 on 08/11/2017.
 */

public interface UserService extends Service{

    boolean authenticate(String name, String password);

    void addUser(User user);

    User findByName(String name);

    User findByEmail(String text);

    int count();
}
