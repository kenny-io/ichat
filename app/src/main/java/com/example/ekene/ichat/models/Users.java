package com.example.ekene.ichat.models;

/**
 * Created by EKENE on 9/23/2017.
 */

public class Users {

    private String emailId;
    private String lastMessage;
    private int notifCount;


    public String getEmailId() {
        return emailId;
    }

    public String getLastMesaage() {
        return lastMessage;
    }

    public int getNotifCount() {
        return notifCount;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setLastMesaage(String lastMesaage) {
        this.lastMessage = lastMesaage;
    }

    public void setNotifCount(int notifCount) {
        this.notifCount = notifCount;
    }
}
