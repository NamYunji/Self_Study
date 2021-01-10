package _0110.member__.vo;

public class Vip extends Member {

	
	
	public Vip() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vip(String name, String grade, int point) {
		super(name, grade, point);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getBonus() {
		return this.getPoint()*0.1;
	}

}
