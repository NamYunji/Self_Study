package _0112.pointManagement.member.controller;

public class MemberManager {
	

	Member[] m = new Member[40];
	
	int i = 0;
	public void insertMember(Member m) {
		this.m[i] = m;
		i++;
	
	}
	
	public void printData() {
		for (int i = 0; i < this.i; i++) {
			System.out.println("이름 : " + m[i].getName() + ", 등급 : " + m[i].getGrade() + ", 포인트 : " +  m[i].getPoint() +
					", 포인트이자 : " + m[i].interest(m[i].getPoint()));
		}
	}
	
	

}
