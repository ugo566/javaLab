package sec08.exam01_method_declaration;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator myCalc =  new Calculator();
		
		 myCalc.powerOn();
		 
		 int result1 = myCalc.plus(5, 6);
		 System.out.println(result1);
		 
		 double result2 = myCalc.divide(50, 10);
		 System.out.println(result2);
		 myCalc.powerOff();

	}

}
