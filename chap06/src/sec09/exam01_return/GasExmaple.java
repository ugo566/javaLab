package sec09.exam01_return;

public class GasExmaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gas g = new Gas();
		
		g.setGas(5);
		
		boolean gasState = g.skGas();
		if(gasState) {
			System.out.println("����մϴ�");
			g.run();
		} 
		
		if(g.skGas()) {
			System.out.println("������ ������ �ʿ䰡 �����ϴ�.");
		} else {
			System.out.println("������ �����ϼ���");
		}
		
		
		
	}

}
