package sec01.exam03_abstract_method;

public interface RemoteControl {
	//���
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//�߻�޼ҵ�
	abstract void TurnOn(); //�߰�ȣ�� ���� �ٷ� ��ȣ, �����ݷ����� ������
	void turnOff(); //�������̽��� abstract�Ƚᵵ �ȴ� �ڵ����� ����
	void setVolume(int volume);
	

}
