package sec09.exam01_return;

public class Gas {
	private static final int L = 0;
	//�ʵ�
	int gas;
	//������
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean skGas() {
		if(gas == 0) {
			System.out.println("gas�� �����ϴ�");
			return false;
		} else {
			System.out.println("gas�� �ֽ��ϴ�");
			return true;
		}
	}
	
	
	//�޼ҵ�

	
	public void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("�޸��ϴ� ���� �����ܷ� : " + gas);
				gas = --gas;
			} else {
				System.out.println("����ϴ� ���� �����ܷ� :" + gas);
				return;
			}
		}
	}
	
}
