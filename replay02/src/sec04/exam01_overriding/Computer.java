package sec04.exam01_overriding;

public class Computer extends Calculator {
	
	//������̼� : �����Ϸ����� �ڵ��� ������ ��û�Ѵ�.
	@Override
	double areaCircle(double r) {
		System.out.println("Coputer��ü�� areaCircle()����");
		return Math.PI*r*r;
	}
	
//	@Override
//	double areCircle(double r) {
//		return 1.0;
//	}
	
	
}
