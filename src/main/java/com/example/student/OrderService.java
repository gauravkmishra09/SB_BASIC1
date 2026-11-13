package com.example.student;

import com.example.student.notification.EmailService;
import com.example.student.notification.NotificationServices;
import com.example.student.notification.SmsService;

public class OrderService {

NotificationServices notification; //obj not created just told

public OrderService(NotificationServices notification){ //dependency injection
    this.notification= notification; // orderservice work is not obj creation

}

    public void placeOrder(){
        System.out.println("order placed");
        notification.SentNotification();
    }

}
