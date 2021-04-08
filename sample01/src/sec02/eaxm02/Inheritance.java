package sec02.eaxm02;

class Point {
	int x;
	int y;
}

class Point3D extends Point{
	int x;
	int y;
	int z;
}

class Circle {
	int x;
	int y;
	int r;
	Point1 p = new Point1();
}

class Point1 {
	int a;
	
}

 


public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3D p3 = new Point3D();
		p3.x = 28;
		
		Circle c = new Circle();
		Point1 p1 = new Point1();
		int a = 10;
		System.out.println(c.p);
		
		

	}

}
