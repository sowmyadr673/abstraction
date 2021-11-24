package com.xworkz.Abstraction.ATM;

abstract public class ATM {

	public void insertCard() {
		System.out.println("insert the card into atm machine");
	}

	public void Password() {
		System.out.println("enter the correct password");
	}

	public void enterMoney() {
		System.out.println("enter how much money you want");
	}

	abstract public void moneyTransfer();
}
