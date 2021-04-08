package sec02.eaxm02;

class Mpoint {
	int x;
	int y;
}

class  Circlel {
	Mpoint p = new Mpoint();
	int r;
}

public class Poham {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circlel c= new Circlel();
		c.p.x = 1;
		c.r = 3;
		System.out.println(c.p.x);
		System.out.println(c.p.y);
		System.out.println(c.r);
		

	}

}
