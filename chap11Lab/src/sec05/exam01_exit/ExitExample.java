package sec05.exam01_exit;

public class ExitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���Ȱ����� ����
		System.setSecurityManager(new SecurityManager() {

		});
		System.out.println("���α׷� �����մϴ�");
		System.exit(5);
		System.out.println("���α׷� ����");
	}

}
