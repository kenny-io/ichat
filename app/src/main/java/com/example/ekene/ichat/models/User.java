package com.example.ekene.ichat.models;

/**
 * Created by EKENE on 9/23/2017.
 */

public class User {

    public String uid;
    public String email;
    public String firebaseoken;


    public User(){

    }

    public User(String uid, String email, String firebaseoken) {
        this.uid = uid;
        this.email = email;
        this.firebaseoken = firebaseoken;
    }
}
