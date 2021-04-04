package sec01.exam03_abstract_method;

public interface RemoteControl {
	//상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상메소드
	abstract void TurnOn(); //중괄호가 없고 바로 괄호, 세미콜론으로 마무리
	void turnOff(); //인터페이스는 abstract안써도 된다 자동으로 생성
	void setVolume(int volume);
	

}
