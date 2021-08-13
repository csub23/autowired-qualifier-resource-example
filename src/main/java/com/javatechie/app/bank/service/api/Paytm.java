package com.javatechie.app.bank.service.api;

import org.springframework.stereotype.Service;

@Service
public class Paytm implements Payment {

	@Override
	public String doTransaction() {
		return "payment process using paytm..!";
	}

	@Override
	public String doCashOut() {
		return null;
	}


	public String testingMethod() {
		return "Testing Method";
	}


}
