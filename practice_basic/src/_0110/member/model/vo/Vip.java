package _0110.member.model.vo;

public class Vip extends Member{
	
	
	
	public Vip(String name, String grade, int point) {
		super(name, grade, point);
		// TODO Auto-generated constructor stub
	}

	public double bonusPoint() {
		double bonuspoint = super.getPoint()*0.1; 
		return bonuspoint;
	}

}
