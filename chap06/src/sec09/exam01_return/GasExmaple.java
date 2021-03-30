package sec09.exam01_return;

public class GasExmaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gas g = new Gas();
		
		g.setGas(5);
		
		boolean gasState = g.skGas();
		if(gasState) {
			System.out.println("출발합니다");
			g.run();
		} 
		
		if(g.skGas()) {
			System.out.println("가스를 주입할 필요가 없습니다.");
		} else {
			System.out.println("가스를 주입하세요");
		}
		
		
		
	}

}
