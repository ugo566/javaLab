package constructor;

public class Car {
	//필드 = iv(인스턴스 변수)
	String color; //색상
	String gearType; //변속지 종류
	int door; //문의 갯수
	
	//생성자
	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	
	
}
