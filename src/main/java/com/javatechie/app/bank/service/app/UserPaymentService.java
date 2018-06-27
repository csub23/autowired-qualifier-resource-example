package com.javatechie.app.bank.service.app;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.javatechie.app.bank.service.api.Payment;

@Component
@PropertySource(value = { "classpath:application.properties" })
public class UserPaymentService {
/*
	@Autowired
	@Qualifier("${beanName}")*/
	
	@Resource(name="${beanName}")
	private Payment payment;

	public String processPayment() {
		return payment.doTransaction();
	}

}
