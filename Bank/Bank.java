package com.xworkz.Abstraction.Bank;

abstract public class Bank {

	public void deposite() {
		System.out.println("deposit the money");
	}

	public void withdrawal() {
		System.out.println("withdraw the money");
	}

	public void NEFTmoney() {
		System.out.println("transfer money from one bank to another bank");
	}
	abstract public void interestRate();
	
}
