package sec09.exam01_return;

public class Gas {
	private static final int L = 0;
	//필드
	int gas;
	//생성자
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean skGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다");
			return false;
		} else {
			System.out.println("gas가 있습니다");
			return true;
		}
	}
	
	
	//메소드

	
	public void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다 남은 가스잔량 : " + gas);
				gas = --gas;
			} else {
				System.out.println("멈춥니다 남은 가스잔량 :" + gas);
				return;
			}
		}
	}
	
}
