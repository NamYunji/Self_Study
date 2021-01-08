package _0104.com.oop.student.controller;

import java.util.Scanner;

import _0104.com.oop.student.model.vo.Student;

public class StudentManager {

	private Student[] arr = new Student[3];
	Scanner scanner = new Scanner(System.in);

	public void insertStudentData() {
		for (int i = 0; i < arr.length; i++) {

			System.out.println("학생정보 입력 : (학년, 반, 학번, 이름 순으로 입력)");
			int grade = scanner.nextInt();
			int classroom = scanner.nextInt();
			int stdtNo = scanner.nextInt();
			scanner.nextLine();
			String name = scanner.nextLine();

			arr[i] = new Student(grade, classroom, stdtNo, name);
		}

	}

	public void printStudentData() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].information());
			
		}

	}

}
