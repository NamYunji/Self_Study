package _0104.com.oop.student.run;

import _0104.com.oop.student.controller.StudentManager;

public class Run {
	public static void main(String[] args) {
		StudentManager manager = new StudentManager();
		manager.insertStudentData();
		manager.printStudentData();
	}
}
