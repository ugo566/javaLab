package 생성자;

public class Car {
	//필드
	String model;
	String color;
	int number;
	int speed;
	
	//생성자

	
	
	//매소드
	public void run(int speed) {
		if(speed == 0) {
			System.out.println("차가 멈췄습니다");
		} else {
			System.out.println("차가" + speed + "km/h로 달리는중입니다");
		}
	}
	
	
}
