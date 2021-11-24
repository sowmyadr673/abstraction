package com.xworkz.Abstraction.InterviewPortal;


public class InterviewTester {

	public static void main(String[] args) {

		InfosysInterviewPortal infosys = new InfosysInterviewPortal();
		infosys.login("sowmya", "sow123");
		infosys.interviewSchedule();
		infosys.prepareQuestionSet();
		infosys.takeTest();
		infosys.viewResult();
		infosys.logout();
		
		System.out.println("------------------------");
		
		WiproInterviewPortal wipro=new WiproInterviewPortal();
		wipro.login("sowmya", "sow123");
		wipro.interviewSchedule();
		wipro.prepareQuestionSet();
		wipro.takeTest();
		wipro.viewResult();
		wipro.logout();
	}
	}


