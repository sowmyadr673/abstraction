package com.xworkz.Abstraction.ATM;

public class OrangeLabelATM extends ATM {

	public OrangeLabelATM() {
		System.out.println("welcome to Orange Label ATM ");
	}

	@Override
	public void moneyTransfer() {
		System.out.println("these atms are used in the money transaction");
	}

}
