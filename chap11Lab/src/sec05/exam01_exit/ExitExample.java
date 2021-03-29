package sec05.exam01_exit;

public class ExitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//보안관리자 설정
		System.setSecurityManager(new SecurityManager() {

		});
		System.out.println("프로그램 종료합니다");
		System.exit(5);
		System.out.println("프로그램 종료");
	}

}
