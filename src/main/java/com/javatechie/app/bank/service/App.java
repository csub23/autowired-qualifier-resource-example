package com.javatechie.app.bank.service;

import com.javatechie.app.bank.service.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javatechie.app.bank.service.app.UserPaymentService;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		System.out.println("Config from java is loaded");
		UserPaymentService service = context.getBean(UserPaymentService.class);
		System.out.println(service.processPayment());
	}
}
