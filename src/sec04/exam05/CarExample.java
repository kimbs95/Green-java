package sec04.exam05;

public class CarExample {

	public static void main(String[] args) {
		Car myCar= new Car();
		myCar.keyTurnOn();
		myCar.runt();
		int speed = myCar.getSpeed();
		System.out.println("현재속도 :"+speed+"km/h");
	}

}
