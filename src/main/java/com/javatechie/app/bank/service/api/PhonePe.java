package com.javatechie.app.bank.service.api;

import org.springframework.stereotype.Service;

@Service
public class PhonePe implements Payment {

	@Override
	public String doTransaction() {
		// TODO Auto-generated method stub
		return "payment process using phonepe..!";
	}

	@Override
	public String doCashOut() {
		return "this is Phonepay class doCashout";
	}
}
