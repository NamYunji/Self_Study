package _0104.com.oop.person.run;

import _0104.com.oop.person.controller.PersonController;

public class Run {
	public static void main(String[] args) {
		PersonController pc = new PersonController();
		pc.input();
		pc.printSum();
		pc.output();
	}

}