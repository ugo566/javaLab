package constructor;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car("white", "auto", 4);
		System.out.println(c.color);
		System.out.println(c.gearType);
		System.out.println(c.door);
		Car c1 = new Car("red", "auto", 6);
		System.out.println();
		System.out.println(c.color);
		System.out.println(c1.gearType);
		System.out.println(c1.door);
	}

}
