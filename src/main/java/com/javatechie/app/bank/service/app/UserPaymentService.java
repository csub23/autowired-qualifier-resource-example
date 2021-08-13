package com.javatechie.app.bank.service.app;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.javatechie.app.bank.service.api.Payment;

@Component //Annotation to create bean
//Annotation to load properties file
@PropertySource(value = { "classpath:application.properties" })
public class UserPaymentService {
//In our app we have two class(Paytm & PhonePe) that
//uses Payment interface so we cannot use @Autowired. If we do so,
//spring will be confuse when creation bean of -private Payment payment
//@Qualifier comes to rescue in this situation as we have multiple beans
//with same type

//	@Autowired
//	@Qualifier("phonePe")

	//@Resource = @Autowired + @Qualifier
	//we did (name="${beanName}") so that bean is not hardcoded
	//and can be changed anytime from application.properties file
@Resource(name="${beanName}")
	private Payment payment;

	public String processPayment() {
		return payment.doTransaction();
	}

}
