package sec05.exam02_final_method;

public class SportsCar extends Car {

	@Override //stop�� final�̿��� �����ǰ� �ȵȴ�
	public void speedUp() {
		speed += 10;
	}
	
	//stop�� final�̿��� �����ǰ� �ȵȴ�
	//override cannot be resolved to a type
	/*
	@override
	public void stop() {
		System.out.println("������ī�� ����");
		speed = 0;
	}
	*/
	

}
