package _0110.member__.vo;

public class Gold extends Member {

	
	public Gold() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gold(String name, String grade, int point) {
		super(name, grade, point);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getBonus() {
		return this.getPoint()*0.05;
	}
	
	

}
