package _0102.object.pizza;

/*
 - Pizza 클래스: 다음 세 개의 필드를 지님
  브랜드(문자열)
  지름(실수형)
  가격(정수형)
 */

public class Pizza {


	// 기본생성자
	public Pizza() {
		super();
	}

	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public double getDiameter() {
		return diameter;
	}
	
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

	/////////////////////////////////////////////////////////////////
	//필드값은 소멸되지 안흠 but parameter는 메소드나 생성자가 끝나면 사라짐(일회용)
	//필드를 써주는 이유 : 값을 저장하기 위해
	private String brand;
	private double diameter;
	private int price;
	
	//parameter생성자가 정의된 경우
	//남윤지 천재를 말해주는 것이 기본값인 기계...왜인지 기분이 안좋네..
	//추가적인 특별한 기능을 할 수 있는 기계를 만들어준 기계 : parameter 생성자
	//parameter생성자를 만들어주면, 기본생성자를 만들어주지 않음
	
	// parameter생성자
	public Pizza(String brand, double diameter, int price) {
		super();
		this.brand = brand;
		this.diameter = diameter;
		this.price = price;
	}


	public Pizza(String brand) {
		super();
		this.brand = brand;
	}
	
	

	public Pizza(String brand, double diameter) {
		super();
		this.brand = brand;
		this.diameter = diameter;
	}

	@Override
	public String toString() {
		return "brand = " + brand + "\ndiameter = " + diameter + "\nprice = " + price;
	}
	
}
