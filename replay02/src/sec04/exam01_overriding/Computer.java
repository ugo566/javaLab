package sec04.exam01_overriding;

public class Computer extends Calculator {
	
	//어노테이션 : 컴파일러에게 코드의 검증을 요청한다.
	@Override
	double areaCircle(double r) {
		System.out.println("Coputer객체의 areaCircle()실행");
		return Math.PI*r*r;
	}
	
//	@Override
//	double areCircle(double r) {
//		return 1.0;
//	}
	
	
}
