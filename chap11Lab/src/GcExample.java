import sec05.exam02_gc.Employee;

public class GcExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp;
		
		emp =new Employee(1);
		emp = null;
		emp = new Employee(2);
		emp = new Employee(3);
		
		System.out.print("emp�� ���������� �����ϴ� �����ȣ");
		System.out.println(emp.eno);
		System.gc();
	}

}
