package sec08.exam04_overloading;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator myCal = new Calculator();
		
		//정사각형 구하기
		double result1 = myCal.areaRectangle(10);
		
		//직사각형 구하기
		double result2 = myCal.areaRecthngle(10, 20);
		
		System.out.println("정사각형 넓이 : " + result1);
		System.out.println("직사각형 넓이 : " + result2);
		
	}

}
