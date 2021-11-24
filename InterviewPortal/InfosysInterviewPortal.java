package com.xworkz.Abstraction.InterviewPortal;

public class InfosysInterviewPortal extends InterviewPortal {

	public InfosysInterviewPortal() {
		System.out.println("welcome to Infosys Interview Portal");
	}

	@Override
	public void prepareQuestionSet() {
		System.out.println("Multiple choice question");
	}

	@Override
	public void takeTest() {
		System.out.println("Click any one option");
	}

}