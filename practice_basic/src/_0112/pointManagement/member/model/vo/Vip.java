package _0112.pointManagement.member.model.vo;

import _0112.pointManagement.member.controller.Member;

public class Vip extends Member{

	public Vip(String name, String grade, int point) {
		super(name, grade, point);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double interest(int point) {
		// TODO Auto-generated method stub
		return point*0.1;
	}
}
