package sec03.eaxm01_name_inplement_class;

public interface RemoteControl {
	int MAX_VOLUME = 0;
	int MIN_VOLUME = 0;
	
	//상수
	//추상클래스
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//디폴트메소드
	default void setmute(boolean mute) {
		if(mute) {
			System.out.println("무음처리합니다");
		} else {
			System.out.println("무음해제합ㅂ니다");
		}
	}
	
	//정적메소드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}

}
