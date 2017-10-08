package com.example.ekene.ichat.events;

/**
 * Created by EKENE on 9/23/2017.
 */

public class PushNotificationEvent {

    private     String  title;
    private     String  message;
    private     String  username;
    private     String  uid;
    private     String  fcmToken;

    public PushNotificationEvent(){}

    public PushNotificationEvent(String title, String message, String username, String uid, String fcmToken) {
        this.title = title;
        this.message = message;
        this.username = username;
        this.uid = uid;
        this.fcmToken = fcmToken;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public String getUsername() {
        return username;
    }

    public String getUid() {
        return uid;
    }

    public String getFcmToken() {
        return fcmToken;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setFcmToken(String fcmToken) {
        this.fcmToken = fcmToken;
    }
}
