package sec02.eaxm02;
class Point5 {
	int x;
	int y;
	public String toString() {
		return "x:"+x+",y:"+y;
	}
}
class Point3 extends Point5 {
	int z;
	
	String getLocation() {
		return "x:"+x+",y:"+y+",z:" +z;
	}
}

public class OverrideTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point5 p5 = new Point5();
		p5.x = 3;
		p5.y = 5;
		System.out.println(p5.toString());
		
	}

}
