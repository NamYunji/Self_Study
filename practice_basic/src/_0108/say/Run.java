package _0108.say;

//5.실행클래스 Run
//모든객체는 다형성을 활용하여 생성할것
//1) Person객체 생성
//2) Dog 객체 생성
//3) Cat객체 생성
public class Run {
	public static void main(String[] args) {
		
		Mic p = new Person();
		Mic d = new Dog();
		Mic c = new Cat();

		p.say();
		d.say();
		c.say();

	}

}
