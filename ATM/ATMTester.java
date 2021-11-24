package com.xworkz.Abstraction.ATM;

public class ATMTester {

	public static void main(String[] args) {

		GreenLabelATM greenatm=new GreenLabelATM();
		greenatm.insertCard();
		greenatm.Password();
		greenatm.enterMoney();
		greenatm.moneyTransfer();
		
		System.out.println("---------------------------");
		
		OrangeLabelATM orangeatm=new OrangeLabelATM();
		orangeatm.insertCard();
		orangeatm.Password();
		orangeatm.enterMoney();
		orangeatm.moneyTransfer();
	}

}
