package sec02.exam01_inheritance;

public class Cellphone {
	//�ʵ�
	public String model;
	public String color;
	
	//������
	
	
	//�޼ҵ�
	void powerOn() {
		System.out.println("������ �մϴ�");
	}
	
	void powerOff() {
		System.out.println("������ ���ϴ�");
	}
	
	void bell() {
		System.out.println("���� �︳�ϴ�");
	}
	
	void sendVoice(String message) {
		System.out.println("���� : " + message);
	}
	
	void recieverVoice(String message) {
		System.out.println("���� : " + message);
	}
	
	void hangUp() {
		System.out.println("��ȭ�� �����ϴ�");
	}

}