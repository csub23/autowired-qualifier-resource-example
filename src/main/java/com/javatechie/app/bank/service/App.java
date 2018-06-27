package com.javatechie.app.bank.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javatechie.app.bank.service.app.UserPaymentService;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/javatechie/app/bank/service/config/application-context.xml");

		UserPaymentService service = context.getBean(UserPaymentService.class);
		System.out.println(service.processPayment());
	}
}
