package sec10.exam01_static_member;

public class CalculatorExmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result1 =  Calculator.pi;
		int result2 = Calculator.plus(20, 50);
		
		Calculator myCal = new Calculator();
		int result3 = myCal.minus(60, 30);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		

	}

}
