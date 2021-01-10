package _0110.member__.controller;


import _0110.member__.vo.Member;

public class MemberManager {
	
	//필드
	private Member[] m = new Member[40];
	private int i = 0;
	
	//배열에 추가해준 메소드
	public void insertMember(Member m) {
		this.m[i] = m;
		i++;
	}
	
	//배열을 전체출력해주는 메소드
	public void printData() {
		for (int i = 0; i < this.i; i++) {
			System.out.println("이름 : " + m[i].getName() + "등급 : " + m[i].getGrade() + 
					"포인트 : " + m[i].getPoint() + "이자 포인트 : " + m[i].getBonus());
		}
	}

}
