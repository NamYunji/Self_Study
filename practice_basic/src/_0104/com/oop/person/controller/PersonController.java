package _0104.com.oop.person.controller;

import java.util.Scanner;

import _0104.com.oop.person.model.Person;

public class PersonController {
	Person[] ps = new Person[5];
	Scanner scanner = new Scanner(System.in);

	public void input() {
		for (int i = 0; i < ps.length; i++) {
			System.out.println("이름, 나이, 키, 몸무게, 재산");
			String name = scanner.next();
			int age = scanner.nextInt();
			double height = scanner.nextDouble();
			double weight = scanner.nextDouble();
			int property = scanner.nextInt();
			ps[i] = new Person(name, age, height, weight, property);
		}
	}
	
	public void printSum() {
		int sumOfAge = 0;
		double sumOfHeight = 0.00;
		double sumOfWeight = 0.00;
		int sumOfProperty = 0;
		for (int i = 0; i < ps.length; i++) {
			sumOfAge += ps[i].getAge();
			sumOfHeight += ps[i].getHeight();
			sumOfWeight += ps[i].getWeight();
			sumOfProperty += ps[i].getProperty();
		}
		int avgOfAge = sumOfAge/ps.length;
		Double avgOfHeight = sumOfHeight/ps.length;
		Double avgOfWeight = sumOfWeight/ps.length;
		int avgOfProperty = sumOfProperty/ps.length;
		System.out.println("평균 나이는 " + avgOfAge);
		System.out.println("평균 키는 " + avgOfHeight);
		System.out.println("평균 몸무게는 " + avgOfWeight);
		System.out.println("평균 재산은 " + avgOfProperty);
	}
	
	public void output() {
		for (int i = 0; i < ps.length; i++) {
			ps[i].information();
		}
		
	}
}
