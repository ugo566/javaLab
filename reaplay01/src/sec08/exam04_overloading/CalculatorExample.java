package sec08.exam04_overloading;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator myCal = new Calculator();
		
		//���簢�� ���ϱ�
		double result1 = myCal.areaRectangle(10);
		
		//���簢�� ���ϱ�
		double result2 = myCal.areaRecthngle(10, 20);
		
		System.out.println("���簢�� ���� : " + result1);
		System.out.println("���簢�� ���� : " + result2);
		
	}

}
