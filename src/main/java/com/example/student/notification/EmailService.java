package com.example.student.notification;

public class EmailService implements NotificationServices {

    @Override
    public void SentNotification(){
        System.out.println("notification sent of email");

    }
}
