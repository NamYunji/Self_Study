package _0110.member__.vo;

public class Vvip extends Member {
	
	
	public Vvip() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vvip(String name, String grade, int point) {
		super(name, grade, point);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getBonus() {
		return this.getPoint()*0.15;
	}
	
	

}
