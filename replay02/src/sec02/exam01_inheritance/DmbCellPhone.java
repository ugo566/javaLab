package sec02.exam01_inheritance;

public class DmbCellPhone extends Cellphone {
	//�ʵ�
	int channel;
	
	//������
	 DmbCellPhone(String model, String color, int channel) {
		this.model = model; //��ӹ��� �ʵ�
		this.color = color; //��ӹ��� �ʵ�
		this.channel = channel; // �ڽ��� �ʵ�
	}
	
	//�޼ҵ�
	 void turnOnDmb() {
		 System.out.println("ä��" + channel + "�� DMB��� ������ �����մϴ�");
	 }
	 void changeChannelDmb(int channel) {
		 this.channel = channel;
		 System.out.println("ä��" + channel + "������ �ٲߴϴ�");
	 }
	 void trunOffDmb() {
		 System.out.println("DMB��� ������ ����ϴ�");
	 }
	 

}
