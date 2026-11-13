package com.example.student.notification;

public class SmsService implements NotificationServices{

    @Override
  public void SentNotification(){
        System.out.println("sms sentttt");
    }
}
