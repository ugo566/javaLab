package sec02.exam01_inheritance;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DmbCellPhone��ü����
		DmbCellPhone dmlCellPhone = new DmbCellPhone("�ڹ���", "����", 10);
		
		//Cellphone���� ���� ��� ���� �ʵ�
		System.out.println("�� : " + dmlCellPhone.model);
		System.out.println("���� : " + dmlCellPhone.color);
		
		//DmbCellPhone�� �ʵ�
		System.out.println("ä�� : " + dmlCellPhone.channel);
		
		//Cellphone���κ��� ��ӹ��� �żҵ� ȣǮ
		dmlCellPhone.powerOn();
		dmlCellPhone.bell();
		dmlCellPhone.sendVoice("��������");
		dmlCellPhone.recieverVoice("�ȳ��ϼ���");
		dmlCellPhone.sendVoice("������ħ�Դϴ�.");
		dmlCellPhone.hangUp();
		
		//DmbCellPhone�� �޼ҵ� ȣ��
		dmlCellPhone.turnOnDmb();
		dmlCellPhone.changeChannelDmb(12);
		dmlCellPhone.trunOffDmb();
		
	}

}
