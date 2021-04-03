package sec11.exam01_final;

public class PersonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("12345-1234567", "계백");
		
		 System.out.println(p1.nation);
		 System.out.println(p1.ssn);
		 System.out.println(p1.name);
		 
		 //p1.nation = "usa"; final이 있어서 수정 불가능
		 //p1.ssn = "78945-789461"; final이 있어서 수정 불가능
		 p1.name = "을지문덕";
		 System.out.println(p1.name);

	}

}
