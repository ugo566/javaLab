package sec01.exam01;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = (Car) fe;
		//car.water();
		fe2 = (FireEngine) car;
		fe2.water();
		

	}

}

class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("ºÎ¸ªºÎ¸ª");
	}
	
	void stop() {
		System.out.println("¸ØÃç!");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("Â÷°¡¿î¹°À» ½÷¶ó!!!!");
	}
}

