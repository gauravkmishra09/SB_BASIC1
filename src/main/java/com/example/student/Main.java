package com.example.student;


import com.example.student.notification.EmailService;
import com.example.student.notification.NotificationServices;
import com.example.student.notification.SmsService;

public class Main {
	public static void main(String[] args) {

		NotificationServices notification = new SmsService(); //obj create jiska oouput lena hai uska

		OrderService order = new OrderService(notification); //orderservice obj create
		order.placeOrder();
	}
}
