package sec03.eaxm01_name_inplement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���ú��� rc�� RemoteControl�������̽� Ÿ���̴�.
		RemoteControl rc;
		rc = new Television(); // �������̽� ���� = ������ü;
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		System.out.println();
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		

	}

}
