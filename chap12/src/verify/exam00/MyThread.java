package verify.exam00;

//ThreadŬ������ ����� ���� Ŭ������ ����
//�ۼ���ġ
public class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {
			System.out.print("S");
			}
	}
	

}
