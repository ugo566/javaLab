package sec08.exam01_method_declaration;

public class Calculator {
	//필드
	
	//생성자
	
	//메소드
	void powerOn() {
		System.out.println("전원이 켜집니다");
	}
	
	int plus(int x, int y) {
		int result1 = x + y;
		return result1;
	}
	
	double divide(int x, int y) {
		double result2 = (double)x / (double) y;
		return result2;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다");
	}
	
	
}
