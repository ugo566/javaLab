package sec02.eaxm02;

class Gugudan {
	void good(int dan) {
		for(int i=1; i<=9; i++) {
			System.out.println(dan + " * " + i + " =" + dan * i );
			
		}
		
	}
}


public class GugudanEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gugudan go = new Gugudan();
		go.good(5);
		
	}

}
