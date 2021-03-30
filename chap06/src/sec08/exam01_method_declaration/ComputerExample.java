package sec08.exam01_method_declaration;

public class ComputerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer myCom = new Computer();

		int[] values1 = { 1, 2, 3 };
		int result1 = myCom.sum1(values1);
		System.out.println(result1);
		
		int[] values2 = {1, 2, 3, 4, 5};
		int result2 = myCom.sum2(values2);
		System.out.println(result2);
	}

}
