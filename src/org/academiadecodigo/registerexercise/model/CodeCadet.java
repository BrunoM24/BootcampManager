package org.academiadecodigo.registerexercise.model;

import org.academiadecodigo.registerexercise.Gender;

import java.time.LocalDate;
import java.util.Date;

/**
 * RegisterExercise Created by BrunoM24 on 10/11/2017.
 */

public class CodeCadet {

    private User user;
    private Gender gender;
    private String address;
    private String city;
    private String phone;
    private Bootcamp bootcamp;
    private LocalDate birthday;

    public CodeCadet(User user){
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public String getName(){
        return user.getName();
    }

    public Gender getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getPhone() {
        return phone;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
}
