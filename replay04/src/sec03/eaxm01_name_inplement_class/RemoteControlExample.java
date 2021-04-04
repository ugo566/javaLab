package sec03.eaxm01_name_inplement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//로컬변수 rc는 RemoteControl인터페이스 타입이다.
		RemoteControl rc;
		rc = new Television(); // 인터페이스 변수 = 구현객체;
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
