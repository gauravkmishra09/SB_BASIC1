package com.example.student;

import com.example.student.notification.EmailService;
import com.example.student.notification.NotificationServices;
import com.example.student.notification.SmsService;

public class OrderService {

    NotificationServices note = new EmailService();
    NotificationServices nn = new SmsService();


    public void placeOrder(){
        System.out.println("order placed");
        note.SentNotification();
        nn.SentNotification();
    }

}
