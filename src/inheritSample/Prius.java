package inheritSample;

public class Prius extends Car {

	Prius() {
		System.out.println("プリウスです。");
	}

	@Override
	public void drive() {
		System.out.println("プリウスがガソリン半分で走ります。");
	}
	
}
