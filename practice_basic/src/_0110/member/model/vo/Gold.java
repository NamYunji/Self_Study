package _0110.member.model.vo;

public class Gold extends Member{
	


	public Gold(String name, String grade, int point) {
		super(name, grade, point);
		// TODO Auto-generated constructor stub
	}

	public double bonusPoint() {
		double bonuspoint = super.getPoint()*0.05; 
		return bonuspoint;
	}
}
