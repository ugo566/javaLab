package ������;

public class Car {
	//�ʵ�
	String model;
	String color;
	int number;
	int speed;
	
	//������

	
	
	//�żҵ�
	public void run(int speed) {
		if(speed == 0) {
			System.out.println("���� ������ϴ�");
		} else {
			System.out.println("����" + speed + "km/h�� �޸������Դϴ�");
		}
	}
	
	
}
