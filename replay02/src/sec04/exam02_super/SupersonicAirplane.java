package sec04.exam02_super;

public class SupersonicAirplane extends Airplane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	public int flyMode = NORMAL;
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("������ �����մϴ�");
		} else {
			super.fly(); //�θ��� fly()�޼ҵ�
		}
	}
	
	
	

}
