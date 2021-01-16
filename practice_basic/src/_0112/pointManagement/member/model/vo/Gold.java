package _0112.pointManagement.member.model.vo;

import _0112.pointManagement.member.controller.Member;

public class Gold extends Member{

	public Gold(String name, String grade, int point) {
		super(name, grade, point);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double interest(int point) {
		// TODO Auto-generated method stub
		return point*0.05;
	}
}
