package sec01.exam01;

public class Ex01 {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
		FireEngine fe = new FireEngine();
		Car car = (Car) fe;
		
		
		
		


	}

}

class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("�θ��θ�");
	}
	
	void stop() {
		System.out.println("����!");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("������� ����!!!!");
	}
}

