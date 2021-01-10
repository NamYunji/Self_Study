package _0110.member.controller;

import _0110.member.model.vo.Member;

/*
Control 클래스 이름 : memer.controller.MemberManager
MemberManager 멤버변수 Member[] : Silver 등급, Gold 등급등 회원을 최대 40명 관리할수 있는  객체배열, 인덱스 추가
 */
public class MemberManager {

	Member[] m = new Member[40];
	int i = 0;
	
	public void insertMember(Member m) {

		this.m[i] = m;
		i++;
		
	}
	
	public void printData() {
		for (int i = 0; i < this.i; i++) {
			System.out.println("성명 : " + m[i].getName() + ", 등급 : "
					+ m[i].getGrade() + ", 총포인트 : " + (m[i].getPoint() + m[i].bonusPoint()));			
		}
		
	}


}
