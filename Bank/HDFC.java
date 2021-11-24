package com.xworkz.Abstraction.Bank;

public class HDFC extends Bank {

	public HDFC() {
		System.out.println("welcome to HDFC");
	}

	@Override
	public void interestRate() {
		System.out.println("interest rate is 5");
	}

}
