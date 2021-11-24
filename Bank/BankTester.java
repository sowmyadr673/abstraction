package com.xworkz.Abstraction.Bank;

public class BankTester {

	public static void main(String[] args) {

		CanaraBank canara = new CanaraBank();
		canara.deposite();
		canara.withdrawal();
		canara.NEFTmoney();
		canara.interestRate();

		System.out.println("--------------------------");

		HDFC hdfc = new HDFC();
		hdfc.deposite();
		hdfc.withdrawal();
		hdfc.NEFTmoney();
		hdfc.interestRate();
	}

}
