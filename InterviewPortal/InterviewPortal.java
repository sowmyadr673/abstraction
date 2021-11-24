package com.xworkz.Abstraction.InterviewPortal;

abstract public class InterviewPortal {

	public void login(String userName, String password) {
		System.out.println("Login successfull");
	}

	public void logout() {
		System.out.println("logout successfull");
	}

	public void viewResult() {
		System.out.println("Scored %");
	}

	public void interviewSchedule() {
		System.out.println("View schedule");
	}

	abstract public void prepareQuestionSet();

	abstract public void takeTest();

}
