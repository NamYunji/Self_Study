package _0110.member__.vo;

public class Silver extends Member {

	public Silver() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Silver(String name, String grade, int point) {
		super(name, grade, point);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getBonus() {
		return this.getPoint() * 0.02;
	}



}
