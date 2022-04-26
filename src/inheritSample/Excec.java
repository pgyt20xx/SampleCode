package inheritSample;

public class Excec {

	public static void main(String[] args) {
	
//		Prius car = new Prius();
//		Car car = new Crown();
		
		String carName = "Crown";
		
		Car car = null;
		
		if (carName == "Prius") {
			car = new Prius();
		} else {
			car = new Crown();
		}

		car.drive();
		car.turnLeft();
		car.turnRight();
		car.stop();
	}

}
