package com.prankit.designpattern.observer;

public class Main {

	
	public static void main(String[] args) {
		PostOffice postOffice =  new PostOffice();
		Person prk = new Person("prk1");
		Person john = new Person("john");
		
		Mail m = new Mail(prk.name, "How are you", "Mahakali");
		
		postOffice.attach(john);
		postOffice.attach(prk);
		
		postOffice.addMail(m);
		
	}
	
	
	
}
