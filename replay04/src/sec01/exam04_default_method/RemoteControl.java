package sec01.exam04_default_method;

public interface RemoteControl {
	int MAX_VOLUME = 0;
	int MIN_VOLUME = 0;
	
	//���
	//�߻�Ŭ����
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//����Ʈ�޼ҵ�
	default void setmute(boolean mute) {
		if(mute) {
			System.out.println("����ó���մϴ�");
		} else {
			System.out.println("���������դ��ϴ�");
		}
	}
	
	//�����޼ҵ�
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}

}
